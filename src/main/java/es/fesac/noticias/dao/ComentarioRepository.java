package es.fesac.noticias.dao;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.Comentario;

public interface ComentarioRepository extends CrudRepository<Comentario, Long> {

}
