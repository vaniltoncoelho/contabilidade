package br.com.comexport.contabilidade.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.comexport.contabilidade.entity.LancamentoContabil;
import br.com.comexport.contabilidade.helper.ContabilidadeConstantes;
import br.com.comexport.contabilidade.service.LancamentoContabilService;

@RestController
@RequestMapping(value = ContabilidadeConstantes.PREFIX_API_V1 + "lancamentos-contabeis")
public class LancamentoContabilController {
	
	@Autowired
	private LancamentoContabilService lancamentoContabilService;

	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LancamentoContabil> incluirLancamentoContabil(@RequestBody LancamentoContabil lancamentoContabil) {
		return new ResponseEntity<LancamentoContabil>(lancamentoContabilService.incluir(lancamentoContabil), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<LancamentoContabil>> listar(LancamentoContabil lancamentoContabil) {
		return new ResponseEntity<List<LancamentoContabil>>(lancamentoContabilService.listar(lancamentoContabil), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LancamentoContabil> carregar(@PathVariable("id") UUID id) {
		return new ResponseEntity<LancamentoContabil>(lancamentoContabilService.carregar(id), HttpStatus.OK);
	}

}
