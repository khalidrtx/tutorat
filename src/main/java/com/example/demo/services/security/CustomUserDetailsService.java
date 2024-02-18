package com.example.demo.services.security;

import com.example.demo.dao.security.UtilisateurRepository;
import com.example.demo.entities.security.Utilisateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public CustomUserDetailsService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return utilisateur; // Return your custom Utilisateur instance
    }
    public Utilisateur loadUserById(Long userId) {
        return utilisateurRepository.findById(userId)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with id: " + userId));
    }
    
    public List<Utilisateur> getAllUtilisateur(){
		return utilisateurRepository.findAll();
	}
    
    public void deleteUtilisateurparid(Long id){
		this.utilisateurRepository.deleteById(id);
	}
    
}
