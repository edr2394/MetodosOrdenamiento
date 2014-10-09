/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Metodos;

import Logic.Estructuras.Lista;
import Logic.Estructuras.Nodo;

/**
 *
 * @author santii
 */
public class BurbujaLista {
    private int Compara1;
    private int Compara2;
    private Nodo Iterador;
    private Nodo tempNodo;
    private Lista ListaOrdenada;
    
    
    public Lista BurbujaLista(Lista PorOrdenar){
        if(PorOrdenar.tamaño()<=1){
            this.ListaOrdenada=PorOrdenar;                       
        }
        else{
            this.ListaOrdenada=PorOrdenar;
            this.Iterador=ListaOrdenada.getcabeza();
            this.tempNodo=Iterador;
            this.Compara1=(int) Iterador.getelemento();
            this.Compara2=(int) Iterador.getsiguiente().getelemento();           
            
            while(tempNodo.getsiguiente()!=null){
                while(Iterador.getsiguiente()!=null){
                    this.Compara1=(int) Iterador.getelemento();                
                    this.Compara2=(int) Iterador.getsiguiente().getelemento();
                    if(Compara1>Compara2){
                        Iterador.setelemento(Compara2);               
                        Iterador.getsiguiente().setelemento(Compara1);                  
                    }
                    Iterador=Iterador.getsiguiente();
                }
                Iterador=ListaOrdenada.getcabeza();
                tempNodo=tempNodo.getsiguiente();
            }
        }
        return this.ListaOrdenada;
    }
}
