package br.com.comexport.contabilidade.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import br.com.comexport.contabilidade.entity.LancamentoContabil;

@Component
public interface LancamentoContabilRepository extends JpaRepository<LancamentoContabil, UUID>{
	
	List<LancamentoContabil> findByContaContabilAndDataAndValor(Long contaContabil, Date data, BigDecimal valor);

}
