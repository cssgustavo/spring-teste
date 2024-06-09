package com.github.gustavo.spg_project.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Model: Modelagem da tabela e suas colunas 

@Entity
@Table(name = "motoristas")    
public class Motorista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "motorista_nome", nullable = false, length = 60)
	private String motorista_nome;

    @Column(name = "motorista_placa", nullable = false, length = 7)
	private String motorista_placa;

    @Column(name = "motorista_carro", nullable = false, length = 60)
	private String motorista_carro;
    
    @Column(name = "motorista_doc", nullable = false, length = 15)
	private String motorista_doc;

    @Column(name = "motorista_data", nullable = false, columnDefinition = "DATE")
	private LocalDate motorista_data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotorista_nome() {
        return motorista_nome;
    }

    public void setMotorista_nome(String motorista_nome) {
        this.motorista_nome = motorista_nome;
    }

    public String getMotorista_placa() {
        return motorista_placa;
    }

    public void setMotorista_placa(String motorista_placa) {
        this.motorista_placa = motorista_placa;
    }

    public String getMotorista_carro() {
        return motorista_carro;
    }

    public void setMotorista_carro(String motorista_carro) {
        this.motorista_carro = motorista_carro;
    }

    public String getMotorista_doc() {
        return motorista_doc;
    }

    public void setMotorista_doc(String motorista_doc) {
        this.motorista_doc = motorista_doc;
    }

    public LocalDate getMotorista_data() {
        return motorista_data;
    }

    public void setMotorista_data(LocalDate motorista_data) {
        this.motorista_data = motorista_data;
    }


}       
