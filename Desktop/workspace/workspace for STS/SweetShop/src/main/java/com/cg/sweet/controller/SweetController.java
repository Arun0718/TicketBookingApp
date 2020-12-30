package com.cg.sweet.controller;


import com.cg.sweet.model.Sweet;
import com.cg.sweet.service.SweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/v1")
public class SweetController {

    
    @Autowired
    private SweetService sweetService;

    @GetMapping("/getSweet")
    public List<Sweet> getAllSweets() {
        return sweetService.getAllSweets();
    }
    

    @PostMapping("/newSweet")
    public Sweet createSweet( @RequestBody Sweet sweet) {
        return sweetService.createSweet(sweet);
    }
    

    @PutMapping("/sweet/{sweetId}")
    public Sweet updateSweet(@PathVariable Integer sweetId,  @RequestBody Sweet sweetRequest) {
        return sweetService.updateSweet(sweetId, sweetRequest);
    }


    @DeleteMapping("/sweet/{sweetId}")
    public ResponseEntity<?> deleteSweet(@PathVariable Integer sweetId) {
        return sweetService.deleteSweet(sweetId);
    }

}
//{ "categoryName":"gheesweet","productName":"mysorepak","rate":150.0}