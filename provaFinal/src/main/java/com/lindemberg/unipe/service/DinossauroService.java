package com.lindemberg.unipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lindemberg.unipe.domain.Dinossauro;
import com.lindemberg.unipe.repository.DinossauroRepository;

@Service
public class DinossauroService {

	@Autowired
	private DinossauroRepository dinossauroRepository;
	
	//método salvar
	public Dinossauro salvar(Dinossauro dinossauro) {
		return dinossauroRepository.save(dinossauro);
	}
	//metodo deletar por id enviado
	public void deleteById(Long id) {
		dinossauroRepository.deleteById(id);
	}
	//metodo atualizar
	public Dinossauro update(Dinossauro dinossauro) {
		if(dinossauro!=null) {
		return dinossauroRepository.save(dinossauro);
	}
		throw new RuntimeException("ID precisar ser informado");
	}
	//metodo para listar
	public List<Dinossauro> listar(){
		return dinossauroRepository.findAll();
	}
	//metodo para listar por id
		public Dinossauro listarPorID(Long id){
			return dinossauroRepository.findById(id).get();
		}
	
	
}
