 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.util.Scanner;

/**
 *
 * @author SENAI
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor inicial");
        float valor = scan.nextFloat();
        System.out.println("Digite a taxa");
        float taxa = scan.nextFloat();
        //scan.close();
        //scan = new Scanner(System.in);
        System.out.println("Digite o tempo em meses");
        int meses = scan.nextInt();
        System.out.println("Digite 1 para Juros Simples e 2 para Juros Composto");
        int tipo = scan.nextInt();
        String tipo2 = null;
        switch(tipo){
            case 1:
                tipo2 = "Simples";
                break;
            case 2:
                tipo2 = "Composto";
                break;
            default:
                System.out.println("Opção inválida");
        }
        
        Controller c = new Controller();
        System.out.printf("%.2f", c.calculaJuros(valor, meses, tipo2, taxa));
    }
}
