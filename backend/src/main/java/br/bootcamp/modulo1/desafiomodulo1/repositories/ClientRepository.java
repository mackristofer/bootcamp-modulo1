package br.bootcamp.modulo1.desafiomodulo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.bootcamp.modulo1.desafiomodulo1.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
