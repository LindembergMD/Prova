package com.lindemberg.unipe.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lindemberg.unipe.domain.Dinossauro;
import com.lindemberg.unipe.service.DinossauroService;
import com.rodrigofujioka.dev.web.domain.Dinossauro;

@RestController
@RequestMapping("/api")
public class DinossauroRest {

	@Autowired
	private DinossauroService dinossauroService;
	
	//criar nova entrada
	@PostMapping("/dinossauro")
	public ResponseEntity<Dinossauro> salvar(@RequestBody @Valid Dinossauro dinossauro) {
		return ResponseEntity.ok(dinossauroService.salvar(dinossauro));
	}
	//atualizar detalhes na tabela
	@PutMapping("/dinossauro")
	public ResponseEntity<Dinossauro> update(@RequestBody @Valid Dinossauro dinossauro) {
		return ResponseEntity.ok(dinossauroService.update(dinossauro));
	}
	//listar dados de acordo com o id
	@GetMapping("/dinossauro/{id}")
	public ResponseEntity<Dinossauro> consultaPorId(@PathVariable Long id) {
		return ResponseEntity.ok(dinossauroService.listarPorID(id));
	}
	//listar todos os dados
	@GetMapping("/dinossauro")
	public ResponseEntity<List<Dinossauro>> listar() {
		return ResponseEntity.ok(dinossauroService.listar());
	}
	
}
