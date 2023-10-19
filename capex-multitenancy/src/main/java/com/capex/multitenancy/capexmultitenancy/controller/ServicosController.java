package com.capex.multitenancy.capexmultitenancy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capex.multitenancy.capexmultitenancy.model.Servicos;
import com.capex.multitenancy.capexmultitenancy.repository.ServicosRepository;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

	@Autowired
	private ServicosRepository repository;

	@GetMapping
	public List<Servicos> listar() {
		return repository.findAll();
	}

	@PostMapping
	public Servicos save(@RequestBody Servicos servicos) {
		return repository.save(servicos);
	}

}
