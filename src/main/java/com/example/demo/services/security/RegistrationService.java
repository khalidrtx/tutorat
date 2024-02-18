package com.example.demo.services.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dao.security.RoleRepository;
import com.example.demo.dao.security.UtilisateurRepository;
import com.example.demo.entities.security.Role;
import com.example.demo.entities.security.Utilisateur;


@Service
public class RegistrationService {

    private final UtilisateurRepository utilisateurRepository;
    private final RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    public RegistrationService(UtilisateurRepository utilisateurRepository, RoleRepository roleRepository) {
        this.utilisateurRepository = utilisateurRepository;
        this.roleRepository = roleRepository;
    }

  
    public void registerNewUser(String username, String password) {
        Utilisateur newUser = new Utilisateur();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password));
        newUser.setEnabled(true); // Set to true by default
        // Retrieve the "USER" role from the database
        Role userRole = roleRepository.findByName("USER");
        // Assign retrieved role "USER" to the user
        newUser.addRole(userRole);
        utilisateurRepository.save(newUser);
    }
}
