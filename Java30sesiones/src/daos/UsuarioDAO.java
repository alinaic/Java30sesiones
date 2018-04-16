package daos;

import java.util.List;

import modelo.Anuncio;
import modelo.Usuario;

public interface UsuarioDAO {

	void registrarUsuario(Usuario usuario);

	List<Usuario> obtenerUsuario();

	boolean identificarUsuario(String email, String pass);

	boolean identificarAdmin(String email, String pass);

	void borrarUsuario(int id);
}
