package gob.mef.hcardenas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsuarioResource {
	
	
	@RequestMapping("/rest/usuario/server")
	public String usuario(@RequestParam(value="id", defaultValue="1") String id) {
		String usuario = "";
		switch (id) {
			case "1" : usuario = "juan";
			break;
			case "2" : usuario = "carlos";
			break;
		}
		
		return "Hola " + usuario + " desde el servidor";
	}
}
