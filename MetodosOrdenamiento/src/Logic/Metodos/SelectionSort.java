package Logic.Metodos;
import Logic.Estructuras.Arreglos;


public class SelectionSort {
     /*
    Busca el elemento menor y lo intercambia por el primero,
    luego vuelve a buscar el menor y lo intercambia por el segundo,
    y asi sucesivamente.
    */
    
    Arreglos Arreglo=new Arreglos();
    
    /**Metodo para el ordenamiento de arreglos por SelectionSort.
     * Recibe una arreglo que contiene numeros,
     * en desorden y lo retorna ordenado.
     * @param Array 
     */
    public void Selection_Array(int [] Array)
    {
     for (int i=0;i<Array.length-1;i++)
     {
         int indice=i;
         for (int j=i+1;j<Array.length;j++)
         
           if (Array[j]<Array[indice])
               indice=j;
         
           int Numero_Menor=Array[indice];
           Array[indice]=Array[i];
           Array[i]=Numero_Menor;
     }
     
    Arreglo.Imprimir_Arreglo(Array);
       
   }// Fin del metodo Selection para Arrays con enteros.
    
}//Fin de la clase SelectionSort.

