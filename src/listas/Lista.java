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
public class Lista {
    
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }
    
    public void insertarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguienteNodo(cabeza);
        cabeza = nuevoNodo;
    }
    
    public String mostrarLista() {
        
        Nodo nodoActual = cabeza;
        String datos = "{\"array\": [";
        while(nodoActual != null) {
            datos += nodoActual.getDato();
            nodoActual = nodoActual.getSiguienteNodo();
            if(nodoActual != null) {
                datos += ",";
            }
        }
        datos += "]}";
        
        return datos;
    }
    
}
