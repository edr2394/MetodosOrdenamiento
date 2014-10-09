package Logic.Metodos;

import Logic.Estructuras.Lista;
import Logic.Estructuras.Nodo;

public class Burbuja 
{    
    private int Compara1;
    private int Compara2;
    private Nodo Iterador;
    private Nodo tempNodo;
    private Lista ListaOrdenada;
    
    int temp=0;
    public void Burbuja_Array(int Array[])
    {
     for (int i=0; i<Array.length;i++)
     {
         for (int j=0;j<Array.length;j++)
         {
             if (Array[i]<Array[j])
             {
              temp=Array[j];
              Array[j]=Array[i];
              Array[i]=temp;
             }
         }
     }
     
     for (int i=0;i<Array.length;i++)
     {
         System.out.print(Array[i]+" ");
     }

    }
    /**
     * Método para el ordenamiento de listas por burbuja. Recibe una Lista y la devuelve ordenada
     * @param PorOrdenar
     * @return 
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
    }
}



