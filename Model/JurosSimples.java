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
public class JurosSimples {
    
    public float calculaJuros(float valorInicial, int qtdMeses, float taxa){
        float resultado = valorInicial;
        float juros = valorInicial * taxa / 100;
        for (int i = 0; i < qtdMeses; i++) {
            resultado = resultado += juros;
        }
        return resultado;
    }
    
}
