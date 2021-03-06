package com.cg.sweet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.sweet.exception.ResourceNotFoundException;
import com.cg.sweet.model.Sweet;
import com.cg.sweet.repository.SweetRepository;

@Service
@Transactional
public class SweetServiceImpl implements SweetService{
	
	@Autowired
	private SweetRepository sweetRepository;

	@Override
	public List<Sweet> getAllSweets() {
		
		return sweetRepository.findAll();
	}

	@Override
	public Sweet createSweet(Sweet sweet) {
		
		return sweetRepository.save(sweet);
	}

	@Override
	public ResponseEntity<?> deleteSweet(Integer sweetId){
        return sweetRepository.findById(sweetId).map(post -> {
            sweetRepository.delete(post);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("SweetId " + sweetId + " not found"));
    }

	@Override
	public Sweet updateSweet(Integer sweetId, Sweet sweetRequest) {
		
		
		 return sweetRepository.findById(sweetId).map(sweet -> {
	            sweet.setCategoryName(sweetRequest.getCategoryName());
	            sweet.setProductName(sweetRequest.getProductName());
	            sweet.setRate(sweetRequest.getRate());
	            return sweetRepository.save(sweet);
	            
	        }).orElseThrow(() -> new ResourceNotFoundException("SweetId " + sweetId + " not found"));
	    }
	

}
