
package Logic.Metodos;

/**
 *
 * @author emily
 */

public class RadixSort {
    
    public void Radix_Array(int[] Array)
    {
        int i,j=Array[0];
        int largo=Array.length;
        int indice=1;
        int[]  Array_Temporal=new int[10];
        
        for (i=1;i<largo;i++)
        {
            if (Array[i]>j)
            {
                j=Array[i];
            }
        while (j/indice>0)
            {
            int[] temporal=new int[10];
            
            for (i=0;i<largo;i++)
                {
                    temporal[(Array[i]/indice)%10]++;
                }
            for(i=1;i<10;i++)
                {
                    temporal[i]+=temporal[i-1];
                }
            for(i=largo-1;i>=0;i--)
                {
                    Array_Temporal[--temporal[(Array[i]/indice)%10]]=Array[i];
                }
            for (i=0;i<largo;i++)
                {
                Array[i]=Array_Temporal[i];
                }
            indice*=10;
            }
            
           for (i=0;i<Array.length;i++)
     {
         System.out.print(Array[i]+" ");
     }
           
        }
        
        
    }//Fin del metodo de Radix para Array de enteros
}
