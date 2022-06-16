package com.hugo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
