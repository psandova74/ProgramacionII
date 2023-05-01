package Callcenter;
import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class TestCallcenter {
	@Test
	public void queSePuedaCrearUnContacto() {
		Contacto nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		assertNotNull(nuevoContacto);
	}
	
	@Test
	public void queSePuedaCrearUnLlamado() {
		Llamada llamada=crearNuevaLlamada(true,"Registro nueva llamada");
		assertNotNull(llamada);
	}
	
	@Test
	public void queSePuedaCrearUnaEmpresa() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		assertNotNull(empresa);
	}
	
	//agregarNuevoContacto(nuevoContacto)
	
	@Test
	public void queSePuedaRegistraUnNuevoContacto() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Contacto nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		Boolean ve=empresa.agregarNuevoContacto(nuevoContacto);
		assertTrue(ve);
	}
	
	@Test
	public void queNoSePuedaRegistraUnContactoExistente() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Contacto nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto);
		nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		Boolean ve=empresa.agregarNuevoContacto(nuevoContacto);
		assertFalse(ve);
	}
	
	//setEmail(String email) Valido el email
	
	@Test
	public void queSePuedaModificarEmailDeContacto() {
		Contacto nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		nuevoContacto.setEmail("nuevomail@gmail.com");
		entoncesSuEmailEs("nuevomail@gmail.com",nuevoContacto.getEmail());
	}
	
	@Test
	public void queNoSePuedaModificarEmailDeContacto() {
		Contacto nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		String emailOriginal=nuevoContacto.getEmail();
		nuevoContacto.setEmail("cualquier cosa");
		entoncesSuEmailEs(emailOriginal,nuevoContacto.getEmail());
	}
	
	//registrarNuevaLlamada(llamada);
	
	@Test 
	public void queSePuedaRegistrarLlamado() {
		Contacto nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		Llamada llamada=crearNuevaLlamada(true,"Registro nueva llamada");
		Boolean ve=nuevoContacto.registrarNuevaLlamada(llamada);
		Boolean hacerNuevallamada=nuevoContacto.getDeseaSerLlamadoNuevamente();
		assertTrue(ve);
		assertTrue(hacerNuevallamada);
		
	}
	
	@Test
	public void queNoSePuedaRegistrarLlamadoSuperaMaximo() {
		Contacto nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		Llamada llamada=crearNuevaLlamada(true,"Registro nueva llamada 1");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 2");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 3");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 4");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 5");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 6");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 7");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 8");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 9");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 10");
		nuevoContacto.registrarNuevaLlamada(llamada);
		llamada=crearNuevaLlamada(true,"Registro nueva llamada 11");
		Boolean ve=nuevoContacto.registrarNuevaLlamada(llamada);
		Boolean hacerNuevallamada=nuevoContacto.getDeseaSerLlamadoNuevamente();
		assertFalse(ve);
		assertFalse(hacerNuevallamada);
	}
	
//agregarNuevaZonaDeCobertura(codigoPostal)
	
	@Test
	public void queSePuedaIngresarCodigoPostal() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Integer codigoPostal=1754;
		Boolean ve=empresa.agregarNuevaZonaDeCobertura(codigoPostal);
		assertTrue(ve);
	}
	
	@Test
	public void queNoSePuedaIngresarCodigoPostalRepetido() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Integer codigoPostal=1754;
		Integer otrocodigoPostal=1754;
		empresa.agregarNuevaZonaDeCobertura(codigoPostal);
		Boolean ve=empresa.agregarNuevaZonaDeCobertura(otrocodigoPostal);
		assertFalse(ve);
	}
	
	//elCodigoPostalEstaDentroDeLaZonaDeCobertura(Integer codigoPostal)
	
	@Test
	public void queSePuedaEncontrarCodigoExistente() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Integer codigoPostal=1754;
		empresa.agregarNuevaZonaDeCobertura(codigoPostal);
		Boolean ve=empresa.elCodigoPostalEstaDentroDeLaZonaDeCobertura(codigoPostal);
		assertTrue(ve);
		
	}
	
	@Test
	public void queNoSePuedaEncontrarCodigoInexistente() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Integer codigoPostal=1754;
		Integer codigoBuscado=1759;
		empresa.agregarNuevaZonaDeCobertura(codigoPostal);
		Boolean ve=empresa.elCodigoPostalEstaDentroDeLaZonaDeCobertura(codigoBuscado);
		assertFalse(ve);
		
	}
	
	//buscarPorNombre(String nombreABuscar)
	@Test
	public void queSePuedaEncontrarContactoPorNombre() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Contacto nuevoContacto; 
		nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto);
		nuevoContacto=crearContacto("Persona 2","5411888888888", "mailotrapersona@gmail.com", "Calle 6232",1754, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto);
		Contacto contactoEncontrado=empresa.buscarPorNombre("Persona 2");
		assertNotNull(contactoEncontrado);
	}
	
	@Test
	public void queNoSePuedaEncontrarContactoPorNombreInexistente() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Contacto nuevoContacto; 
		nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto);
		nuevoContacto=crearContacto("Persona 2","5411888888888", "mailotrapersona@gmail.com", "Calle 6232",1754, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto);
		Contacto contactoEncontrado=empresa.buscarPorNombre("Persona 3");
		assertNull(contactoEncontrado);
	}
	
	// Contacto buscarCandidato()
	@Test
	public void queSeEncuentreContactoParaLlamar() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Contacto nuevoContacto,contactoEncontrado; 
		Integer codigoPostal=1754;
		empresa.agregarNuevaZonaDeCobertura(codigoPostal);
		nuevoContacto=crearContacto("PersonaPrueba","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		nuevoContacto.setEsCliente(true);  //Es cliente
		empresa.agregarNuevoContacto(nuevoContacto);
		nuevoContacto=crearContacto("Persona 2","5411888888888", "mailotrapersona@gmail.com", "Calle 6232",1754, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto);		
		nuevoContacto=crearContacto("Persona 3","541177777777", "mailtercerpersona@gmail.com", "Calle 3445",1759, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto); //No pertenece a la zona de cobertura
		nuevoContacto=crearContacto("Persona Valida","541166666666", "mailcuartapersona@gmail.com", "Calle 233",1754, "San Justo", Provincia.BUENOS_AIRES);
		nuevoContacto.setDeseaSerLlamadoNuevamente(false); //No desea ser llamado
		empresa.agregarNuevoContacto(nuevoContacto);
		nuevoContacto=crearContacto("Ingreso persona Valida","541155555555", "mailcasopersona@gmail.com", "Calle 233",1754, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto);//persona valida
		contactoEncontrado=empresa.buscarCandidato();
		assertNotNull(contactoEncontrado); 
		Boolean ve=contactoEncontrado.getEsCliente();
		assertFalse(ve);
		ve=contactoEncontrado.getDeseaSerLlamadoNuevamente();
		assertTrue(ve);	
	}
	
	// Contacto buscarCandidato()
	@Test
	public void queNoSeEncuentreContactoParaLlamar() {
		Empresa empresa= crearNuevaEmpresa("Oeste Cable Color");
		Contacto nuevoContacto,contactoEncontrado; 
		Integer codigoPostal=1754;
		empresa.agregarNuevaZonaDeCobertura(codigoPostal);
		nuevoContacto=crearContacto("Ya es cliente","541199999999", "mailprueba@gmail.com", "Calle 6243",1754, "San Justo", Provincia.BUENOS_AIRES);
		nuevoContacto.setEsCliente(true);  //Es cliente
		empresa.agregarNuevoContacto(nuevoContacto);		
		nuevoContacto=crearContacto("No tiene covertura","541177777777", "mailtercerpersona@gmail.com", "Calle 3445",1759, "San Justo", Provincia.BUENOS_AIRES);
		empresa.agregarNuevoContacto(nuevoContacto); //No pertenece a la zona de cobertura
		nuevoContacto=crearContacto("No desea ser llamado","541166666666", "mailcuartapersona@gmail.com", "Calle 233",1754, "San Justo", Provincia.BUENOS_AIRES);
		nuevoContacto.setDeseaSerLlamadoNuevamente(false); //No desea ser llamado
		empresa.agregarNuevoContacto(nuevoContacto);
		contactoEncontrado=empresa.buscarCandidato();
		assertNull(contactoEncontrado); 
	}
	
	private Empresa  crearNuevaEmpresa(String nombreEmpresa) {
		Empresa empresa=new Empresa(nombreEmpresa);
		return empresa;		
	}
	
	private Contacto crearContacto(String nombre, String celular,String mail, String direccion,Integer codigoPostal, String localidad, Provincia provincia) {
		Contacto newContacto=new Contacto(nombre,celular,mail,direccion,codigoPostal, localidad, Provincia.BUENOS_AIRES);
		return newContacto;
	}
	
	private Llamada  crearNuevaLlamada(Boolean fueExitosa, String observaciones) {
		Llamada llamada=new Llamada(fueExitosa,observaciones);
		return llamada;		
	}
	
	private void entoncesSuEmailEs(String ve, String vo) {	
		Assert.assertEquals(ve, vo);
	}

}
