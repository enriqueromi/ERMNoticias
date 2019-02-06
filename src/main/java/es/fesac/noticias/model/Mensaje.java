package es.fesac.noticias.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Mensaje {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String contenidoMensaje;
	@ManyToOne
	private Usuario usuario;
	@OneToMany
	private List<Comentario>listComentarios;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getContenidoMensaje() {
		return contenidoMensaje;
	}
	public void setContenidoMensaje(String contenidoMensaje) {
		this.contenidoMensaje = contenidoMensaje;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Comentario> getListComentarios() {
		return listComentarios;
	}
	public void setListComentarios(List<Comentario> listComentarios) {
		this.listComentarios = listComentarios;
	}
	
	
}
