package model;

import java.util.Date;

public class Reserva {

	private Usuario usuario;
	private String equipamento;
	private Date horarioReserva;
	private boolean validez;

	public Date getHorarioReserva() {
		return horarioReserva;
	}

	public void setHorarioReserva(Date horarioReserva) {
		this.horarioReserva = horarioReserva;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public boolean isValidez() {
		return validez;
	}

	public void setValidez(boolean validez) {
		this.validez = validez;
	}

}