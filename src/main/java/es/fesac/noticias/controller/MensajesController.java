package es.fesac.noticias.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import es.fesac.noticias.dao.MensajeRepository;
import es.fesac.noticias.model.Mensaje;
import es.fesac.noticias.model.beans.MensajesBeans;

@Controller
public class MensajesController {

	@Autowired
	private MensajeRepository mensajeRepository;
	
	@GetMapping(path="/allMensajes")
	public @ResponseBody Iterable<Mensaje> getAllMensaje(){
		return mensajeRepository.findAll();
	}
	
	/*@GetMapping(value="/pagina")
	public String mostrarPagina(@ModelAttribute ("MensajeSelecionado") MensajesBeans mensajes ,Model model) {
		Mensaje m = mensajeRepository.findById(mensajes.)
		model.addAttribute("mostrarMensaje")
	}
	*/
}
