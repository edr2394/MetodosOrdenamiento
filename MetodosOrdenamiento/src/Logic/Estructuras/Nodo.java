package Logic.Estructuras;
import Logic.Interfaces.InterNodo;

public class Nodo<E> implements InterNodo<E>
{
    protected E elemento;
    protected Nodo<E> siguiente;    
    
    public Nodo(E elemento) 
    {
        this.elemento = elemento;
        this.siguiente = null;
    }
    
    public Nodo(E elemento, Nodo<E> siguiente, Nodo<E> anterior) 
    {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    @Override
    public void setsiguiente(Nodo<E> siguiente) 
    {
        this.siguiente = siguiente;
    }
    
    @Override
    public Nodo<E> getsiguiente() 
    {
        return this.siguiente;
    }
    
    @Override 
    public void setelemento(E pelemento)
    {
        this.elemento = pelemento;
    }
    
    @Override
    public E getelemento() 
    {
        return this.elemento;
    }
}

