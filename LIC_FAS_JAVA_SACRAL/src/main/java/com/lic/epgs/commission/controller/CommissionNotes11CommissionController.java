package com.lic.epgs.commission.controller;

import java.time.LocalDateTime;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.CommissionNotes11Commission;
import com.lic.epgs.commission.model.CommissionNotes11CommissionResponse;
import com.lic.epgs.commission.service.CommissionNotes11CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionNotes11CommissionController {

    @Autowired
    private CommissionNotes11CommissionService commissionNotes11CommissionService;
    
    @PostMapping
    public ResponseEntity<CommissionNotes11Commission> save(@RequestBody CommissionNotes11Commission commissionNotes11Commission){
        CommissionNotes11Commission savedCommissionNotes11Commission = commissionNotes11CommissionService.save(commissionNotes11Commission);
        return ResponseEntity.ok(savedCommissionNotes11Commission);
    }
    
    @GetMapping("/{commissionId}")
    public ResponseEntity<Optional<CommissionNotes11Commission>> findById(@PathVariable Long commissionId){
        Optional<CommissionNotes11Commission> commissionNotes11Commission = commissionNotes11CommissionService.findById(commissionId);
        return ResponseEntity.ok(commissionNotes11Commission);
    }
    
    @GetMapping("/response/{commissionId}")
    public ResponseEntity<CommissionNotes11CommissionResponse> findResponseById(@PathVariable Long commissionId){
        CommissionNotes11CommissionResponse commissionNotes11CommissionResponse = commissionNotes11CommissionService.findResponseById(commissionId);
        return ResponseEntity.ok(commissionNotes11CommissionResponse);
    }
    
    @PutMapping("/{commissionId}")
    public ResponseEntity<String> deactivateCommissionNotes11Commission(@PathVariable Long commissionId, @RequestBody LocalDateTime modifiedDate, @RequestBody Long modifiedUser){
        commissionNotes11CommissionService.deactivateCommissionNotes11Commission(commissionId, modifiedDate, modifiedUser);
        return new ResponseEntity<String>("Commission notes deactivated successfully!", HttpStatus.OK);
    }
    
    @DeleteMapping("/{commissionId}")
    public ResponseEntity<String> deleteById(@PathVariable Long commissionId){
        commissionNotes11CommissionService.deleteById(commissionId);
        return new ResponseEntity<String>("Commission notes deleted successfully!", HttpStatus.OK);
    }
}