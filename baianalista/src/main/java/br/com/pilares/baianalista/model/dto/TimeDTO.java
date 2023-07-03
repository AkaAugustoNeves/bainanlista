package br.com.pilares.baianalista.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.pilares.baianalista.model.entities.Jogador;
import br.com.pilares.baianalista.model.entities.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TimeDTO {

	private Long id;
	private String nome;
	private String sigla;
	private List<JogadorDTO> jogadores = new ArrayList<>();
	
	public TimeDTO(Time time) {
		this.id = time.getId();
		this.nome = time.getNome();
		this.sigla = time.getSigla();
		this.jogadores = JogadorDTO.convert(time.getJogadores());
	}
	
	public static List<TimeDTO> convert(List<Time> times){
		return times.stream().map(TimeDTO::new).collect(Collectors.toList());
	}
	
}
