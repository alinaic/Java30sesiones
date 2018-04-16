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

public class AnunciosDAOImpl extends GenericDAO implements AnunciosDAO {

	@Override
	public void registrarAnuncio(Anuncio anuncio) {
		conectar();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.INSERCION_ANUNCIO);

			ps.setString(1, anuncio.getTitulo());
			ps.setDouble(2, anuncio.getPrecio());
			ps.setString(3, anuncio.getTelefono());
			ps.setString(4, anuncio.getEmail());
			ps.setString(5, anuncio.getDescripcion());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de insercion de anuncio esta mal");
		}

		desconectar();

	}// registrarAnuncios

	@Override
	public List<Anuncio> obtenerAnuncios() {
		conectar();
		List<Anuncio> anuncios = new ArrayList<Anuncio>();
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.SELECION_ANUNCIOS);
			ResultSet resultado = ps.executeQuery();
			while (resultado.next()) {
				
				Anuncio anuncio = new Anuncio();
				anuncio.setDescripcion(resultado.getString("descripcion"));
				anuncio.setEmail(resultado.getString("email"));
				anuncio.setId(resultado.getInt("id"));
				anuncio.setPrecio(resultado.getDouble("precio"));
				anuncio.setTelefono(resultado.getString("telefono"));
				anuncio.setTitulo(resultado.getString("titulo"));
				anuncios.add(anuncio);
			}

		} catch (SQLException e) {
			System.out.println("sql select anuncios esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		return anuncios;
		
	}// end obtenerAnuncio
	
	public void borrarAnuncio(int id){
		conectar();
		
		try {
			PreparedStatement ps = miConnection
					.prepareStatement(ConstantesSQL.BORRAR_ANUNCIO);
			ps.setInt(1, id);
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			System.out.println("sql borrado anuncios esta mal");
		}
		
		desconectar();
		
	}

}// end class
