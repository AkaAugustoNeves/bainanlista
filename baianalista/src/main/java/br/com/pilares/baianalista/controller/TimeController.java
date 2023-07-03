package br.com.pilares.baianalista.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pilares.baianalista.model.dto.TimeDTO;
import br.com.pilares.baianalista.model.form.Timeform;
import br.com.pilares.baianalista.service.TimeService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/time")
@AllArgsConstructor
public class TimeController {

	private TimeService timeService;
	
	@GetMapping
	public List<TimeDTO> buscarTodos(){
		return timeService.buscarTodos();
	}
	
	@PostMapping
	public TimeDTO cadastrar(@RequestBody Timeform form) {
		return timeService.cadastrar(form);		
	}
	
}
