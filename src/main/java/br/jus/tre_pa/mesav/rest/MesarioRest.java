package br.jus.tre_pa.mesav.rest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tre_pa.mesav.domain.Mesario;
import br.jus.tre_pa.mesav.mail.Mailer;
import br.jus.tre_pa.mesav.repository.MesarioRepository;
import br.jus.tre_pa.mesav.service.MesarioService;

@RestController
@CrossOrigin("*")
@RequestMapping("/mesarios")
public class MesarioRest {

	@Autowired
	private MesarioRepository mesarioRepository;

	@Autowired
	private MesarioService mesarioService;

	@Autowired
	private MessageSource messageSource;

	@Autowired
	private Mailer mailer;

	@PostMapping
	public ResponseEntity<Mesario> criar(@Valid @RequestBody Mesario mesario, HttpServletResponse response) {
		mesario.setDataInscricao(LocalDate.now());
		Mesario mesarioSalvo = mesarioRepository.save(mesario);

		String template = "mail/mesario";

		Map<String, Object> variaveis = new HashMap<>();
		variaveis.put("mesario", mesarioSalvo);
		mailer.enviarEmail(mesarioSalvo.getEmailZe(), Arrays.asList(mesarioSalvo.getEmail()), "Confirmação de Inscrição", template,
				variaveis);

		return ResponseEntity.status(HttpStatus.CREATED).body(mesarioSalvo);
	}

	@GetMapping("{tituloEleitoral}")
	public ResponseEntity<Mesario> buscarPeloTituloEleitoral(@PathVariable String tituloEleitoral) {
		Mesario mesario = mesarioRepository.findOne(tituloEleitoral);
		return mesario != null ? ResponseEntity.ok(mesario) : ResponseEntity.notFound().build();
	}

	@GetMapping("/buscarMesarioExistente/{tituloEleitoral}")
	public ResponseEntity<Mesario> buscarMesario(@PathVariable String tituloEleitoral) {
		Mesario mesario = mesarioService.buscarMesario(tituloEleitoral);
		return mesario != null ? ResponseEntity.ok(mesario) : ResponseEntity.notFound().build();
	}

//	@ExceptionHandler(MesarioException.class)
//	public ResponseEntity<Object> handlerMesarioException(
//			MesarioException ex) {
//		String mensagemUsuario = messageSource.getMessage("mesario", null, LocaleContextHolder.getLocale());
//		return ResponseEntity.badRequest().body(mensagemUsuario);
//	}

}
