package Logic.Estructuras;
import Logic.Interfaces.InterNodoDoble;

public class NodoDoble<E> implements InterNodoDoble<E>
{
    protected E elemento;
    protected NodoDoble<E> siguiente;    
    protected NodoDoble<E> anterior;
    
    public NodoDoble(E elemento) 
    {
        this.elemento = elemento;
        this.siguiente = null;
        this.anterior=null;
    }
    
    public NodoDoble(E elemento, NodoDoble<E> siguiente, NodoDoble<E> anterior) 
    {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    @Override
    public void setNext(NodoDoble<E> siguiente) 
    {
        this.siguiente = siguiente;
    }
    
    @Override
    public NodoDoble<E> getNext() 
    {
        return this.siguiente;
    }
    @Override
    public void setPrevio(NodoDoble<E> anterior){
        this.anterior=anterior;        
    }
    @Override
    public NodoDoble<E> getPrevio(){
        return this.anterior;
    }
    
    @Override 
    public void setElemt(E pelemento)
    {
        this.elemento = pelemento;
    }
    
    @Override
    public E getElemt() 
    {
        return this.elemento;
    }
}

