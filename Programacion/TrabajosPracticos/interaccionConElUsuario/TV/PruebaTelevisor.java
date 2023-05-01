package TV;

import java.util.Scanner;

public class PruebaTelevisor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Televisor acmeSerieDorada = new Televisor();
		TipoDeEntrada entrada;
		Canal canalAuxiliar;
		String digitoCanal;
		int numeroDeCanal = 0;
		String nombreDeCanal = "";
		boolean stereoDeCanal, subtituloDeCanal;
		char opcionIngresada;
		int valorEntrada;
		int digitoUno = 0, digitoDos = 0, digitoTres = 0, digitoCuatro = 0;
		char[] bytes;
		char opcionDeseada = '\0';
		
		cargaInicialDeCanales(acmeSerieDorada);
		do {
			mostrarMenu();
			opcionDeseada = teclado.next().charAt(0);
			switch (opcionDeseada) {
			case '1':
				acmeSerieDorada.encenderOApagar();
				if (acmeSerieDorada.isEncendido())
					System.out.println("El televisor esta encendido");
				else
					System.out.println("El televisor esta apagado");
				break;
			case '2':
				System.out.println(acmeSerieDorada.toString());
				break;
			case '3':
				if (acmeSerieDorada.isEncendido()) {
					menuDeEntrada();
					valorEntrada = teclado.nextInt();
					if (valorEntrada > 0 && valorEntrada <= 5) {
						entrada = TipoDeEntrada.values()[valorEntrada - 1];
						acmeSerieDorada.seleccionarEntrada(entrada);
					} else {
						System.out.println("Ingreso una opcion incorrecta");
					}
				}
				break;
			case '>':
			case '<':
				if (acmeSerieDorada.subirOBajarAnalogicamente(opcionDeseada)) {
					canalAuxiliar = acmeSerieDorada.getInformacionCanalActual();
					System.out.println("Canal: " + acmeSerieDorada.getCanalActual() + "\nDescripcion: "
							+ canalAuxiliar.getDescripcionCanal());
				} else {
					System.out.println("No se pudo realizar accion");
				}
				break;
			case '+':
			case '-':
				if (acmeSerieDorada.subirOBajarAnalogicamente(opcionDeseada)) {
					System.out.println("Volumen: " + acmeSerieDorada.getVolumen());
				} else {
					System.out.println("No se pudo realizar accion");
				}
				break;
			case '4':
				if (acmeSerieDorada.isEncendido()) {
					System.out.println("Ingrese el numero de Canal");
					digitoCanal = teclado.next();
					if (digitoCanal.length() < 5 && digitoCanal.chars().allMatch( Character::isDigit )) {
						bytes = digitoCanal.toCharArray();
						switch (digitoCanal.length()) {
						case 1:
							digitoUno = Character.getNumericValue(bytes[0]);
							acmeSerieDorada.cambiarCanal((byte) digitoUno);
							break;
						case 2:
							digitoUno = Character.getNumericValue(bytes[0]);
							digitoDos = Character.getNumericValue(bytes[1]);
							acmeSerieDorada.cambiarCanal((byte )digitoUno, (byte) digitoDos);
							break;
						case 3:
							digitoUno = Character.getNumericValue(bytes[0]);
							digitoDos = Character.getNumericValue(bytes[1]);
							digitoTres = Character.getNumericValue(bytes[2]);
							acmeSerieDorada.cambiarCanal((byte) digitoUno, (byte) digitoDos, (byte) digitoTres);
							break;
						case 4:
							digitoUno = Character.getNumericValue(bytes[0]);
							digitoDos = Character.getNumericValue(bytes[1]);
							digitoTres = Character.getNumericValue(bytes[2]);
							digitoCuatro = Character.getNumericValue(bytes[3]);
							acmeSerieDorada.cambiarCanal((byte) digitoUno, (byte) digitoDos, (byte) digitoTres, (byte) digitoCuatro);
							break;
						}
					}
				}
				break;
			case '5':
				if (acmeSerieDorada.volverAlCanalAnterior()) {
					canalAuxiliar = acmeSerieDorada.getInformacionCanalActual();
					System.out.println("Canal: " + acmeSerieDorada.getCanalActual() + "\nDescripcion: "
							+ canalAuxiliar.getDescripcionCanal());
				} else {
					System.out.println("No se puedo realizar accion");
				}
				break;
			case '6':
				if (acmeSerieDorada.silenciar()) {
					System.out.println("Volumen: " + acmeSerieDorada.getVolumen());
				} else {
					System.out.println("No se pudo realizar accion");
				}
				break;
			case '7':
				if (acmeSerieDorada.isEncendido()) {
					System.out.println("Ingrese el numero de canal: ");
					numeroDeCanal = teclado.nextInt();
					System.out.println("Ingrese la Descripcion de canal: ");
					nombreDeCanal = teclado.next();
					System.out.println("Ingrese S: si es Stereo o N: Si es mono");
					opcionIngresada = teclado.next().charAt(0);
					if (opcionIngresada == 'S' || opcionIngresada == 's') {
						stereoDeCanal = true;
					} else {
						stereoDeCanal = false;
					}
					System.out.println("Ingrese S: Si posee subtitulos o N: si no posee subtitulos");
					opcionIngresada = teclado.next().charAt(0);
					if (opcionIngresada == 'S' || opcionIngresada == 's') {
						subtituloDeCanal = true;
					} else {
						subtituloDeCanal = false;
					}
					canalAuxiliar = new Canal(numeroDeCanal, nombreDeCanal, stereoDeCanal, subtituloDeCanal);
					if (acmeSerieDorada.agregarCanal(canalAuxiliar)) {
						System.out.println("Se pudo agregar el canal");
					}else {
						System.out.println("No se pudo realizar accion");
					}
				}
				break;
			}
		} while (opcionDeseada != '9');
		teclado.close();
	}

	private static void mostrarMenu() {
		System.out.println("****************************");
		System.out.println("*        Bienvenido        *");
		System.out.println("****************************");
		System.out.println("\nMenu de opciones");
		System.out.println("1  - Boton Power");
		System.out.println("2  - Boton Display");
		System.out.println("3  - Boton Input: Entrada ");
		System.out.println(">  - Subir un canal");
		System.out.println("<  - Bajar Canal");
		System.out.println("+  - Subir volumen");
		System.out.println("-  - Bajar Volumen");
		System.out.println("4  - Cambiar canal ");
		System.out.println("5  - Prev ");
		System.out.println("6  - Mute ");
		System.out.println("7  - Agregar un nuevo canal ");
		System.out.println("9  - Salir ");
		System.out.println("\nIngrese una opcion");
	}

	private static void menuDeEntrada() {
		System.out.println("****************************");
		System.out.println("*Seleccione Tipo de Entrada*");
		System.out.println("****************************");
		System.out.println("1  - Television de Aire");
		System.out.println("2  - Television de Cable");
		System.out.println("3  - HDMI1");
		System.out.println("4  - HDMI2");
		System.out.println("5  - USB");
	}
	
	private static void cargaInicialDeCanales(Televisor nuevoTelevisor) {
		nuevoTelevisor.encenderOApagar();
		Canal nuevoCanal;
		nuevoTelevisor.seleccionarEntrada(TipoDeEntrada.TELEVISION_DE_AIRE);
		nuevoCanal=new Canal(0,"Canal Informativo",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(2,"America",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(7,"TV Publica",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(9,"El nueve",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(11,"Telefe",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(13,"Trece",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoTelevisor.seleccionarEntrada(TipoDeEntrada.TELEVISION_DE_CABLE);
		nuevoCanal=new Canal(0,"Canal Informativo",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(1,"La Nacion",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(3,"Todo Noticias",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(12,"Telefe",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(15,"America",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(202,"Cartoon Network",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(405,"Space",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(412,"Cinemax",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(1079,"Animal Planet",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(1084,"Rai",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoCanal=new Canal(4202,"Latina",true, false);
		nuevoTelevisor.agregarCanal(nuevoCanal);
		nuevoTelevisor.encenderOApagar();
	}
}
