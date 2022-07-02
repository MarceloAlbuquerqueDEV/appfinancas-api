package com.mralbuquerque.appfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mralbuquerque.appfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
	

}
