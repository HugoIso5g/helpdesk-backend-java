package com.hugo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico,Integer> {

}
