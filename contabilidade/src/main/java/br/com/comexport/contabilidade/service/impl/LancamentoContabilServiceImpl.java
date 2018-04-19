package br.com.comexport.contabilidade.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

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
	public LancamentoContabil incluir(LancamentoContabil lancamentoContabil) {
		return lancamentoContabilRepository.save(lancamentoContabil);
	}
	
	@Override
	public List<LancamentoContabil> listar(LancamentoContabil lancamentoContabil) {
		
		if(Objects.isNull(lancamentoContabil.getContaContabil()) &&
				Objects.isNull(lancamentoContabil.getData()) &&
				Objects.isNull(lancamentoContabil.getValor())) {
			return lancamentoContabilRepository.findAll();
		} else
		
		
		return lancamentoContabilRepository.findByContaContabilAndDataAndValor(
			lancamentoContabil.getContaContabil(),
			lancamentoContabil.getData(),
			lancamentoContabil.getValor());
	}

	@Override
	public LancamentoContabil carregar(UUID id) {
		return lancamentoContabilRepository.getOne(id);
	}

}
