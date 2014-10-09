package Logic.Metodos;

/**
 *
 * @author emily
 */

public class InsertSort {
   
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
        for (int i=0;i<Array.length;i++)
         {
             System.out.print(Array[i]+" ");
         }

    }//Termina el Metodo InsertSort para Arreglos con entero
}
