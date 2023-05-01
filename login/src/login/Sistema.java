package login;import java.util.ArrayList;

public class Sistema {
	private String nombre;
 	private ArrayList <Usuario> usuarios;
 	
 	
 	public Sistema(String nombre) {
		this.nombre = nombre;
		usuarios=new ArrayList <> ();
	}


	public Boolean agregarUsuario(Usuario usuario) {
		if(!this.usuarios.contains(usuario))
			return usuarios.add(usuario);
		return false;
 	}


	public Integer cantidadDeUsuarios() {	
		return 	usuarios.size();
	}


	public Boolean ingresarAlSistema(String mail, String password) {
		for (Usuario usr:this.usuarios) {
			if (usr.getMail().equalsIgnoreCase(mail) && usr.getPassword().equals(password))
				return true;	
		}
		return false;
	}
}
