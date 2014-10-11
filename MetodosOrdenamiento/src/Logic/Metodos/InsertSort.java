package Logic.Metodos;

import Logic.Estructuras.Arreglos;

/**
 *
 * @author emily
 */

public class InsertSort {
   /*
    
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
        for (int i=1;i<Array.length; i++)
        {
           int tmp=Array[i];
           
           for (int j=i-1;j>=0 && tmp<Array[j];j--)
           {
               Array[j+1]=Array[j];
               Array[j+1]=tmp;
           }    
        } 
        Arreglo.Imprimir_Arreglo(Array);
        
    }//Fin del Metodo InsertSort para Arreglos de enteros.

}//Fin de la clase InsertSort
