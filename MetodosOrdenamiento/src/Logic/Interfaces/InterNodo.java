/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Interfaces;

import Logic.Estructuras.Nodo;

/**
 *
 * @author santii
 * @param <E>
 */
public interface InterNodo <E> {
        /**
         * Establece el siguiente nodo.
         * @param siguiente 
         */
        public void setsiguiente(Nodo<E> siguiente);
        /**
         * Retorna el siguiente nodo.
         * @return 
         */
        public Nodo<E> getsiguiente();
        /**
         * Establece el elemento que va a guardar el nodo;
         * @param pelemento 
         */        
        public void setelemento(E pelemento);
        /**   
         * retorna el valor que guarda el nodo.
         * @return 
         */
        public E getelemento();
        
}
