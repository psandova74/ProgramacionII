package universidad;

import java.util.LinkedList;

public class Universidad {
	private String nombre;
	private LinkedList <Profesor> listaProfesores= new LinkedList<Profesor>();
	private LinkedList <Curso> listaCursos= new LinkedList<Curso>();
	private LinkedList <Materia> listaMaterias= new LinkedList<Materia>();
	private LinkedList <Alumno> listaAlumnos= new LinkedList<Alumno>();
	
	public Universidad(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer sizeAlumno() {
		return this.listaAlumnos.size();
	}

	public Boolean agregarAlumno(Alumno alumno){
		if (!this.listaAlumnos.contains(alumno))
			return this.listaAlumnos.add(alumno);
		return false;
	}

	public Alumno buscarAlumno(Integer dni){
		for (Alumno alumno:this.listaAlumnos)
		if (alumno.getDni().equals(dni))
			return alumno;
		return null;
	}
	
	public Boolean eliminarAlumno(Integer dni) {
		Alumno alumnoEncontrado=buscarAlumno(dni);
		if (alumnoEncontrado!=null)
			return this.listaProfesores.remove(alumnoEncontrado);		
		return false;
	}
	
	public Integer sizeProfesor() {
		return this.listaProfesores.size();
	}
	
	public Boolean agregarProfesor(Profesor profesor){
		if (!this.listaProfesores.contains(profesor))
			return this.listaProfesores.add(profesor);
		return false;
	}
	
	public Profesor buscarProfesor(Integer idProfesor){
		for (Profesor profesor:this.listaProfesores)
			if (profesor.getIdProfesor().equals(idProfesor))
				return profesor;
		return null;
	}
	
	public Boolean eliminarProfesor(Integer idProfesor) {
		Profesor profesorEncontrado=buscarProfesor(idProfesor);
		if (profesorEncontrado!=null)
			return this.listaProfesores.remove(profesorEncontrado);		
		return false;
	}
	
	public Integer sizeMateria() {
		return this.listaMaterias.size();
	}
	
	public Boolean agregarMateria(Materia materia){
		if (!this.listaMaterias.contains(materia))
			return this.listaMaterias.add(materia);
		return false;
	}
	
	public Materia buscarMateria(Integer idMateria){
		for (Materia materia:this.listaMaterias)
			if (materia.getIdMateria().equals(idMateria))
				return materia;
		return null;
	}
	
	public Boolean eliminarMateria(Integer idMateria) {
		Materia materiaEncontrada=buscarMateria(idMateria);
		if (materiaEncontrada!=null)
			return this.listaMaterias.remove(materiaEncontrada);		
		return false;
	}
	
	public Boolean agregarCurso(Curso curso){
		Materia materiaEncontrada=buscarMateria(curso.getMateria().getIdMateria());
		if (!this.listaCursos.contains(curso) && materiaEncontrada!=null )
			return this.listaCursos.add(curso);
		return false;
	}
	
		
}
