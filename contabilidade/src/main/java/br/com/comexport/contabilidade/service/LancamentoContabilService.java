package br.com.comexport.contabilidade.service;

import java.util.List;
import java.util.UUID;

import br.com.comexport.contabilidade.entity.LancamentoContabil;

public interface LancamentoContabilService {

	LancamentoContabil incluir(LancamentoContabil lancamentoContabil);
	
	List<LancamentoContabil> listar(LancamentoContabil lancamentoContabil);
	
	LancamentoContabil carregar(UUID id);
	
}
