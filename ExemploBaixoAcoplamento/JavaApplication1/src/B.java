/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENAI
 */
public class B implements Gen{

    private String nome;
    private int idade;

    public B(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Nome = "+ nome + "Idade= "+ idade);
    }
    
    public void mostrarB(){
        System.out.println(nome);
    }

    @Override
    public String getInfo1() {
        return nome;
    }

    @Override
    public int getInfo2() {
        return idade;
    }
    
}
