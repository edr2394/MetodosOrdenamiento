package Logic.Interfaces;
import Logic.Estructuras.NodoDoble;
public interface InterNodoDoble <E> 
{
    /**
     * Retorna el nodo anterior
     * @return 
     */
    public NodoDoble<E> getPrevio();
    /**
     * Establece el Nodo anterior.
     * @param anterior 
     */
    public void setPrevio(NodoDoble<E> anterior);
    /**
     * Establece el siguiente nodo.
     * @param siguiente 
     */
    public void setNext(NodoDoble<E> siguiente);
    /**
     * Retorna el siguiente nodo.
     * @return 
     */
    public NodoDoble<E> getNext();
     /**
      * Establece el elemento que va a guardar el nodo;
      * @param pelemento 
      */        
    public void setElemt(E pelemento);
    /**   
      * retorna el valor que guarda el nodo.
      * @return 
      */
    public E getElemt();       
}
