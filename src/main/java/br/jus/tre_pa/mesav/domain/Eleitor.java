package br.jus.tre_pa.mesav.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//A classe Eleitor corresponde a view VW_ELEITORES

@Entity
@Table(name = "VW_ELEITORES")
public class Eleitor {

	@Id
	@Column(name = "NUM_INSCRICAO")
	private String numInscricao;

	@Column(name = "NOM_ELEITOR")
	private String nome;

	@Column(name = "DAT_NASC")
	private Integer dataNasc;

	@Column(name = "NOM_LOCALIDADE")
	private String localidade;

	@Column(name = "NOM_BAIRRO")
	private String bairro;

	@Column(name = "NOM_MAE")
	private String nomeMae;

	@Column(name = "NUM_ZONA")
	private Integer numZona;

	@Column(name = "NUM_SECAO")
	private Integer numSecao;

	@Column(name = "NOM_LOCAL")
	private String localVotacao;

	@Column(name = "NUM_LOCAL")
	private Integer numLocalVocacao;
	
	@Column(name = "EMAIL_ZONA")
	private String emailZona;

	public String getNumInscricao() {
		return numInscricao;
	}

	public void setNumInscricao(String numInscricao) {
		this.numInscricao = numInscricao;
	}

	public Integer getNumZona() {
		return numZona;
	}

	public void setNumZona(Integer numZona) {
		this.numZona = numZona;
	}

	public Integer getNumSecao() {
		return numSecao;
	}

	public void setNumSecao(Integer numSecao) {
		this.numSecao = numSecao;
	}

	public String getLocalVotacao() {
		return localVotacao;
	}

	public void setLocalVotacao(String localVotacao) {
		this.localVotacao = localVotacao;
	}

	public Integer getNumLocalVocacao() {
		return numLocalVocacao;
	}

	public void setNumLocalVocacao(Integer numLocalVocacao) {
		this.numLocalVocacao = numLocalVocacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Date getDataNascDate() {

		Date data = null;
		if (dataNasc != null) {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			try {
				data = sdf.parse(dataNasc.toString());
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}
		}

		return data;
	}

	public String getEmailZona() {
		return emailZona;
	}

	public void setEmailZona(String emailZona) {
		this.emailZona = emailZona;
	}


	

}
