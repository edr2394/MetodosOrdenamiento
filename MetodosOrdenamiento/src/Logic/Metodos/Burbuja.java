package Logic.Metodos;
import Logic.Estructuras.*;
import Logic.Estructuras.*;



public class Burbuja 
{    
    /*
    Compara cada elemento de la lista con el siguiente,
    si el orden es incorrecto los intercambia (Swap),
    Y se mueve hacia el siguiente par de numeros.
    Con cada ciclo del metodo al menos 1 elemento queda ordenado.
    
    */
    Arreglos Arreglo=new Arreglos();//Instancia la clase Arreglos.
    private int Compara1;// Se usa en el metodo Burbuja_Lista
    private int Compara2;//  Se usa en el metodo Burbuja_Lista
    private Nodo Iterador;//  Se usa en el metodo Burbuja_Lista
    private Nodo tempNodo;//  Se usa en el metodo Burbuja_Lista
    private Lista ListaOrdenada;//  Se usa en el metodo Burbuja_Lista
    private int temporal=0;// Se usa en el metodo Burbuja_Array
  
    /**
     * Método para el ordenamiento de arreglos por burbuja. 
     * Recibe un arreglo, que contiene numeros
     * , y lo devuelve ordenado.
     * @param Arreglo desordenado de enteros.
     * @return El arreglo ordenado.
     */
    public void Burbuja_Array(int[] Array)
    {
     for (int i=0; i<Array.length;i++)
     {
         for (int j=0;j<Array.length;j++)
         {
             if (Array[i]<Array[j]) 
             {
              temporal=Array[j];
              Array[j]=Array[i];
              Array[i]=temporal;
             }
         }
     }
    Arreglo.Imprimir_Arreglo(Array);
        
    }// Fin del metodo de Bubuja para arreglos de enteros
    
    
    /**
     * Método para el ordenamiento de listas por burbuja. Recibe una Lista,
     * que contiene numeros enteros, y la devuelve ordenada
     * @param Lista desordenada de enteros.
     * @return La lista ordenada.
     */
    public Lista Burbuja_Lista(Lista PorOrdenar){
        if(PorOrdenar.tamaño()<=1){
            this.ListaOrdenada=PorOrdenar;                       
        }
        else{
            this.ListaOrdenada=PorOrdenar;
            this.Iterador=ListaOrdenada.getcabeza();
            this.tempNodo=Iterador;
            this.Compara1=(int) Iterador.getelemento();
            this.Compara2=(int) Iterador.getsiguiente().getelemento();           
            
            //Iteración de la lista para ordenar los elementos.
            while(tempNodo.getsiguiente()!=null){
                while(Iterador.getsiguiente()!=null){
                    this.Compara1=(int) Iterador.getelemento();                
                    this.Compara2=(int) Iterador.getsiguiente().getelemento();
                    if(Compara1>Compara2){
                        Iterador.setelemento(Compara2);               
                        Iterador.getsiguiente().setelemento(Compara1);                  
                    }
                    Iterador=Iterador.getsiguiente();
                }
                Iterador=ListaOrdenada.getcabeza();
                tempNodo=tempNodo.getsiguiente();
            }
        }
        return this.ListaOrdenada;
        
    }//Fin del metodo de Burbuja para Listas con enteros
    
}//Fin de la Clase Burbuja



