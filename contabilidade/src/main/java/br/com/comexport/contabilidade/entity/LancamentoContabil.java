package br.com.comexport.contabilidade.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class LancamentoContabil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@NotNull
	@Column
	private Long contaContabil;
	
	@NotNull
	@Column
	@JsonFormat(pattern="yyyyMMdd", timezone="GMT-3")
	private Date data;
	
	@NotNull
	@Column
	private BigDecimal valor;
	
}
