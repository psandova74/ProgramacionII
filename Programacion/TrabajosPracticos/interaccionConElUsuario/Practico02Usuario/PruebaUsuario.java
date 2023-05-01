
package Practico02Usuario;

import java.util.Scanner;
public class PruebaUsuario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Usuario conPocosDatos;
		conPocosDatos = new Usuario("psandova","Mostaza");
		System.out.println("El usuario es: "+conPocosDatos.getUsuario());
		System.out.println("La contrasena es: "+conPocosDatos.getContrasenia());
		System.out.println("El nombre es: "+conPocosDatos.getNombre());
		
		conPocosDatos.setNombre("Patricia");
		System.out.println("El usuario es: "+conPocosDatos.getUsuario());
		System.out.println("El nombre es: "+conPocosDatos.getNombre());
		
		Usuario conTodosLosDatos = new Usuario("psandova","Mostaza", "Patricia","Sandoval",23891669,47);
		System.out.println("El usuario es: "+conTodosLosDatos.getUsuario());
		System.out.println("La contrasena es: "+conTodosLosDatos.getContrasenia());
		System.out.println("El nombre es: "+conTodosLosDatos.getNombre());
		System.out.println("Datos de con todos los datos "+ conTodosLosDatos.toString());
		
		//Ejecuto el sistema
		Usuario gmail =new Usuario("patricia@gmail.com","Pato");
		System.out.println("Login de gmail");
		System.out.println("Ingrese el usuario");
		String usuario=entrada.next();
		System.out.println("Ingrese la Contrasena");
		String contrasenia=entrada.next();
		
		System.out.println("ToString: "+gmail.toString());
		System.out.println("El usuario gmail es: "+gmail.getUsuario());
		System.out.println("La contrasena gmail es: "+gmail.getContrasenia());
		if (gmail.login(usuario, contrasenia))
			System.out.println("Ingreso correctamente");
		else {
			System.out.println("Error en usuario o contrasena. "+gmail.getIntentosFallidos()+" intentos fallidos");
			System.out.println("Login de gmail");
			System.out.println("Ingrese el usuario");
			usuario=entrada.next();
			System.out.println("Ingrese la Contrasena");
			contrasenia=entrada.next();
			if (gmail.login(usuario, contrasenia))
				System.out.println("Ingreso correctamente");
			else {
				System.out.println("Error en usuario o contrasena. "+gmail.getIntentosFallidos()+" intentos fallidos");
				System.out.println("Login de gmail");
				System.out.println("Ingrese el usuario");
				usuario=entrada.next();
				System.out.println("Ingrese la Contrasena");
				contrasenia=entrada.next();
				if (gmail.login(usuario, contrasenia))
					System.out.println("Ingreso correctamente");
				else {
					System.out.println("Error en usuario o contrasena. "+gmail.getIntentosFallidos()+" intentos fallidos");
					System.out.println("Login de gmail");
					System.out.println("Ingrese el usuario");
					usuario=entrada.next();
					System.out.println("Ingrese la Contrasena");
					contrasenia=entrada.next();
					if (gmail.login(usuario, contrasenia))
						System.out.println("Ingreso correctamente");
					else {
						if(gmail.isClaveBloqueada())
							System.out.println("La clave fue bloqueada");
					}
				}
			}
			
		}
		entrada.close();
		
	}
}
