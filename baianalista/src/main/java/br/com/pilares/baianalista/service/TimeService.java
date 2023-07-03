package br.com.pilares.baianalista.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pilares.baianalista.model.dto.TimeDTO;
import br.com.pilares.baianalista.model.entities.Jogador;
import br.com.pilares.baianalista.model.entities.Time;
import br.com.pilares.baianalista.model.form.Timeform;
import br.com.pilares.baianalista.repositories.TimeRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TimeService {

	private TimeRepository timeRepository;
	private JogadorService jogadorService;
	
	public List<TimeDTO> buscarTodos(){
		return TimeDTO.convert(timeRepository.findAll());
	}

	public TimeDTO cadastrar(Timeform form) {
		Time time = timeRepository.save(new Time(form));;
		time.setJogadores(jogadorService.cadastrarTodos(form.getJogadores(), time));
		return new TimeDTO(time);
	}
	
}
