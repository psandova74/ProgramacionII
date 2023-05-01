package login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testSistema {
	@Test
	public void queSeAgregueUsuario() {
		Sistema sistema=new Sistema("MiSistema");
		Usuario user =new Usuario("juan", "juan@gmail.com","1234",34);
		assertEquals(new Integer(0),sistema.cantidadDeUsuarios());
		sistema.agregarUsuario(user);
		Integer cantidadUsuarios=sistema.cantidadDeUsuarios();
		Integer ve=1;
		assertEquals(ve,cantidadUsuarios);
	}
	@Test
	public void queUnUsuarioPuedaLoguearse() {
		Sistema sistema=new Sistema("MiSistema");
		Usuario user =new Usuario("juan", "juan@gmail.com","1234",34);
		Usuario user2 =new Usuario("Federico", "federico@gmail.com","1234",34);
		sistema.agregarUsuario(user);	
		sistema.agregarUsuario(user2);
		String mail="juan@gmail.com";
		String password="1234";
		Boolean loginCorrecto=sistema.ingresarAlSistema(mail,password);
		assertTrue(loginCorrecto);
	}
	@Test
	public void queNoSeAgregueUsuarioDuplicado() {
		Sistema sistema=new Sistema("MiSistema");
		Usuario user =new Usuario("juan", "juan@gmail.com","1234",34);
		Usuario user2 =new Usuario("juan", "juan@gmail.com","1234",34);
		sistema.agregarUsuario(user);	
		sistema.agregarUsuario(user2);
		Integer cantidadUsuarios=sistema.cantidadDeUsuarios();
		Integer ve=1;
		assertEquals(ve,cantidadUsuarios);
	}
}
