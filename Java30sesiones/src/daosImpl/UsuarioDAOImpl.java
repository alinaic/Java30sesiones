package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Anuncio;
import modelo.Usuario;
import daos.AnunciosDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.UsuarioDAO;

public class UsuarioDAOImpl extends GenericDAO implements UsuarioDAO {

	@Override
	public void registrarUsuario(Usuario usuario) {
		conectar();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.INSERCION_USUARIO);

			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getPass());
			ps.setString(3, usuario.getPoblacion());
			ps.setString(4, usuario.getEmail());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de insercion del Usuario esta mal");
			System.out.println(e.getMessage());
		}

		desconectar();

	}// registrarUsuario

	@Override
	public List<Usuario> obtenerUsuario() {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.SELECION_USUARIO);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				Usuario usuario = new Usuario();
				usuario.setNombre(resultado.getString("nombre"));
				usuario.setPass(resultado.getString("pass"));
				usuario.setPoblacion(resultado.getString("poblacion"));
				usuario.setEmail(resultado.getString("email"));
				usuario.setId(resultado.getInt("id"));
				usuarios.add(usuario);
			}

		} catch (SQLException e) {
			System.out.println("sql select Usuario esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return usuarios;
	}// end obtenerUsuario

	@Override
	public boolean identificarUsuario(String email, String pass) {
		boolean identificado = false;

		conectar();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.IDENTIFICACION_USUARIO);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				// si este if se cumple, eso es que he obtenido un resultado
				// de base de datos
				identificado = true;
			}

		} catch (SQLException e) {
			System.out.println("la sql de indentificacion esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return identificado;
	}

	@Override
	public boolean identificarAdmin(String email, String pass) {
		boolean identificado = false;

		conectar();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.IDENTIFICACION_ADMIN);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				// si este if se cumple, eso es que he obtenido un resultado
				// de base de datos
				identificado = true;
			}

		} catch (SQLException e) {
			System.out.println("la sql de indentificacion esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return identificado;
		
		
	}//end identificar

	@Override
	public void borrarUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

}// end class
