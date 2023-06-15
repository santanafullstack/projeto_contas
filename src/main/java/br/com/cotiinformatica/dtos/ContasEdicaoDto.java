package br.com.cotiinformatica.dtos;

import lombok.Data;

@Data
public class ContasEdicaoDto {

	private Integer idConta;
	private String nome;
	private String valor;
	private String data;
	private String observacoes;
	private Integer idCategoria;

}
