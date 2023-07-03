package br.com.pilares.baianalista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pilares.baianalista.model.entities.Time;

public interface TimeRepository extends JpaRepository<Time, Long>{

}
