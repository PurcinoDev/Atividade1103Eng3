package model;

import controller.MetodosReservas;

public class Aluno extends Usuario implements InterfaceReserva {
	
	private int RA;
	private String nome;

	public int getRA() {
		return RA;
	}
	public void setRA(int RA) {
		this.RA = RA;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void login() {
		
	}
	@Override
	public void logoff() {
		
	}
	
	@Override
	public void reservar() {
		MetodosReservas met = new MetodosReservas();
		met.fazerReservaEquipamento();
	}

}