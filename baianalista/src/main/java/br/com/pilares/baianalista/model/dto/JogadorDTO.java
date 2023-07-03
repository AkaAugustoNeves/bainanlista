package br.com.pilares.baianalista.model.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.pilares.baianalista.model.entities.Jogador;
import br.com.pilares.baianalista.model.enuns.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JogadorDTO {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String nick;
	private Role role;

	public JogadorDTO(Jogador jogador) {
		this.id = jogador.getId();
		this.nome = jogador.getNome();
		this.sobrenome = jogador.getSobrenome();
		this.nick = jogador.getNick();
		this.role = jogador.getRole();
	}
	
	public static List<JogadorDTO> convert(List<Jogador> jogadores){
		return jogadores.stream().map(JogadorDTO::new).collect(Collectors.toList());
	}
	
}