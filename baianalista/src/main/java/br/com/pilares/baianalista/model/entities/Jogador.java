package br.com.pilares.baianalista.model.entities;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.pilares.baianalista.model.enuns.Role;
import br.com.pilares.baianalista.model.form.JogadorForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private String nick;
	private String foto;
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "role_id")
	private Role role;
	@ManyToOne
	private Time time;
	
	public Jogador(JogadorForm form, Time time) {
		this.nome = form.getNome();
		this.sobrenome = form.getSobrenome();
		this.nick = form.getNick();
		this.role = form.getRole();
		this.time = time;
	}
	
	public static List<Jogador> converterListaDeJogadores(List<JogadorForm> jogadores, Time time){
		return jogadores.stream().map(jogador -> new Jogador(jogador, time)).collect(Collectors.toList());
	}
	
}
