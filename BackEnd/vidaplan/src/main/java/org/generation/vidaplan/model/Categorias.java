package org.generation.vidaplan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categorias {
		
	@Id
	@GeneratedValue
	private Long id;
	@NotBlank(message = "O campo tipo é obrigatorio!")
	@Size(min = 3, max = 20, message = "O atributo tipo deve conter no minimo 03 caracteres")
	public String tipo;
	@NotBlank(message = "O campo região é obrigatorio!")
	@Size(min = 3, max = 15, message = "O atributo regiao deve conter no minimo 03 caracteres")
	public String regiao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	
}
