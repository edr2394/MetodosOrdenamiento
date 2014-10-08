package Logic.Estructuras;

import Logic.Interfaces.InterNodo;

public class Nodo<E> implements InterNodo
{
    
    protected E elemento;
    protected Nodo<E> siguiente;
    
    public Nodo(E elemento) 
    {
        this.elemento = elemento;
        this.siguiente = null;
    }
    
    public Nodo(E elemento, Nodo<E> siguiente) 
    {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    @Overide
    public void setsiguiente(Nodo<E> siguiente) 
    {
        this.siguiente = siguiente;
    }

    public Nodo<E> getsiguiente() 
    {
        return this.siguiente;
    }
    @Overide 
    public void setelemento(E pelemento)
    {
        this.elemento = pelemento;
    }
    
    public E getelemento() 
    {
        return this.elemento;
    }

    @Override
    public void setsiguiente(Nodo siguiente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setelemento(Object pelemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

