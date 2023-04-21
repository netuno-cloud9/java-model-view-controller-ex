/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SENAI
 */
public class JurosCompostos {
    
    public float calculaJuros(float valorInicial, int qtdMeses, float taxa){
        float resultado = valorInicial;        
        for (int i = 0; i < qtdMeses; i++) {
            float juros = resultado * taxa / 100;
            resultado = resultado += juros;
        }
        return resultado;
    }
}
