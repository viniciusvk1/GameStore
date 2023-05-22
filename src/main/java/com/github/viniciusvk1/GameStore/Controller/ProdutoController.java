package com.github.viniciusvk1.GameStore.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/produtos")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
}
