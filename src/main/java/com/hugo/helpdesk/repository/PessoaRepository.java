package com.hugo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {

}
