package br.com.comexport.contabilidade.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.comexport.contabilidade.entity.LancamentoContabil;

public interface LancamentoContabilService {

	List<LancamentoContabil> listarLancamentosContabeis(LancamentoContabil lancamentoContabil);
	
}
