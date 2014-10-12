package Logic.Interfaces;
import Logic.Estructuras.NodoDoble;

public interface interListaDoble<E> 
{
 /**
  * Devuelve la lista vacia
  * @return 
  */
  public boolean vacio();
  /**
   * Añade al final de la lista.
   * @param pelemento
   * @return 
   */
  public boolean agregar(E pelemento);
  /**
   * Elimina el elemento especificado en el parametro.
   * @param pelemento
   * @return 
   */
  public boolean eliminar(E pelemento);
  /**
   * Devuelve el numero de elementos que contiene la lista.
   * @return  
   */
  public int tamaño();
  /**
   * Inserta en la posición pos el elemento pelemento.
   * @param pos
   * @param pelemento
   * @return 
   */
  public boolean insertar(int pos, E pelemento);
  /**
   * Imprime en consola el o los elementos contenidos en cada nodo.
   */
  public void describir();
  /**
   * Toma el elemento contenido en el ultimo nodo de la lista.
   * @return 
   */
  public E getcola();
  /**
   * Toma el primer nodo de la lista.
   * @return 
   */
  public NodoDoble<E> getHead();
}
