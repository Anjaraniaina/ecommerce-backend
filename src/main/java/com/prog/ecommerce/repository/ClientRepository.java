package com.prog.ecommerce.repository;

import com.prog.ecommerce.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client getByEmail(String email);
    Client getById(Long id);
    Client getByFirstName(String firstname);
    Optional<Client> findByEmail(String email);

}
