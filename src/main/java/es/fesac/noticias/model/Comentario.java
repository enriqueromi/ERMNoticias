package es.fesac.noticias.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Comentario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String contenidoComentario;
	@OneToOne
	private Mensaje mensajeReferencia;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContenidoComentario() {
		return contenidoComentario;
	}
	public void setContenidoComentario(String contenidoComentario) {
		this.contenidoComentario = contenidoComentario;
	}
	public Mensaje getMensajeReferencia() {
		return mensajeReferencia;
	}
	public void setMensajeReferencia(Mensaje mensajeReferencia) {
		this.mensajeReferencia = mensajeReferencia;
	}
	
	
}
