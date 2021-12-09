package unirios.avaliacao.domain;

import javax.persistence.*;

@MappedSuperclass
public class Pessoa extends AbstractEntity<Long>{
	
	@Column
	private int cep;
	@Column
	private String nome;
	@Column
	private String endereco;
	@Column
	private String cidade;
	@Column
	private String estado;
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	
}
