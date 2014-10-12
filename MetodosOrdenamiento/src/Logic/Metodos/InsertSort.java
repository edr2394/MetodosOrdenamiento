package Logic.Metodos;

import Logic.Estructuras.Arreglos;

/**
 *
 * @author emily
 */

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
     * @param Arreglo desordenado de enteros.
     * @return EL arreglo ordenado.
     */
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

}//Fin de la clase InsertSort
