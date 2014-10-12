
<<<<<<< HEAD
import Logic.Estructuras.Lista;
import Logic.Estructuras.ListaDoble;
import Logic.Metodos.Burbuja;
import Logic.Metodos.InsertSort;
import Logic.Metodos.MergeSort;
import Logic.Metodos.QuickSort;
import Logic.Metodos.SelectionSort;

import Logic.Metodos.*;


public class main {
    static int[] Array={9,5,6,2,8,7,3,4,1,0};
    static ListaDoble Lista=new ListaDoble();
    
    public static void main(String[] args)
    {
     
        Lista.agregar(5);
=======

import Logic.Estructuras.*;
import Logic.Metodos.*;

public class main {
    
    static Lista Lista=new Lista();

    
    public static void main(String[] args)
    {
        Arreglos R=new Arreglos();
        
        /*
        for(int i=10;i>0;i--)
        {         
            Lista.agregar(i);
        }
        Lista.describir();
        Lista.agregar(1);
>>>>>>> 8be381fa909034b3341798b66524c77ad0ffa4a7
        Lista.agregar(3);
        Lista.agregar(11);
        Lista.agregar(1);
        
           
        Lista.describir();
        InsertSort InsertSort = new InsertSort();
        Lista=InsertSort.Insert_Lista(Lista);
        Lista.describir();
    /*
        Burbuja Burbuja=new Burbuja();
        Lista=Burbuja.Burbuja_Lista(Lista);
        Lista.describir();
<<<<<<< HEAD
    
     
     Burbuja B=new Burbuja();
     B.Burbuja_Array(Array);
     
=======
                */
>>>>>>> 8be381fa909034b3341798b66524c77ad0ffa4a7
     
     /*
     InsertSort I=new InsertSort();
     I.Insert_Array(R.Arreglos_Random(50));
     */
        
     /*   
     SelectionSort S=new SelectionSort();
     S.Selection_Array(R.Arreglos_Random(50));
     */
        
     /*   
     QuickSort Q=new QuickSort();
     Q.Quick_Array(R.Arreglos_Random(50));  
     */
        
     /*   
     MergeSort M=new MergeSort();
<<<<<<< HEAD
     M.Merge_Array(Array);
        
     RadixSort R=new RadixSort();
     R.Radix_Array(Array);*/
     
     
    }
=======
     M.Merge_Array(R.Arreglos_Random(100));
     */
        
     /*   
     RadixSort RS=new RadixSort();
     RS.Radix_Array(R.Arreglos_Random(10));
     */
        
     /*   
    Burbuja B=new Burbuja();
    B.Burbuja_Array(R.Arreglos_Random(100));
     */
    
    
                }
                
   
>>>>>>> 8be381fa909034b3341798b66524c77ad0ffa4a7
}
