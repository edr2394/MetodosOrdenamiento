package Logic.Interfaces;
import Logic.Estructuras.Nodo;
public interface InterNodo <E> 
{
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
