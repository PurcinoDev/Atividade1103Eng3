package model;

import javax.swing.JOptionPane;

import controller.MetodosReservas;

public class Professor extends Usuario implements InterfaceReserva {

	private double salario;
	private String nome;

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
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
		int n = Integer.parseInt(JOptionPane.showInputDialog("1 - Reservar Equipamento \n 2 - Reservar Sala"));
		switch (n) {
		case 1:
			met.fazerReservaEquipamento();
			break;
		case 2:
			met.fazerReservaSala();
			break;
		}
	}

}
