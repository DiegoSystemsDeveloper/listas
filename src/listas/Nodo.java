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
public class Nodo {
    
    private Nodo siguienteNodo;
    private int dato;

    public Nodo( int dato) {
        this.siguienteNodo= null;
        this.dato = dato;
    }

    /**
     * @return the nodo
     */
    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    /**
     * @param nodo the nodo to set
     */
    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
}
