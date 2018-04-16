package br.com.comexport.contabilidade.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class StatsLancamentoContabil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private BigDecimal soma;
	private BigDecimal min;
	private BigDecimal max;
	private BigDecimal media;
	private BigDecimal qtde;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getSoma() {
		return soma;
	}
	public void setSoma(BigDecimal soma) {
		this.soma = soma;
	}
	public BigDecimal getMin() {
		return min;
	}
	public void setMin(BigDecimal min) {
		this.min = min;
	}
	public BigDecimal getMax() {
		return max;
	}
	public void setMax(BigDecimal max) {
		this.max = max;
	}
	public BigDecimal getMedia() {
		return media;
	}
	public void setMedia(BigDecimal media) {
		this.media = media;
	}
	public BigDecimal getQtde() {
		return qtde;
	}
	public void setQtde(BigDecimal qtde) {
		this.qtde = qtde;
	}

}
