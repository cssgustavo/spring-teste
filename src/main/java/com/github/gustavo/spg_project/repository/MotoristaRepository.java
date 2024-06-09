package com.github.gustavo.spg_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.gustavo.spg_project.model.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository <Motorista, Long> {

}
