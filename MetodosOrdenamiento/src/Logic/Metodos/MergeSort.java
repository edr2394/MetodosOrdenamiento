package Logic.Metodos;
import Logic.Estructuras.Arreglos;

 

public class MergeSort {
    /*
    Divide el arreglo por la mitad y crea dos sub-arreglos,
    toma cada uno de ellos y los sub divide, hasta lograr arreglos
    de 1 solo elemento, luego los uno combina en nuevos arreglo de 2 unidades,
    ordenados, luego vuelve a combinar los arreglos, hasta lograr un unico
    arreglo con todos los elementos.
    */
    
    private int[]array;
    private int[] Array_Temporal;
    private int largo;
    
    Arreglos Arreglo=new Arreglos();
    
    /**
     * Metodo para el ordenamiento de arreglos por MergeSort.
     * Recibe un arreglo, que contiene numeros
     * , y lo devuelve ordenado.
     * @param Arreglo desordenado.
     * @return El arreglo ordenado.
     * @param Array 
     */
    public void Merge_Array(int[] Array)
    {
        this.array=Array;
        this.largo=Array.length;
        this.Array_Temporal= new int[largo];
        MergeSort(0,largo-1);
     
    Arreglo.Imprimir_Arreglo(Array);
                
    }
    private void MergeSort(int indice_menor,int indice_mayor)//Crea los sub arreglos
        {
            if (indice_menor<indice_mayor)
            {
                int medio=indice_menor+(indice_mayor-indice_menor)/2;
                MergeSort(indice_menor,medio);
                MergeSort(medio+1,indice_mayor);
                Partes(indice_menor,medio,indice_mayor);
            }
        }
    private void Partes(int indice_menor,int medio,int indice_mayor)
        {
        for (int i=indice_menor;i<=indice_mayor;i++)
            {
            Array_Temporal[i]=array[i];
            }
        
        int i=indice_menor;
        int j= medio+1;
        int k=indice_menor;
        
        while(i<=medio && j<=indice_mayor)
            {
                if (Array_Temporal[i]<=Array_Temporal[j])
                {
                    array[k]=Array_Temporal[i];
                    i++;
                } else
                    {
                    array[k]=Array_Temporal[j];
                    j++;
                    }
                k++;
            }
        while(i<=medio)
            {
            array[k]=Array_Temporal[i];
            k++;
            i++;
            }
    
        }
}


