package br.jus.tre_pa.mesav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tre_pa.mesav.domain.Eleitor;
import br.jus.tre_pa.mesav.exception.TituloEleitoralException;
import br.jus.tre_pa.mesav.repository.EleitorRepository;


@Service
public class EleitorService {
	
	
	@Autowired
	private EleitorRepository eleitorRespository;
	
public Eleitor buscarEleitor(String tituloEleitoral) {
		
				
		Eleitor eleitorBuscar = eleitorRespository.findOne(tituloEleitoral);
		

		if (eleitorBuscar != null) {
		} else {
			throw new TituloEleitoralException();
		}
		
		return eleitorBuscar;

	}

}
