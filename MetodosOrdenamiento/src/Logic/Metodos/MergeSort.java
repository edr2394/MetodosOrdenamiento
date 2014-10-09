

package Logic.Metodos;

/**
 *
 * @author emily
 */

public class MergeSort {
    private int[]array;
    private int[] Array_Temporal;
    private int largo;
    
    public void Merge_Array(int[] Array)
    {
        this.array=Array;
        this.largo=Array.length;
        this.Array_Temporal= new int[largo];
        MergeSort(0,largo-1);
     
    for (int i=0;i<Array.length;i++)
     {
         System.out.print(Array[i]+" ");
     }
                
    }
    private void MergeSort(int indice_menor,int indice_mayor)
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


