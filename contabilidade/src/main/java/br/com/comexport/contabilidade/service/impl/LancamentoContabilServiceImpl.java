package br.com.comexport.contabilidade.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.comexport.contabilidade.entity.LancamentoContabil;
import br.com.comexport.contabilidade.repository.LancamentoContabilRepository;
import br.com.comexport.contabilidade.service.LancamentoContabilService;

@Service
public class LancamentoContabilServiceImpl implements LancamentoContabilService {
	
	@Autowired
	private LancamentoContabilRepository lancamentoContabilRepository;

	@Override
	public List<LancamentoContabil> listarLancamentosContabeis(LancamentoContabil lancamentoContabil) {
		return lancamentoContabilRepository.findByContaContabilAndDataAndValor(
			lancamentoContabil.getContaContabil(),
			lancamentoContabil.getData(),
			lancamentoContabil.getValor());
	}

}
