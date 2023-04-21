
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENAI
 */
public class A {
    List<Gen> lista = new ArrayList<>();
    private Gen generico = new C("3247923747", 2000);
    
    public void adicionarB(){
        B pessoa1 = new B("Fulano", 19);
        lista.add(pessoa1);
        Gen i = lista.get(0);
        if (i instanceof B){
            B j = new B(i.getInfo1(), i.getInfo2());
            j.mostrarB();
        } else if (i instanceof C){
            C k = new C(i.getInfo1(), i.getInfo2());
            k.mostraC();
        }
        
    }
    
    public void adicionarC(){
        C pessoa1 = new C("4373590343", 1995);
        lista.add(pessoa1);
    }
}
