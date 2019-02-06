package es.fesac.noticias.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.fesac.noticias.dao.UsuarioRepository;
import es.fesac.noticias.model.Usuario;
import es.fesac.noticias.model.beans.LoginBeans;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping(value="/iniciar")
	public String inicio(Model model){
		model.addAttribute("validarUsuario",new LoginBeans());
		return "";
	}
	
	@PostMapping(value="/login")
	public String validarLogin(@ModelAttribute("validarUsuario") LoginBeans login, Model model) {
		Usuario u = usuarioRepository.getByEmailAndPassword(login.getEmail(), login.getContraseña());
		if(u!= null) {
			return "";
		}
		else {
			login.setContraseña("");
			model.addAttribute("usuarioLogin",login);
			model.addAttribute("Error","Contraseña o Usuario Incorrecta");
			return "";
		}
		
	}
}
