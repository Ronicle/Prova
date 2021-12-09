package unirios.avaliacao.domain;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name = "PESSOAFISICA")
public class PessoaFisica extends Pessoa{
	
	@Column
	private int rg;
	@Column
	private int cpf;
	@Column
	private String sexo;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="datanasc", columnDefinition = "DATE")
	private LocalDate dataNasc;
	
	
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}
