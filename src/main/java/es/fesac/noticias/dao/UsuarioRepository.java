package es.fesac.noticias.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	@Query(value = "SELECT * FROM Usuario WHERE EMAIL = :email AND PASSWORD = MD5(:password)",nativeQuery = true)
	public Usuario getByEmailAndPassword(String email, String password);

	
}
