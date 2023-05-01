package pb2.unlam.edu.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import org.junit.Test;

public class testQuatar {
	@Test
	public void queSePuedaCargarUnQuipoAUnMundial() {
		String nombre="Quatar";
		Mundial quatar=new Mundial(nombre);
		Equipo argentina=new Equipo(1,"Argentina");
		assertTrue(quatar.agregarEquipo(argentina));
	}
	
	@Test
	public void queSePuedaFormarUnGrupoAlMundial() {
		String nombre="Quatar";
		Mundial quatar=new Mundial(nombre);
		Equipo argentina=new Equipo(1,"Argentina");
		Equipo arabia=new Equipo(2,"Arabia");
		Equipo mexico=new Equipo(3,"Mexico");
		Equipo polonia=new Equipo(4,"Polonia");
		quatar.agregarEquipo(argentina);
		quatar.agregarEquipo(arabia);
		quatar.agregarEquipo(mexico);
		quatar.agregarEquipo(polonia);
		String id="c";
		AsignacionEquipoGrupo asignacionArg =new AsignacionEquipoGrupo(id,argentina); 
		AsignacionEquipoGrupo asignacionAra =new AsignacionEquipoGrupo(id,arabia);
		AsignacionEquipoGrupo asignacionMex =new AsignacionEquipoGrupo(id,mexico);
		AsignacionEquipoGrupo asignacionPol =new AsignacionEquipoGrupo(id,polonia);
		assertTrue(quatar.AsignacionEquipoPorGrupo(asignacionArg));
		assertTrue(quatar.AsignacionEquipoPorGrupo(asignacionAra));
		assertTrue(quatar.AsignacionEquipoPorGrupo(asignacionMex));
		assertTrue(quatar.AsignacionEquipoPorGrupo(asignacionPol));
	}
	
	@Test
	public void queNoSePuedaAgregarUnEquipoA2GruposDistintosUnGrupoAlMundial() {
		String nombre="Quatar";
		Mundial quatar=new Mundial(nombre);
		Equipo argentina=new Equipo(1,"Argentina");
		Equipo arabia=new Equipo(2,"Arabia");
		Equipo mexico=new Equipo(3,"Mexico");
		Equipo polonia=new Equipo(4,"Polonia");
		quatar.agregarEquipo(argentina);
		quatar.agregarEquipo(arabia);
		quatar.agregarEquipo(mexico);
		quatar.agregarEquipo(polonia);
		String id="c";
		String otroId="d";
		AsignacionEquipoGrupo asignacionArg =new AsignacionEquipoGrupo(id,argentina); 
		AsignacionEquipoGrupo asignacionArg2 =new AsignacionEquipoGrupo(otroId,argentina);
		assertTrue(quatar.AsignacionEquipoPorGrupo(asignacionArg));
		assertFalse(quatar.AsignacionEquipoPorGrupo(asignacionArg2));

	}
	
	@Test
	public void queSePuedaObtenerUnaListaDeEquiposOrdenadaPorNombreDeEquipo() {
		String nombre="Quatar";
		Mundial quatar=new Mundial(nombre);
		Equipo argentina=new Equipo(1,"Argentina");
		Equipo arabia=new Equipo(2,"Arabia");
		Equipo mexico=new Equipo(3,"Mexico");
		Equipo polonia=new Equipo(4,"Polonia");
		quatar.agregarEquipo(argentina);
		quatar.agregarEquipo(arabia);
		quatar.agregarEquipo(mexico);
		quatar.agregarEquipo(polonia);
		
		String id="c";
		
		AsignacionEquipoGrupo asignacionArg =new AsignacionEquipoGrupo(id,argentina); 
		quatar.AsignacionEquipoPorGrupo(asignacionArg);
		AsignacionEquipoGrupo asignacionMex =new AsignacionEquipoGrupo(id,arabia); 
		quatar.AsignacionEquipoPorGrupo(asignacionMex);
		AsignacionEquipoGrupo asignacionAra =new AsignacionEquipoGrupo(id,mexico); 
		quatar.AsignacionEquipoPorGrupo(asignacionAra);
		AsignacionEquipoGrupo asignacionPol =new AsignacionEquipoGrupo(id,polonia); 
		quatar.AsignacionEquipoPorGrupo(asignacionPol);
		TreeSet<Equipo> listaObtenida = quatar.obtenerEquipoDeUnGrupo(id);
		
		assertEquals("Arabia",listaObtenida.first().getNombre());
		assertEquals("Polonia",listaObtenida.last().getNombre());
	}
	
	@Test
	public void queSePuedaObtenerUnaListaDeEquiposOrdenadaPorNombreDeEquipoDescendente() {
		String nombre="Quatar";
		Mundial quatar=new Mundial(nombre);
		Equipo argentina=new Equipo(1,"Argentina");
		Equipo arabia=new Equipo(2,"Arabia");
		Equipo mexico=new Equipo(3,"Mexico");
		Equipo polonia=new Equipo(4,"Polonia");
		quatar.agregarEquipo(argentina);
		quatar.agregarEquipo(arabia);
		quatar.agregarEquipo(mexico);
		quatar.agregarEquipo(polonia);
		
		String id="c";
		
		AsignacionEquipoGrupo asignacionArg =new AsignacionEquipoGrupo(id,argentina); 
		quatar.AsignacionEquipoPorGrupo(asignacionArg);
		AsignacionEquipoGrupo asignacionMex =new AsignacionEquipoGrupo(id,arabia); 
		quatar.AsignacionEquipoPorGrupo(asignacionMex);
		AsignacionEquipoGrupo asignacionAra =new AsignacionEquipoGrupo(id,mexico); 
		quatar.AsignacionEquipoPorGrupo(asignacionAra);
		AsignacionEquipoGrupo asignacionPol =new AsignacionEquipoGrupo(id,polonia); 
		quatar.AsignacionEquipoPorGrupo(asignacionPol);
		TreeSet<Equipo> listaObtenida = quatar.obtenerEquipoDeUnGrupoOrdenadoOrdenDescendente(id);
		
		assertEquals("Polonia",listaObtenida.first().getNombre());
		assertEquals("Arabia",listaObtenida.last().getNombre());
	}
	
	@Test
	public void queSePuedaObtenerUnaListaDeAsignacionEquipoGrupoOrdenadaPorId() {
		String nombre="Quatar";
		Mundial quatar=new Mundial(nombre);
		Equipo argentina=new Equipo(1,"Argentina");
		Equipo arabia=new Equipo(2,"Arabia");
		Equipo mexico=new Equipo(3,"Mexico");
		Equipo polonia=new Equipo(4,"Polonia");
		quatar.agregarEquipo(argentina);
		quatar.agregarEquipo(arabia);
		quatar.agregarEquipo(mexico);
		quatar.agregarEquipo(polonia);
		
		String id="c";
		AsignacionEquipoGrupo asignacionArg =new AsignacionEquipoGrupo(id,argentina); 
		quatar.AsignacionEquipoPorGrupo(asignacionArg);
		AsignacionEquipoGrupo asignacionMex =new AsignacionEquipoGrupo(id,arabia); 
		quatar.AsignacionEquipoPorGrupo(asignacionMex);
		AsignacionEquipoGrupo asignacionAra =new AsignacionEquipoGrupo(id,mexico); 
		quatar.AsignacionEquipoPorGrupo(asignacionAra);
		AsignacionEquipoGrupo asignacionPol =new AsignacionEquipoGrupo(id,polonia); 
		quatar.AsignacionEquipoPorGrupo(asignacionPol);
		
		id="a";
		Equipo qatar=new Equipo(5,"Quatar");
		Equipo ecuador=new Equipo(6,"Ecuador");
		AsignacionEquipoGrupo asignacionQua =new AsignacionEquipoGrupo(id,qatar); 
		quatar.AsignacionEquipoPorGrupo(asignacionQua);
		AsignacionEquipoGrupo asignacionEcu =new AsignacionEquipoGrupo(id,ecuador); 
		quatar.AsignacionEquipoPorGrupo(asignacionEcu);
		
		TreeSet<AsignacionEquipoGrupo> listaObtenida = quatar.obtenerAsignacionPorGrupoOrdenadaPorId();
		
		
	}
}
