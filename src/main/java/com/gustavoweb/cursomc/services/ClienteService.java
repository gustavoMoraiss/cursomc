package com.gustavoweb.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavoweb.cursomc.domain.Cliente;
import com.gustavoweb.cursomc.repositories.ClienteRepository;
import com.gustavoweb.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}

/*
 * public Categoria find(Integer id) { Optional<Categoria> obj =
 * repo.findById(id); return obj.orElseThrow(() -> new ObjectNotFoundException(
 * "Objeto não encontrado! Id: " + id + ", Tipo: " +
 * Categoria.class.getName())); }
 * 
 * public Categoria find(Integer id) { Optional<Categoria> obj =
 * repo.findById(id); if (obj == null) { throw new
 * ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " +
 * Categoria.class.getName()); } return obj; }
 */