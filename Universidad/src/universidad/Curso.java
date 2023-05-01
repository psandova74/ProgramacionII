package universidad;

import java.util.LinkedList;

public class Curso {
	private Integer idCurso;
	private String Descripcion;
	private Materia materia;
	private LinkedList <Dias> dias= new LinkedList<Dias>();
	private LinkedList <Profesor> profesoresCurso= new LinkedList<Profesor>();
	
	

	public Curso(Integer idCurso, String descripcion, Materia materia) {
		this.idCurso = idCurso;
		Descripcion = descripcion;
		this.materia = materia;
	}
	

	private void ingresarDia(Dias diaCurso) {
		if (!dias.contains(diaCurso))
			dias.add(diaCurso);
	}
	
	private void ingresarProfesor(Profesor profesor) {
		if (!profesoresCurso.contains(profesor))
			profesoresCurso.add(profesor);
	}
	
	protected Integer getIdCurso() {
		return idCurso;
	}

	protected void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	protected String getDescripcion() {
		return Descripcion;
	}

	protected void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	protected Materia getMateria() {
		return materia;
	}

	protected void setMateria(Materia materia) {
		this.materia = materia;
	}


}
