package br.com.dev4j.loterias;

import org.springframework.http.ResponseEntity;

//@RestController
public class PrimeiroWsController {

    //    @GetMapping
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello World");
    }
}
