package com.Projeto.AppRH.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Projeto.AppRH.models.Candidato;
import com.Projeto.AppRH.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, Long> {
	
	Iterable<Candidato>findByVaga(Vaga vaga);
	
	Candidato findByRg(String rg);
	
	Candidato findById(long id);
	
	List<Candidato>findByNomeCandidato(String nomeCandidato);
}
