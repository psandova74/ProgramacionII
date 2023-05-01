package universidad;

public class Profesor {
		private Integer idProfesor;
		private String apellido;

		public Profesor(Integer idProfesor, String apellido) {
			this.idProfesor = idProfesor;
			this.apellido = apellido;
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
			result = prime * result + ((idProfesor == null) ? 0 : idProfesor.hashCode());
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Profesor other = (Profesor) obj;
			if (apellido == null) {
				if (other.apellido != null)
					return false;
			} else if (!apellido.equals(other.apellido))
				return false;
			if (idProfesor == null) {
				if (other.idProfesor != null)
					return false;
			} else if (!idProfesor.equals(other.idProfesor))
				return false;
			return true;
		}



		protected Integer getIdProfesor() {
			return idProfesor;
		}

		protected void setIdProfesor(Integer idProfesor) {
			this.idProfesor = idProfesor;
		}

		protected String getApellido() {
			return apellido;
		}

		protected void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
}
