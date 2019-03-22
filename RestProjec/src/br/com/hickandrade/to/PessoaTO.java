package br.com.hickandrade.to;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoaTO {
	private int codigo;
	private int nome;
	private Date nascimento;

	public PessoaTO() {
		super();
	}

	public PessoaTO(int nome, Date nascimento) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public PessoaTO(int codigo, int nome, Date nascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}
