package ar.edu.unlam.basica2.integrador;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
import ar.edu.unlam.basica2.utils.ManejoDeArchivos;

public class PruebaSistema {

	@Test
	public void queSePuedaGuardarUnaNuevaConfiguracion() {
		// Preparaci�n de los datos
		Sistema miel = new Sistema("Unlam");
		String clave= "Idioma", valor = "Espa�ol";
		//Ejecuci�n
		miel.setConfiguracion("Idioma", "Espa�ol");
		//Verificaci�n
		assertEquals(valor, miel.getConfiguracion(clave));
	}
	
	@Test
	public void queSePuedaAlmacenarLaConfiguracion() {
		// Preparaci�n de los datos
		Sistema miel = new Sistema("Unlam");
		miel.setConfiguracion("Idioma", "Espa�ol");
		miel.setConfiguracion("Path", "C://tmp//desktop.config");
		
		//Ejecuci�n
		try {
			ManejoDeArchivos.guardarObjeto(miel.getConfiguracion("Path"), miel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		miel.setConfiguracion("Idioma", "English");
		try {
			miel = (Sistema)ManejoDeArchivos.leerObjetos(miel.getConfiguracion("Path"));
		} catch (ClassNotFoundException e) {
			System.err.println("El archivo encontrado no se puede convertir a Sistema");
		}catch(IOException e) {
			System.err.println("Archivo no encontrado");
		}
		//Verificaci�n
		assertEquals("Espa�ol", miel.getConfiguracion("Idioma"));
	}

}
