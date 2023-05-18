package it.ErdisonDosti.service;

import it.ErdisonDosti.converter.PharmaciaConverter;
import it.ErdisonDosti.dao.PharmacyRepository;
import it.ErdisonDosti.dao.UserRepository;
import it.ErdisonDosti.dto.PharmaciaDTO;
import it.ErdisonDosti.entity.Pharmacy;
import it.ErdisonDosti.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PharmacyService {


    private final UserRepository userRepository;
    private final PharmaciaConverter pharmaciaConverter;





    public PharmaciaDTO getPharamcyOfUserLoged() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            Optional<User> result= userRepository.findByEmail(userDetails.getUsername());
            return  pharmaciaConverter.toDTO(result.get().getPharmacia());
        } else {
            throw  new ResponseStatusException(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
        }
    }
}
