package br.com.pilares.baianalista.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import br.com.pilares.baianalista.model.form.Timeform;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sigla;
	private String icone;
	@OneToMany(mappedBy = "time")
	private List<Jogador> jogadores = new ArrayList<>();
	
	public Time(Timeform form) {
		this.nome = form.getNome();
		this.sigla = form.getSigla();
		this.icone = form.getIcone();
	}
}
