package Sistema;

public class Sistema {
	private String nombredelSistema;
	private Integer cantidadMaximaDeUsuarios;
	private Usuario usuarios[];
	private Usuario usuariosLogueados[];
	
	public Sistema(String nombreDelSistema, Integer cantidadMaximaDeUsuarios) {
		this.nombredelSistema=nombreDelSistema;
		this.cantidadMaximaDeUsuarios=cantidadMaximaDeUsuarios;
		usuarios=new Usuario[cantidadMaximaDeUsuarios];
		usuariosLogueados=new Usuario[cantidadMaximaDeUsuarios];
	}

	public String getNombredelSistema() {
		return nombredelSistema;
	}

	public void setNombredelSistema(String nombredelSistema) {
		this.nombredelSistema = nombredelSistema;
	}

	public Integer getCantidadMaximaDeUsuarios() {
		return cantidadMaximaDeUsuarios;
	}

	public void setCantidadMaximaDeUsuarios(Integer cantidadMaximaDeUsuarios) {
		this.cantidadMaximaDeUsuarios = cantidadMaximaDeUsuarios;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario[] getUsuariosLogueados() {
		return usuariosLogueados;
	}

	public void setUsuariosLogueados(Usuario[] usuariosLogueados) {
		this.usuariosLogueados = usuariosLogueados;
	}
	
	public Boolean ingresarUsuario(Usuario nuevoUsuario) {
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i]==null) {
				usuarios[i]=nuevoUsuario;
				return true;
			}
			if (usuarios[i].equals(nuevoUsuario)) {
				return false;
			}
		}
		return false;
	}
	
	public Boolean buscarUsuarioRegistrado(Usuario buscarUsuario) {
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i]==null && usuarios[i].equals(buscarUsuario)) {
				return true;
			}
		}
		return false;
	}
	
	public Usuario buscarUsuarioRegistrado(String usuario) {
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i]==null && usuarios[i].getUsuario().equals(usuario)) {
				return usuarios[i];
			}
		}
		return null;
	}
	public Double calcularElPorcentajeDeUsuariosLogueados() {
		Double cantidadUsuariosLogueados=0.0;
		Double cantidadUsuariosRegistrados=0.0;
		Double porcentajeUsuariosLogueados=0.0;
		for (int i=0;i<usuariosLogueados.length;i++) {
			if (usuariosLogueados[i]==null ) {
				cantidadUsuariosLogueados++;
			}
		}
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i]==null ) {
				cantidadUsuariosRegistrados++;
			}
		}
		
		if (cantidadUsuariosRegistrados>0.0) {
			porcentajeUsuariosLogueados=cantidadUsuariosLogueados/cantidadUsuariosRegistrados;
		}
		return porcentajeUsuariosLogueados;
	}
	
	public Integer calcularLaCantidadDeUsuariosBloqueados() {
		Integer cantidadUsuariosBloqueados=0;
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i]==null && usuarios[i].getClaveBloqueada() ) {
				cantidadUsuariosBloqueados++;
			}
		}
		return cantidadUsuariosBloqueados;
	}
	
	public Integer calcularLaCantidadDeUsuariosLogueados() {
		Integer cantidadUsuariosLogueados=0;
		for (int i=0;i<usuariosLogueados.length;i++) {
			if (usuariosLogueados[i]==null ) {
				cantidadUsuariosLogueados++;
			}
		}
		return cantidadUsuariosLogueados;
	}
	
	public Double calcularEdadPromedio() {
		Integer cantidadUsuarios=0;
		Double  sumatoriaEdad=0.0;
		Double promedioEdad=0.0;
		for (int i=0;i<usuarios.length;i++) {
			if (usuarios[i]==null ) {
				cantidadUsuarios++;
				sumatoriaEdad+=usuarios[i].getEdad();
			}
		}
		if (cantidadUsuarios>0) {
			promedioEdad=sumatoriaEdad/cantidadUsuarios;
		}
		return promedioEdad;
	}
	
	public Boolean loguearUsuario(String usuario, String pass) {
		Usuario usuarioEncontrado=buscarUsuarioRegistrado(usuario);
		if (buscarUsuarioRegistrado(usuarioEncontrado)) {
			for (int i=0;i<usuariosLogueados.length;i++) {
				if (usuariosLogueados[i]==null) {
					if (!usuarioEncontrado.login(usuario, pass)) {
						return false;
					}
					usuariosLogueados[i]=usuarioEncontrado;
					return true;
				}
				if (usuariosLogueados[i].equals(usuarioEncontrado)) {
					return false;
				}
			}
		}
		return false;
	}
}
