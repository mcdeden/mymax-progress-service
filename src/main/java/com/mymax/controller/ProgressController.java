package com.mymax.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mymax.exception.rest.DataNotFoundException;
import com.mymax.exception.rest.DeleteException;
import com.mymax.model.request.ProgressRegisterRequestDTO;
import com.mymax.model.response.ProgressRegisterResponseDTO;
import com.mymax.service.ProgressService;

@RestController
@RequestMapping("progress")
public class ProgressController {

	@Autowired
	private ProgressService service;

	@PostMapping(value = "register")
	public ResponseEntity<ProgressRegisterResponseDTO> store(@Valid @RequestBody ProgressRegisterRequestDTO request) {		

		ProgressRegisterResponseDTO response = service.create(request);

		return new ResponseEntity<ProgressRegisterResponseDTO>(response, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<ProgressRegisterResponseDTO> getDetailProspecting(@PathVariable String id) {		

		ProgressRegisterResponseDTO response = service.findOneById(id);

		return new ResponseEntity<ProgressRegisterResponseDTO>(response, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<String> deleteProspecting(@PathVariable String id) {		

		try {
			service.deleteOneById(id);
		    return new ResponseEntity<String>("Data deleted",HttpStatus.NO_CONTENT);
		} catch (Exception e) {
		    throw new DeleteException(e.getLocalizedMessage());
		}
	}
	
	@PutMapping(value = "{id}")
	public ResponseEntity<ProgressRegisterResponseDTO> updateProspecting(@RequestParam String id, @Valid @RequestBody ProgressRegisterRequestDTO request) {		

		if (!service.isExistById(id)) {
		   	throw new DataNotFoundException("Prospecting customer with id: " + id + " is not found");
		}	
		
		ProgressRegisterResponseDTO response = service.update(id,request);

		return new ResponseEntity<ProgressRegisterResponseDTO>(response, HttpStatus.OK);
	}
	
}
