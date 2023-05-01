package PracticoTelevisor;
import java.util.Scanner;
public class PruebaTelevisor {
		public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);
			char opcionIngresada;

			System.out.println("Se esta inicializando el Televisor ");
			Televisor tv = new Televisor(5, 10);
			programacionInicialDelTelevisor(tv);
			do {
				mostrarMenu();

				opcionIngresada = teclado.next().charAt(0);
				System.out.println("la opcion ingresada es " + opcionIngresada);
				switch (opcionIngresada) {
				case 'a':
					if (tv.encenderOApagar())
						System.out.println("Se encendio el televisor");
					else 
						System.out.println("Se apago el televisor");
					break;
				case 'b':
					System.out.println("b  - Estado actual");
					break;
				case 'c':
					System.out.println("c  - Seleccionar entrada ");
					break;
				case '>':
					System.out.println(">  - Subir un canal");
					break;
				case '<':
					System.out.println("<  - Bajar Canal");
					break;
				case '+':
					System.out.println("+  - Subir volumen");
					break;
				case '-':
					System.out.println("-  - Bajar Volumen");
					break;
				case 'd':
					System.out.println("d  - Cambiar canal ");
					break;
				case 'e':
					System.out.println("e  - Volver al canal anterior ");
					break;
				case 'f':
					System.out.println("f  - Silenciar ");
					break;
				case 'g':
					System.out.println("g  - Agregar un nuevo canal ");
					break;	
				case 's':
					System.out.println("s  - Salir ");
				default:
				}
			}while (opcionIngresada!='9');
			teclado.close();
		}

		private static void mostrarMenu() {
			System.out.println("INGRESE LA OPCION DESEADA: ");
			System.out.println("1  - Encender/Apagar");
			System.out.println("2  - Estado actual");
			System.out.println("3  - Seleccionar entrada ");
			
			System.out.println(">  - Subir un canal");
			System.out.println("<  - Bajar Canal");
			
			System.out.println("+  - Subir volumen");
			System.out.println("-  - Bajar Volumen");
			
			System.out.println("4  - Cambiar canal ");
			System.out.println("5  - Volver al canal anterior ");
			System.out.println("6  - Silenciar ");
			System.out.println("7  - Agregar un nuevo canal ");
			System.out.println("9  - Salir ");

		}
		
		private static void programacionInicialDelTelevisor(Televisor tv) {
			tv.agregarCanalAire(tv.configurarNuevoCanal(0, "Informacion", false, false));
			tv.agregarCanalAire(tv.configurarNuevoCanal(2, "America", false, false));
			tv.agregarCanalAire(tv.configurarNuevoCanal(7, "TV Publica", false, false));
			tv.agregarCanalAire(tv.configurarNuevoCanal(9, "El nueve", false, false));
			tv.agregarCanalAire(tv.configurarNuevoCanal(11, "Telefe", false, false));
			tv.agregarCanalAire(tv.configurarNuevoCanal(13, "Trece", false, false));
			
			tv.agregarCanalCable(tv.configurarNuevoCanal(1, "La Nacion", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(3, "Todo Noticias", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(12, "Telefe", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(15, "America", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(202, "Cartoon Network", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(405, "Space", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(412, "Cinemax", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(1079, "Animal Planet", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(1084, "Rai", true, true));
			tv.agregarCanalCable(tv.configurarNuevoCanal(4002, "Latina", true, true));
		}	
	}