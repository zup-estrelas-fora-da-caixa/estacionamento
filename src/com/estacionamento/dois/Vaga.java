package com.estacionamento.dois;

public class Vaga {
	
	private String tipo;
	private int numero;
	private boolean ocupado;
	
	public Vaga(String tipo, int numero) {
		this.tipo = tipo;
		this.numero = numero;
		this.ocupado = false;
	}
	
	public String getTipo() {
		return tipo;
	}
	public int getNumero() {
		return numero;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	} 
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Tipo: "+this.tipo);
		modelo.append("\nNumero: "+this.numero+"\n");
		
		return modelo.toString();
	}
	
	
}
