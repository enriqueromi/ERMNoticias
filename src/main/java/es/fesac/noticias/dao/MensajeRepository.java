package es.fesac.noticias.dao;

import org.springframework.data.repository.CrudRepository;

import es.fesac.noticias.model.Mensaje;

public interface MensajeRepository extends CrudRepository<Mensaje, Long>{

	
}
