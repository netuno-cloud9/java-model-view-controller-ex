/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENAI
 */
public class C implements Gen{

    private String cpf;
    private int ano;

    public C(String cpf, int ano) {
        this.cpf = cpf;
        this.ano = ano;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("CPF = "+ cpf+ "Ano Nascimento = "+ ano);
    }
    
    public void mostraC(){
        System.out.println(cpf);
    }

    @Override
    public String getInfo1() {
        return cpf;
    }

    @Override
    public int getInfo2() {
        return ano;
    }
    
}
