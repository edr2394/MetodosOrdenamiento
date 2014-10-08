package Logic.Estructuras;
public class Nodo<E> 
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
    
    public void setsiguiente(Nodo<E> siguiente) 
    {
        this.siguiente = siguiente;
    }

    public Nodo<E> getsiguiente() 
    {
        return this.siguiente;
    }
    
    public void setelemento(E pelemento)
    {
        this.elemento = pelemento;
    }
    
    public E getelemento() 
    {
        return this.elemento;
    }
}

