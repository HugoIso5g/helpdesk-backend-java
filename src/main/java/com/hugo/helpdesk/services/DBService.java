package com.hugo.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.helpdesk.domain.Chamado;
import com.hugo.helpdesk.domain.Cliente;
import com.hugo.helpdesk.domain.Tecnico;
import com.hugo.helpdesk.domain.enums.Perfil;
import com.hugo.helpdesk.domain.enums.Prioridade;
import com.hugo.helpdesk.domain.enums.Status;
import com.hugo.helpdesk.repository.ChamadoRepository;
import com.hugo.helpdesk.repository.ClienteRepository;
import com.hugo.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null,"Valdir Cezar","88143835375","valdir@mail.com","123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null,"Linus Torvalds","66168825355","torvalds@mail.com","123");
		
		Chamado c1 = new Chamado(null,Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 01","Primeiro Chamado",tec1,cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
