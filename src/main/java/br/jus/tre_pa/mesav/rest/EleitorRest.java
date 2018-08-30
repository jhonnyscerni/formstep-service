package br.jus.tre_pa.mesav.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tre_pa.mesav.domain.Eleitor;
import br.jus.tre_pa.mesav.exception.TituloEleitoralException;
import br.jus.tre_pa.mesav.service.EleitorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/eleitores")
public class EleitorRest {
	
	
	@Autowired
	private EleitorService eleitorService;
	

	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("{tituloEleitoral}")
	public ResponseEntity<Eleitor> buscarPeloTituloEleitoral(@PathVariable String tituloEleitoral) {
		Eleitor eleitor = eleitorService.buscarEleitor(tituloEleitoral);
		return eleitor != null ? ResponseEntity.ok(eleitor) : ResponseEntity.notFound().build();
	}
	
	@ExceptionHandler(TituloEleitoralException.class)
	public ResponseEntity<Object> handlerTituloEleitoralException(
			TituloEleitoralException ex) {
		String mensagemUsuario = messageSource.getMessage("titulo.eleitoral", null, LocaleContextHolder.getLocale());
		return ResponseEntity.badRequest().body(mensagemUsuario);
	}

}
