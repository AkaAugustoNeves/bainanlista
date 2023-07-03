package br.com.pilares.baianalista.model.form;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Timeform {

	private String nome;
	private String sigla;
	private String icone;
	private List<JogadorForm> jogadores = new ArrayList<>();
	
}
