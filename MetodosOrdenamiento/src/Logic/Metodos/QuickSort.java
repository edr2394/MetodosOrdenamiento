/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic.Metodos;

/**
 *
 * @author emily
 */
public class QuickSort {
    private int array[];
    private int largo;
    public void Quick_Array(int[] Array)
    {
        if (Array==null||Array.length==0)
            return;
        {
            this.array=Array;
            largo =Array.length;
            QuickSort(0,largo-1);
            
        }
          for (int i=0;i<Array.length;i++)
        {
         System.out.print(Array[i]+" ");
        }
    }
    private void QuickSort(int indice_menor, int indice_mayor)
        {
        int i=indice_menor;
        int j=indice_mayor;
        int pivote=array[indice_menor+(indice_mayor-indice_menor)/2];
        
        while (i<=j)
            {
            while (array[i]<pivote)
                {
                    i++;
                }
            while (array[j]>pivote)
                {
                    j--;
                }
            if (i<=j)
                {
                 Swap(i,j);
                 i++;
                 j--;
                }
            }
        
        if (indice_menor<j)
            {
            QuickSort(indice_menor,j);
            }
        
        if (i<indice_mayor)
            {
            QuickSort(i,indice_mayor);
            }
        }// Fin del metodo QuickSort_Array
        
        private void Swap(int i,int j)
        {
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
        }
}
