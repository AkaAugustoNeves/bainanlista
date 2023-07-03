package br.com.pilares.baianalista.model.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Etapa {
	
	REGULAR,
	PLAYOFFS;
	
	private Long id;
	private String nome;
	
}