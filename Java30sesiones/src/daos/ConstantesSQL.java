package daos;

public class ConstantesSQL {
	public static final String INSERCION_ANUNCIO = "insert into tabla_anuncios(titulo, precio, telefono, email, descripcion)"
			+ "values(?,?,?,?,?)";

	public static final String SELECION_ANUNCIOS = "select * from tabla_anuncios";

	public static final String INSERCION_USUARIO = "insert into tabla_usuario(nombre, pass, poblacion, email)"
			+ "values(?,?,?,?)";

	public static final String SELECION_USUARIO = "SELECT * FROM portal_anuncios.tabla_usuario";

	public static final String IDENTIFICACION_USUARIO = "select id from tabla_usuario where email = ? and pass = ?";

	public static final String IDENTIFICACION_ADMIN = "select id from tabla_usuario where email = ? and pass = ? and admin = 1";
	
	public static final String BORRAR_ANUNCIO = "delete from tabla_anuncios where id=?";
	
}// end class
