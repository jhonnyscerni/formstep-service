package br.jus.tre_pa.mesav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tre_pa.mesav.domain.Mesario;
import br.jus.tre_pa.mesav.repository.MesarioRepository;

@Service
public class MesarioService {
	
	
	@Autowired
	private MesarioRepository mesarioRespository;
	
	
	public Mesario buscarMesario(String tituloEleitoral) {
		
		
		Mesario mesarioBuscar = mesarioRespository.findOne(tituloEleitoral);
		

//		if (mesarioBuscar == null) {
//		} else {
//			throw new MesarioException();
//		}
		
		return mesarioBuscar;

	}

}
