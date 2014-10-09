package Logic.Metodos;

/**
 *
 * @author emily
 */

public class SelectionSort {
     
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
       for (int i=0;i<Array.length;i++)
        {
         System.out.print(Array[i]+" ");
        }

       
   }
    
}

