package ifrn.pi.eve.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eve.repositories.EventoRepository;

@Controller
public class EventosController {
	
	@Autowired
	private EventoRepository er;

	@RequestMapping("/eventos/form")
	public String form() {
	return "formEvento";

	}

	
	@RequestMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return "evento-adicionado";
	}
	
}
