package io.eddumelendez.jib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eddú Meléndez
 */
@RestController
public class GreetingController {

	@GetMapping("/hi")
	public String hi() {
		return "Bienvenidos al Google IO Extended!!!";
	}

}
