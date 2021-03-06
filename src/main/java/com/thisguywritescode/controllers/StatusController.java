package com.thisguywritescode.controllers;

import static com.thisguywritescode.utilities.Constants.SERVICE_SUCCESS;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Controller("statusController")
public class StatusController {
	@GetMapping(value = "/")
	// @CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<String> getStatus() {
		return new ResponseEntity<String>(SERVICE_SUCCESS, HttpStatus.OK);
	}
}
