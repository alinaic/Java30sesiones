package modelo;

import javax.management.loading.PrivateClassLoader;

public class Usuario {

	private String nombre;
	private String pass;
	private String poblacion;
	private String email;
	private int id;

	public Usuario() {

	}

	public Usuario(String nombre, String pass, String poblacion, String email) {
		super();
		this.nombre = nombre;
		this.pass = pass;
		this.poblacion = poblacion;
		this.email = email;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", pass=" + pass + ", poblacion="
				+ poblacion + ", email=" + email + ", id=" + id + "]";
	}

	

}
