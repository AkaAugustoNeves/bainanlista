package br.com.pilares.baianalista.model.form;

import br.com.pilares.baianalista.model.enuns.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JogadorForm {
	
	private String nome;
	private String nick;
	private String sobrenome;
	private Role role;

}
