package com.example.demo.dao.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.security.Utilisateur;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByUsername(String username);
}