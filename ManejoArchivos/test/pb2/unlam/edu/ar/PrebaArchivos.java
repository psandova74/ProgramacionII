package pb2.unlam.edu.ar;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.junit.Test;

public class PrebaArchivos {
	@Test
	public void test() throws FileNotFoundException {
		PrintWriter out;
		out = new PrintWriter("ArchivoDePrueba.txt");
		out.println("Prueba para programacion");
		
	}
	

}
