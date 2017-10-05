package com.projeto.puroverde.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cliente extends Pessoa {
	
    @Column(nullable = false,length = 15)
    private String cpf;
     
    @Column(nullable = false)
    private Date dataNasc;
	
	
    public String getCpf() {
	return cpf;
    }
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }	
}