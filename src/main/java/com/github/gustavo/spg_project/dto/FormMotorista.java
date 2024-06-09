package com.github.gustavo.spg_project.dto;

import java.time.LocalDate;

import com.github.gustavo.spg_project.model.Motorista;

public class FormMotorista {

    private Long id;
    private String motorista_nome;
    private String motorista_placa;
    private String motorista_carro;
    private String motorista_doc;
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

    public FormMotorista toForm(Motorista motorista){
        this.id = motorista.getId();
        this.motorista_nome = motorista.getMotorista_nome();
        this.motorista_placa = motorista.getMotorista_placa();
        this.motorista_carro = motorista.getMotorista_carro();
        this.motorista_doc = motorista.getMotorista_doc();
        this.motorista_data = motorista.getMotorista_data();
        return this;
    }

    public Motorista toModel() {
		Motorista motorista = new Motorista();
		motorista.setId(this.getId());
        motorista.setMotorista_nome(this.getMotorista_nome());
        motorista.setMotorista_placa(this.getMotorista_placa());
        motorista.setMotorista_carro(this.getMotorista_carro());
        motorista.setMotorista_doc(this.getMotorista_doc());
        motorista.setMotorista_data(this.getMotorista_data());
		return motorista;
	}
    
}

