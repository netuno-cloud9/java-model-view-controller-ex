/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.JurosCompostos;
import Model.JurosSimples;

/**
 *
 * @author SENAI
 */
public class Controller {
    
    public float calculaJuros(float valorInicial, int qtdMeses, String tipo, float taxa){
        if(tipo.equals("Simples")){
            JurosSimples j = new JurosSimples();
            return j.calculaJuros(valorInicial, qtdMeses, taxa);
        } else if (tipo.equals("Composto")){
            JurosCompostos k = new JurosCompostos();
            return k.calculaJuros(valorInicial, qtdMeses, taxa);
        }
        return 0;
    }
    
}
