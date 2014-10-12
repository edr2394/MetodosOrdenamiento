
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
    
     
     Burbuja B=new Burbuja();
     B.Burbuja_Array(Array);
     
     
     InsertSort I=new InsertSort();
     I.Insert_Array(Array);
     
        
     SelectionSort S=new SelectionSort();
     S.Selection_Array(Array);
     
        
     QuickSort Q=new QuickSort();
     Q.Quick_Array(Array);  
                                
     MergeSort M=new MergeSort();
     M.Merge_Array(Array);
        
     RadixSort R=new RadixSort();
     R.Radix_Array(Array);*/
     
     
    }
}
