package s22.vko01Teht2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class T2Controller {

	@RequestMapping("hello")
	@ResponseBody
	public String welcome(
			@RequestParam(name="location", required=false, defaultValue="Earth") String paikka, 
			@RequestParam(name="name", required=false, defaultValue="Leo") String nimi) {
		
		return "Welcome to the " + paikka + " " + nimi + "!";
	}
}
