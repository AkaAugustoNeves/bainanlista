package br.com.pilares.baianalista.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Time blueSide;
	@ManyToOne
	private Time redSide;
	@ManyToOne
	private Semana semana;
	@ManyToOne
	private Jogador mvp;
	@ManyToOne
	private Jogador bagre;
	private java.sql.Time horaInicio;
		
}