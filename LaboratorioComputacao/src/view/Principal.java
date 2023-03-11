package view;

import model.Reserva;
import model.Professor;
import model.Usuario;
import model.Aluno;
import java.util.Calendar;

public class Principal {
	public static void main(String[] args) {
		Reserva res = new Reserva();
		
		Calendar c = Calendar.getInstance();
		System.out.println("Current date: " + c.getTime());
		c.add(Calendar.HOUR, 7);
		System.out.println("7 hours later: " + c.getTime());
	}
}
