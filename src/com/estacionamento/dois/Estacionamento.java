package com.estacionamento.dois;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estacionamento {

	private double porcentagemIdoso = 0.05;
	private double porcentagemDeficiente = 0.02;
	private List<Vaga> vagas;

	public Estacionamento(int quantidadeVagas) {

		this.vagas = criarVagas(quantidadeVagas);

	}

	public List<Vaga> criarVagas(int quantidadeVagas) {
		List<Vaga> vagas = new ArrayList<Vaga>();

		int quantidadeIdoso = (int) Math.ceil((quantidadeVagas * this.porcentagemIdoso));
		int quantidadeDeficiente = (int) Math.ceil((quantidadeVagas * this.porcentagemDeficiente));
		int quantidadeComum = quantidadeVagas - quantidadeIdoso - quantidadeDeficiente;

		Map<String, Integer> tipos = new HashMap<String, Integer>();

		tipos.put("I", quantidadeIdoso);
		tipos.put("D", quantidadeDeficiente);
		tipos.put("C", quantidadeComum);

		for (String tipo : tipos.keySet()) {
			for (int i = 1; i <= tipos.get(tipo); i++) {
				vagas.add(new Vaga(tipo, i));
			}
		}
		return vagas;
	}

	public List<Vaga> getVagas() {
		return vagas;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();

		for (Vaga vaga : this.vagas) {
			modelo.append(vaga);
		}

		return modelo.toString();
	}

}
