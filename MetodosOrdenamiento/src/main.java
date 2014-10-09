
import Logic.Metodos.Burbuja;
import Logic.Metodos.InsertSort;
import Logic.Metodos.SelectionSort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emily
 */
public class main {
    static int[] Array={9,5,6,2,8,7,3,4,1,0};
    
    public static void main(String[] args)
    {
    /* Burbuja B=new Burbuja();
     B.Burbuja_Array(Array);
     
     InsertSort I=new InsertSort();
     I.Insert_Array(Array);
     */
        
     SelectionSort S=new SelectionSort();
     S.Selection_Array(Array);
    }
}
