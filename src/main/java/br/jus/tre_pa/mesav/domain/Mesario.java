package br.jus.tre_pa.mesav.domain;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.TituloEleitoral;

@Entity
@Table(name = "mesario")
public class Mesario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	@Id
	@NotEmpty
	@TituloEleitoral(message = "Titulo eleitoral inválido")
	private String tituloEleitoral;

	@Column
	@NotEmpty(message = "O Nome deve ser informado")
	private String nomeCompleto;

	@Column
	@NotEmpty(message = "O Nome da Mãe deve ser informado")
	private String nomeMae;

	@Column
	@Email
	// @NotEmpty(message = "O Email deve ser informado")
	private String email;

	@Column
	private LocalDate nascimento;

	@Column
	private String grauInstrucao;


	@Column
	private boolean trabalhouMesario;

	@Column
	private Boolean necessidadeEspeciais;

	@Column
	private String endereco;

	@Column
	private String complementoEndereco;

	@Column
	private String informacoesReferenciaEndereco;

	@Column
	private String bairro;

	@Column
	private String municipio;

	@Column
	private String cep;

	@Column
	private String telefone;

	@Column
	private String celular;

	@Column
	private boolean servidorPublico;

	@Column
	private boolean possuiExperienciaInformatica = false;

	@Column
	private String localTrabalho;

	@Column
	private String enderecoTrabalho;

	private LocalDate dataInscricao;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MesarioStatusType status = MesarioStatusType.INSCRITO;
	
	
	@Column
	//@NotEmpty(message = "Seu Título Eleitoral não é do estado do Pará ou não está regular. Favor entrar em contato com seu cartório eleitoral")
	private String zonaEleitoral;

	@Column
	private String zonaAtuacao;

	@Column
	private Integer secaoEleitoral;

	@Column
	private String localVotacao;

	@Column
	private Integer numlocalVotacao;
	
	@Column
	private String emailZe;

	// *********************************

	// Get´s and Set's
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Boolean getNecessidadeEspeciais() {
		return necessidadeEspeciais;
	}

	public void setNecessidadeEspeciais(Boolean necessidadeEspeciais) {
		this.necessidadeEspeciais = necessidadeEspeciais;
	}

	public boolean isPossuiExperienciaInformatica() {
		return possuiExperienciaInformatica;
	}

	public String getStrPossuiExperienciaInformatica() {
		return (possuiExperienciaInformatica) ? "SIM" : "NÃO";
	}

	public void setPossuiExperienciaInformatica(boolean possuiExperienciaInformatica) {
		this.possuiExperienciaInformatica = possuiExperienciaInformatica;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public boolean isTrabalhouMesario() {
		return trabalhouMesario;
	}

	public String getStrTrabalhouMesario() {
		return (trabalhouMesario) ? "SIM" : "NÃO";
	}

	public void setTrabalhouMesario(boolean trabalhouMesario) {
		this.trabalhouMesario = trabalhouMesario;
	}

	public String getTituloEleitoral() {
		return tituloEleitoral;
	}

	public void setTituloEleitoral(String tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public boolean isServidorPublico() {
		return servidorPublico;
	}

	public String getStrServidorPublico() {
		return (servidorPublico) ? "SIM" : "NÃO";
	}

	public void setServidorPublico(boolean servidorPublico) {
		this.servidorPublico = servidorPublico;
	}

	public String getLocalTrabalho() {
		return localTrabalho;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	public String getEnderecoTrabalho() {
		return enderecoTrabalho;
	}

	public void setEnderecoTrabalho(String enderecoTrabalho) {
		this.enderecoTrabalho = enderecoTrabalho;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getInformacoesReferenciaEndereco() {
		return informacoesReferenciaEndereco;
	}

	public void setInformacoesReferenciaEndereco(String informacoesReferenciaEndereco) {
		this.informacoesReferenciaEndereco = informacoesReferenciaEndereco;
	}

	public MesarioStatusType getStatus() {
		return status;
	}

	public void setStatus(MesarioStatusType status) {
		this.status = status;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public LocalDate getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(LocalDate dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
	public String getZonaEleitoral() {
		Integer ze = null;
		if (zonaEleitoral != null) {
			// limpar os zeros as esquerda
			ze = Integer.parseInt(zonaEleitoral);
			zonaEleitoral = ze.toString();
		}
		return zonaEleitoral;
	}

	public void setZonaEleitoral(String zonaEleitoral) {
		Integer ze = null;
		if (zonaEleitoral != null) {
			// limpar os zeros as esquerda
			ze = Integer.parseInt(zonaEleitoral);
			zonaEleitoral = ze.toString();
		}

		this.zonaEleitoral = zonaEleitoral;
	}
	
	public String getLocalVotacao() {
		return localVotacao;
	}

	public void setLocalVotacao(String localVotacao) {
		this.localVotacao = localVotacao;
	}
	
	public Integer getNumlocalVotacao() {
		return numlocalVotacao;
	}

	public void setNumlocalVotacao(Integer numlocalVotacao) {
		this.numlocalVotacao = numlocalVotacao;
	}
	
	public String getZonaAtuacao() {
		if (this.zonaAtuacao == null || this.zonaAtuacao.isEmpty()) {
			zonaAtuacao = zonaEleitoral;
		}

		while (zonaAtuacao.length() < 3) {
			zonaAtuacao = "0" + zonaAtuacao;
		}
		return zonaAtuacao;
	}

	public String getZonaAtuacaoFormatted() {
		String ze = zonaAtuacao;

		if (ze != null) {

			while (ze.length() < 3) {
				ze = "0" + ze;
			}

			// não exibir zona de atuação caso seja a mesma de origem
			if (ze.equals(getZonaEleitoralFormatted())) {
				return "";
			}
		} else {
			return "";
		}

		return ze;

	}

	public String getZonaEleitoralFormatted() {
		while (zonaEleitoral.length() < 3) {
			zonaEleitoral = "0" + zonaEleitoral;
		}
		return zonaEleitoral;

	}

	public void setZonaAtuacao(String zonaAtuacao) {
		// é preciso completar os zeros á esquerda da zonaAtuacao
		while (zonaAtuacao.length() < 3) {
			zonaAtuacao = "0" + zonaAtuacao;
		}
		this.zonaAtuacao = zonaAtuacao;
	}
	
	public Integer getSecaoEleitoral() {
		return secaoEleitoral;
	}

	public void setSecaoEleitoral(Integer secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}

	public String getEmailZe() {
		return emailZe;
	}

	public void setEmailZe(String emailZe) {
		this.emailZe = emailZe;
	}

	
	




}
