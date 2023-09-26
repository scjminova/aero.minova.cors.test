package aero.minova.cors.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/cors-test")
    public ResponseEntity<String> myGetMethod() {
        System.out.println("CORS_TEST");
        return ResponseEntity.ok().body("Hallo von Spring Boot!");
    }
}
