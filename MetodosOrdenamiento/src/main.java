
import Logic.Estructuras.Lista;
<<<<<<< HEAD
import Logic.Metodos.Burbuja;
import Logic.Metodos.InsertSort;
import Logic.Metodos.MergeSort;
import Logic.Metodos.QuickSort;
import Logic.Metodos.SelectionSort;

=======
import Logic.Metodos.*;
>>>>>>> 2633296818f5f54ac5c0f40cb82bf73e83db159f

public class main {
    static int[] Array={9,5,6,2,8,7,3,4,1,0};
    static Lista Lista=new Lista();

    
    public static void main(String[] args)
    {
        /*
        for(int i=10;i>0;i--)
        {         
            Lista.agregar(i);
        }
        Lista.describir();
        Lista.agregar(1);
        Lista.agregar(3);
        Lista.agregar(2);
        Lista.agregar(0);
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
     M.Merge_Array(Array);*/
        
     RadixSort R=new RadixSort();
     R.Radix_Array(Array);
     
     
    }
}
