package Logic.Metodos;

import Logic.Estructuras.Arreglos;

/**
 *
 * @author emily
 */

public class SelectionSort {
     
    Arreglos Arreglo=new Arreglos();
    
    public void Selection_Array(int [] Array)
    {
     for (int i=0;i<Array.length-1;i++)
     {
         int indice=i;
         for (int j=i+1;j<Array.length;j++)
         {
           if (Array[j]<Array[indice])
               indice=j;
           int Numero_Menor=Array[indice];
           Array[indice]=Array[i];
           Array[i]=Numero_Menor;
         }
     }   
       
     Arreglo.Imprimir_Arreglo(Array);
       
   }
    
}

