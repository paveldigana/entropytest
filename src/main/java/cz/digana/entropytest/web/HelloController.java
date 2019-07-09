package cz.digana.entropytest.web;

import cz.digana.entropytest.model.Cat;
import cz.digana.entropytest.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    CatService catService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, welcome to Entropy Test Application. Everything works fine.");
    }

    @GetMapping("/cats")
    public ResponseEntity<List<Cat>> getVacations() {
        List<Cat> cats = catService.getCats();
        return ResponseEntity.ok(cats);
    }
}
