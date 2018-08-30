package br.jus.tre_pa.mesav.domain;

public enum MesarioStatusType {

	INSCRITO("Inscrito"), DEFERIDO("Deferido"), INDEFERIDO("Indeferido"), CONVOCADO("Convocado"), DISPENSADO("Dispensado"), CONVOCANDO(
			"Prox_Convoc");

	private String descricao;

	private MesarioStatusType(String descricao) {
		this.descricao = descricao;
	}

	public String toString() {

		return descricao;
	}

	public String getName() {
		return this.name();
	}

}