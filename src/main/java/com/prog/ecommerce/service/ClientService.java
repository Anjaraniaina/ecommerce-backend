package com.prog.ecommerce.service;

import com.prog.ecommerce.model.Client;
import com.prog.ecommerce.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements UserDetailsService {

  private ClientRepository clientRepository;

  public Client getClientById(Long clientId) {
    return clientRepository.getById(clientId);
  }

  public List<Client> getClients(){
    return clientRepository.findAll();
  }

  public Client getByEmail(String email) {
    return clientRepository.getByEmail(email);
  }

  @Transactional
  public List<Client> saveAll(List<Client> clients) {
    return clientRepository.saveAll(clients);
  }

  @Transactional
  public void deleteById(Long clientId){
    clientRepository.deleteById(clientId);
  }

  private final static String USER_NOT_FOUND_MSG =
          "user with email %s not found";
  private final BCryptPasswordEncoder bCryptPasswordEncoder;
  @Override
  public UserDetails loadUserByUsername(String email)
          throws UsernameNotFoundException {
    return clientRepository.findByEmail(email)
            .orElseThrow(() ->
                    new UsernameNotFoundException(
                            String.format(USER_NOT_FOUND_MSG, email)));
  }

  public void signUpClient(Client client) {
    boolean userExists = clientRepository
            .findByEmail(client.getEmail())
            .isPresent();

    if (userExists) {
      throw new IllegalStateException("email already taken");
    }

    String encodedPassword = bCryptPasswordEncoder
            .encode(client.getPassword());

    client.setPassword(encodedPassword);

    clientRepository.save(client);
  }
}
