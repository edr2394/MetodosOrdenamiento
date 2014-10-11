
import Logic.Estructuras.*;
import Logic.Metodos.*;


public class main {
    static int[] Array={9,5,6,2,8,7,3,4,1,0};
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
        Lista.agregar(3);
        Lista.agregar(2);
        Lista.agregar(0);
        BurbujaLista Burbuja=new BurbujaLista();
        Lista=Burbuja.BurbujaLista(Lista);
        Lista.describir();
    
     
     
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
     
     Burbuja B=new Burbuja();
     B.Burbuja_Array(R.Arreglos_Random(20));
     
    
    
     
    }
}
