package unirios.avaliacao.domain;

import javax.persistence.*;

@Entity
@Table(name = "PESSOAJURIDICA")
public class PessoaJuridica extends Pessoa {

	@Column
	private int cnpj;
	@Column
	private String razaoSocial;
	@Column
	private String inscricaoEstadual;
	
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	
}
