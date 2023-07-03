package br.com.pilares.baianalista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pilares.baianalista.model.entities.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

}
