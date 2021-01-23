package br.bootcamp.modulo1.desafiomodulo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.bootcamp.modulo1.desafiomodulo1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
