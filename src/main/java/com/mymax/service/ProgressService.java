package com.mymax.service;

import com.mymax.model.request.ProgressRegisterRequestDTO;
import com.mymax.model.response.ProgressRegisterResponseDTO;

public interface ProgressService {

	ProgressRegisterResponseDTO create(ProgressRegisterRequestDTO request);
	ProgressRegisterResponseDTO findOneById(String id);
	void deleteOneById(String id);
	ProgressRegisterResponseDTO update(String id, ProgressRegisterRequestDTO request);
	Boolean isExistById(String id);
	
}
