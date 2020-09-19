package com.mymax.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymax.entity.ProspectingCustomerProgress;
import com.mymax.exception.rest.StoreException;
import com.mymax.helper.DateTimeHelper;
import com.mymax.model.request.ProgressRegisterRequestDTO;
import com.mymax.model.response.ProgressRegisterResponseDTO;
import com.mymax.repository.MasterProspectingStatusRepository;
import com.mymax.repository.MasterReligionRepository;
import com.mymax.repository.ProspectingCustomerProgressRepository;
import com.mymax.repository.ProspectingCustomerRepository;

@Service
public class ProgressServiceImpl implements ProgressService {

	@Autowired
	ProspectingCustomerRepository prospectingCustomerRepository;
	@Autowired
	private MasterProspectingStatusRepository masterProspectingStatusRepository;
	@Autowired
	MasterReligionRepository masterReligionRepository;
	@Autowired
	private ProspectingCustomerProgressRepository prospectingCustomerProgressRepository;
	
	@Override
	public ProgressRegisterResponseDTO create(ProgressRegisterRequestDTO request) {
		
		ProspectingCustomerProgress newData = new ProspectingCustomerProgress();
		String prospectingCustomerProgressId = "PCP" + DateTimeHelper.getCurentTimestamp();
		LocalDate currDate = LocalDate.now();
		LocalTime currTime = LocalTime.now();
		
		newData.setId(prospectingCustomerProgressId);		
		newData.setProspectingDate(currDate);
		newData.setProspectingTime(currTime);
		newData.setCustomer(prospectingCustomerRepository.findById(request.getProspectingCustomerId()).get());
		newData.setProspectingStatus(masterProspectingStatusRepository.findById(request.getProspectingStatusId()).get());
		newData.setNote(request.getNote());		
		
		try {
			prospectingCustomerProgressRepository.save(newData);
		} catch (Exception e) {
			throw new StoreException(e.getLocalizedMessage());
		}
		
		ProgressRegisterResponseDTO response = new ProgressRegisterResponseDTO();
		response.setProgressId(prospectingCustomerProgressId);
		response.setProspectingCustomerId(request.getProspectingCustomerId());
		response.setProspectingDate(currDate);
		response.setProspectingTime(currTime);
		response.setProspectingStatusId(masterProspectingStatusRepository.findById(request.getProspectingStatusId()).get().getId());
		response.setProspectingStatusDescription(masterProspectingStatusRepository.findById(request.getProspectingStatusId()).get().getName());
		response.setNote(request.getNote());
		
		return response;
	}

	
	@Override
	public ProgressRegisterResponseDTO findOneById(String id) {
		ProgressRegisterResponseDTO response = new ProgressRegisterResponseDTO();
		
		Optional<ProspectingCustomerProgress> optionalData =  prospectingCustomerProgressRepository.findById(id);
		if (optionalData.isPresent()) {
			response.setProgressId(optionalData.get().getId());
			response.setProspectingCustomerId(optionalData.get().getCustomer().getId());
			response.setProspectingDate(optionalData.get().getProspectingDate());
			response.setProspectingTime(optionalData.get().getProspectingTime());
			response.setProspectingStatusId(optionalData.get().getProspectingStatus().getId());
			response.setProspectingStatusDescription(optionalData.get().getProspectingStatus().getName());
			response.setNote(optionalData.get().getNote());			
		} else {
			response = null;
		}
		
		return response;
	}

	
	@Override
	public void deleteOneById(String id) {
		prospectingCustomerProgressRepository.deleteById(id);
	}


	@Override
	public ProgressRegisterResponseDTO update(String id, ProgressRegisterRequestDTO request) {
		LocalDate currDate = LocalDate.now();
		LocalTime currTime = LocalTime.now();
		Optional<ProspectingCustomerProgress> updateData = prospectingCustomerProgressRepository.findById(id);

	    if (updateData.isPresent()) {
	    	updateData.get().setProspectingDate(currDate);
	    	updateData.get().setProspectingTime(currTime);
	    	updateData.get().setCustomer(prospectingCustomerRepository.findById(request.getProspectingCustomerId()).get());
	    	updateData.get().setProspectingStatus(masterProspectingStatusRepository.findById(request.getProspectingStatusId()).get());
	    	updateData.get().setNote(request.getNote());		
			
			try {
				prospectingCustomerProgressRepository.save(updateData.get());
			} catch (Exception e) {
				throw new StoreException(e.getLocalizedMessage());
			}
			
			ProgressRegisterResponseDTO response = new ProgressRegisterResponseDTO();
			response.setProgressId(id);
			response.setProspectingCustomerId(request.getProspectingCustomerId());
			response.setProspectingDate(currDate);
			response.setProspectingTime(currTime);
			response.setProspectingStatusId(masterProspectingStatusRepository.findById(request.getProspectingStatusId()).get().getId());
			response.setProspectingStatusDescription(masterProspectingStatusRepository.findById(request.getProspectingStatusId()).get().getName());
			response.setNote(request.getNote());
			
			return response;
			
	    } else {
	      return null;
	    }
	}	
	
	@Override
	public Boolean isExistById(String id) {
		if (prospectingCustomerProgressRepository.findById(id).isPresent()) {
			return true;
		} 
		
		return false;
	}

}
