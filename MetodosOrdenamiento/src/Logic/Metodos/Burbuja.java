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
public class Burbuja {
    
    
    int temp=0;
    
    
public void Burbuja_Array(int Array[])
    {
     for (int i=0; i<Array.length;i++)
     {
         for (int j=0;j<Array.length;j++)
         {
             if (Array[i]>Array[j])
             {
              temp=Array[j];
              Array[j]=Array[i];
              Array[i]=temp;
             }
         }
     }
     
     for (int i=0;i<Array.length;i++)
     {
         System.out.println(Array[i]);
     }

    }
}



