package universidad;

import java.util.LinkedList;

public class Inscripcion {
	private Integer idInscripcion;
	private Integer cicloLectivo;
	private Curso curso;
	private LinkedList <Alumno> alumnos= new LinkedList<Alumno>();
	
	public Inscripcion(Integer idInscripcion, Integer cicloLectivo, Curso curso) {
		this.idInscripcion = idInscripcion;
		this.cicloLectivo = cicloLectivo;
		this.curso = curso;
	}
	
	protected Integer getIdInscripcion() {
		return idInscripcion;
	}
	protected void setIdInscripcion(Integer idInscripcion) {
		this.idInscripcion = idInscripcion;
	}
	protected Integer getCicloLectivo() {
		return cicloLectivo;
	}
	protected void setCicloLectivo(Integer cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}
	protected Curso getCurso() {
		return curso;
	}
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
