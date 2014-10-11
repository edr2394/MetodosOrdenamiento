/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic.Estructuras;

/**
 *
 * @author emily
 */
public class Arreglos {
    
    
    /**
     * Método para la creacion de arreglos con numeros al azar . 
     * Recibe un numero entero, y con él crea un arreglo de 
     * ese tamaño rellenandolo con numeros aleatorios.
     * @param El tamaño deseado (Numero entero.)
     */
    
    public int[] Arreglos_Random(int tamaño)
    {   
        int[] NuevoArreglo=new int[tamaño];//Crea el arreglo del tamaño deseado.
        for (int i=0;i<tamaño;i++)
        {
            int Numero_Random=(int) Math.floor(Math.random()*10000+1);//Genera numeros aleatorios entre 0-10000
            NuevoArreglo[i]=Numero_Random;//Añade el numero al arreglo
        }
        //Imprimir_Arreglo(NuevoArreglo);
        return NuevoArreglo;
    }
 
    public void Imprimir_Arreglo(int[] Array)//Imprime en consola un arreglo 
    {
         for (int i=0;i<Array.length;i++)
     {
         System.out.print(Array[i]+" ");
     }

    }
}
