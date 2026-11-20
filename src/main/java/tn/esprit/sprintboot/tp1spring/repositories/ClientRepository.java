package tn.esprit.sprintboot.tp1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sprintboot.tp1spring.domain.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
