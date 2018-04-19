package br.com.comexport.contabilidade.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode @ToString
public class StatsLancamentoContabil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private BigDecimal soma;
	
	@Getter @Setter
	private BigDecimal min;
	
	@Getter @Setter
	private BigDecimal max;
	
	@Getter @Setter
	private BigDecimal media;
	
	@Getter @Setter
	private BigDecimal qtde;
	
}
