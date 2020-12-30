package com.cg.sweet.controller;

import com.cg.sweet.model.Offer;
import com.cg.sweet.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class OfferController {

    
    @Autowired
    private OfferService offerService;
    
    
    @GetMapping("/sweet/{sweetId}/offers")
    public List<Offer> getAllOffersBySweetId(@PathVariable(value ="sweetId") Integer sweetId ) {
                                              
        return offerService.getAllOffersBySweetId(sweetId);
        		
    }
    

    @PostMapping("/sweet/{sweetId}/newOffer")
    public Offer createOffer(@PathVariable(value ="sweetId") Integer sweetId,
                                  @RequestBody Offer offer) {
        return offerService.createOffer(sweetId, offer);
    }
    

    @PutMapping("/sweet/{sweetId}/offers/{offerId}")
    public Offer updateOffer(@PathVariable (value ="sweetId")  Integer sweetId,
                                 @PathVariable (value ="offerId")  Integer offerId,
                                  @RequestBody Offer offerRequest) {
        return offerService.updateOffer(sweetId, offerId, offerRequest);
    }
    

    @DeleteMapping("/sweet/{sweetId}/offers/{offerId}")
    public ResponseEntity<?> deleteOffer(@PathVariable (value ="sweetId") Integer sweetId,
                              @PathVariable (value ="offerId") Integer offerId) {
    	return offerService.deleteOffer(sweetId, offerId);
    }
    
}//{ "offerName":"newyear","offerRate":100.0}
