/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s112e5
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.insertarNodo(33);
        lista.insertarNodo(44);
        lista.insertarNodo(55);
        lista.insertarNodo(66);
        lista.insertarNodo(443);
        
        System.out.println(lista.mostrarLista());
    }
    
}
