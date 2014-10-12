package Logic.Metodos;
import Logic.Estructuras.Arreglos;

<<<<<<< HEAD
import Logic.Estructuras.ListaDoble;
import Logic.Estructuras.NodoDoble;

/**
 *
 * @author emily
 */

public class InsertSort {
    
    
=======

public class InsertSort {
   
    /* 
    Se toma el primer elemento y se considera que ya esta ordenado,
    luego se toma el elemento siguiente, se compara con los ya ordenados, 
    cuando se encuentra que este es menor que uno del arreglo, se inserta en esa posicion
    y los elementos mayores se desplazan a la derecha.
    
    */
    
    Arreglos Arreglo=new Arreglos();
    
    /** Metodo para el Ordenamiento de Arreglos por InsertSort.
     * Recibe un arreglo que contiene numeros enteros desordenados, 
     * y los ordena por medio de InsertSort.
     * @param Arreglo desordenado.
     * @return EL arreglo ordenado.
     */
>>>>>>> 8be381fa909034b3341798b66524c77ad0ffa4a7
    public void Insert_Array(int[] Array)
    {
     int j; 
     for (int i = 1; i < Array.length; i++)    
     {
        int temporal = Array[ i ];
        
                for(j = i - 1; (j >= 0) && (Array[ j ] > temporal); j--)   
                {
                     Array[ j+1 ] = Array[ j ];
                }
                
         Array[ j+1 ] = temporal;    
     }
         
        Arreglo.Imprimir_Arreglo(Array);
        
    }//Fin del Metodo InsertSort para Arreglos de enteros.

<<<<<<< HEAD
    }//Termina el Metodo InsertSort para Arreglos con entero
    
    public ListaDoble Insert_Lista(ListaDoble Lista)
    {
        if(Lista.tamaño()<=3){
            if(Lista.tamaño()==2)
            {
                NodoDoble Ultimo=Lista.getHead();
                NodoDoble actual=Ultimo.getNext();
                int elemactual=(int) actual.getElemt();
                int elemUltimo=(int) Ultimo.getElemt();
                if(elemactual < elemUltimo){
                    NodoDoble temp = Ultimo;                   
                    Ultimo.setNext(actual.getNext());
                    Lista.setHead(actual);
                    actual.setNext(Ultimo);
                    Lista.getHead().setPrevio(null);
                    Ultimo.setPrevio(actual);
                    Ultimo.setNext(temp.getNext());
                    
                }            
            }
        }
        else{
            NodoDoble Ultimo=Lista.getHead();
            NodoDoble actual=Ultimo.getNext();
            int elemactual=(int) actual.getElemt();
            int elemUltimo=(int) Ultimo.getElemt();
            if(elemactual < elemUltimo){
                NodoDoble temp = Ultimo;                 
                Ultimo.setNext(actual.getNext());
                Lista.setHead(actual);
                actual.setNext(Ultimo);
                Lista.getHead().setPrevio(null);
                Ultimo.setPrevio(actual);
                Ultimo.setNext(temp.getNext());
            }   
            
            
            else{
                Ultimo=actual;
                actual=Ultimo.getNext();
            }
            while(actual.getNext()!=null){
                Ultimo=Lista.getHead();
                actual=Ultimo.getNext();
                elemactual=(int) actual.getElemt();
                elemUltimo=(int) Ultimo.getElemt();
                if(elemactual<elemUltimo){
                    NodoDoble Cambia=Ultimo;
                    int elemCambia=(int) Cambia.getElemt();
                    while(elemCambia>elemactual && Cambia.getPrevio()!=null)
                    {
                        Cambia=Cambia.getPrevio();
                        elemCambia=(int) Cambia.getElemt();
                    }
                    NodoDoble temp1=Cambia.getNext();
                    NodoDoble temp2=actual;
                    Cambia.setNext(temp2);
                    temp2.setPrevio(Cambia);
                    temp2.setNext(temp1);
                    temp1.setPrevio(temp2);
                    temp1.setNext(actual.getNext());
                    temp1.getNext().setNext(temp1);
                    actual=temp1.getNext();                                        
                }
                else{
                    Ultimo=actual;
                    actual=Ultimo.getNext();
                }
            }                     
        }                                              
        return Lista;
    }        

}
=======
}//Fin de la clase InsertSort
>>>>>>> 8be381fa909034b3341798b66524c77ad0ffa4a7
