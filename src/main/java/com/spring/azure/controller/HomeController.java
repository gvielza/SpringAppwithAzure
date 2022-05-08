package com.spring.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping
	public String home() {
	return "Hola Jodido Spring con Azure";
}
}
