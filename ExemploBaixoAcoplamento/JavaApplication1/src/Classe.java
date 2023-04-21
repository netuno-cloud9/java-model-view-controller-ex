/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENAI
 */
public abstract class Classe {
    private String nome;

    public Classe(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract void mostrarInfo();
}
