package br.com.comexport.contabilidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping
	public ResponseEntity<List<LancamentoContabil>> listarLancamentosContabeis(@RequestBody LancamentoContabil lancamentoContabil) {
		return new ResponseEntity<List<LancamentoContabil>>(lancamentoContabilService.listarLancamentosContabeis(lancamentoContabil), HttpStatus.OK);
	} 

}
