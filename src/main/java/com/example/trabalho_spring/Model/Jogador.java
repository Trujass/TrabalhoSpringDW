package com.example.trabalho_spring.Model;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "jogador")
public class Jogador {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long cod_jogador;   

    @Column(nullable = false, length = 60)
    private String nome;

    @Column(nullable = false, length = 60)
    private String email;

    @Column(nullable = false)
    private LocalDate datanasc;

    public Jogador(){

    }

    public Jogador(String nome, String email, LocalDate datanasc){
        this.nome = nome;
        this.email = email;
        this.datanasc = datanasc;
    }


    public long getCod_jogador(){
        return this.cod_jogador;
    }
    public void setCod_jogador(long cod_jogador){
        this.cod_jogador = cod_jogador;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public LocalDate getDatanasc(){
        return this.datanasc;
    }
    public void setDatanasc(LocalDate datanasc){
        this.datanasc = datanasc;
    }
    public String toString(){
        return "Jogador{" +  "cod_jogador= " + cod_jogador + ", nome='" + nome + '\'' + ", email='" + email + '\'' + ", datanasc=" + datanasc + '\'' + '}';
    }
}
