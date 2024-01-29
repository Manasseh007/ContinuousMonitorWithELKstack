package Controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("/test")
	public String logMethod() {
		logger.info("Hello From Spring Boot Logging Application.");
		logger.info("This is a sample information message.");
		logger.warn("This is a warning!!!");
		logger.error("This is the error message!!");
		
		return "This is a way to Simplify Technology";
	}
	@GetMapping
	public ResponseEntity<Map<String, String>> test() {
		return ResponseEntity.ok().body(Map.of("Testing", "Up and Running"));
	}

}
