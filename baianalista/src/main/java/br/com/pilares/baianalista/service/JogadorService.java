package br.com.pilares.baianalista.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pilares.baianalista.model.entities.Jogador;
import br.com.pilares.baianalista.model.entities.Time;
import br.com.pilares.baianalista.model.form.JogadorForm;
import br.com.pilares.baianalista.repositories.JogadorRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JogadorService {

	private JogadorRepository jogadorRepository;
	
	public List<Jogador> cadastrarTodos(List<JogadorForm> jogadores, Time time){
		return jogadorRepository.saveAll(Jogador.converterListaDeJogadores(jogadores, time));
	}
	
}
