package Practico04Dia;

public class Dia {
	private int dia;

	public Dia(int dia) {
		this.dia=dia;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public String diaDeLaSemana () {
		String diaSemana;
		switch (this.dia) {
		case 1:
			diaSemana="Domingo";
			break;
		case 2:
			diaSemana="Lunes";
			break;
		case 3:
			diaSemana="Martes";
			break;
		case 4:
			diaSemana="Miercoles";
			break;
		case 5:
			diaSemana="Jueves";
			break;
		case 6:
			diaSemana="Viernes";
			break;
		case 7:
			diaSemana="Sabado";
			break;
		default: 
			diaSemana="Error";
			break;
				
		}
		return diaSemana;
	}

}
