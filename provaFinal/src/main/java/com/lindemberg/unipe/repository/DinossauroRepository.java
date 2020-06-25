package com.lindemberg.unipe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lindemberg.unipe.domain.Dinossauro;

@Repository
public interface DinossauroRepository extends JpaRepository<Dinossauro, Long>{

	//select de Dinossauro que tem o nome selecionado
		List<Dinossauro> findDinossauroByNome(String nome);
	
	
}
