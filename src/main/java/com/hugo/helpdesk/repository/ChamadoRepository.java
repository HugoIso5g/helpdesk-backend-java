package com.hugo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado,Integer> {

}
