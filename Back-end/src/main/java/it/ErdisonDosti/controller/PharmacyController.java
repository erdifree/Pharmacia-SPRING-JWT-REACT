package it.ErdisonDosti.controller;


import com.sun.security.auth.UserPrincipal;
import it.ErdisonDosti.dto.PharmaciaDTO;
import it.ErdisonDosti.service.PharmacyService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/pharmacy")
@RequiredArgsConstructor
public class PharmacyController {


    private final PharmacyService service;


    @GetMapping("/userloged")
    public PharmaciaDTO getPharmacyByUser(){

        return service.getPharamcyOfUserLoged();
    }

}
