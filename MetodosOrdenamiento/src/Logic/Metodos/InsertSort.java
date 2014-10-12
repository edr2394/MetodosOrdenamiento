package Logic.Metodos;

import Logic.Estructuras.ListaDoble;
import Logic.Estructuras.NodoDoble;

/**
 *
 * @author emily
 */

public class InsertSort {
    
    
    public void Insert_Array(int[] Array)
    {
        for (int i=1;i<Array.length; i++)
        {
           int tmp=Array[i];
           
           for (int j=i-1;j>=0 && tmp<Array[j];j--)
           {
               Array[j+1]=Array[j];
               Array[j+1]=tmp;
           }    
        }
        for (int i=0;i<Array.length;i++)
         {
             System.out.print(Array[i]+" ");
         }

    }//Termina el Metodo InsertSort para Arreglos con entero
    
    public ListaDoble Insert_Lista(ListaDoble Lista)
    {
        if(Lista.tamaño()<=3){
            if(Lista.tamaño()==2)
            {
                NodoDoble Ultimo=Lista.getHead();
                NodoDoble actual=Ultimo.getNext();
                int elemactual=(int) actual.getElemt();
                int elemUltimo=(int) Ultimo.getElemt();
                if(elemactual < elemUltimo){
                    NodoDoble temp = Ultimo;                   
                    Ultimo.setNext(actual.getNext());
                    Lista.setHead(actual);
                    actual.setNext(Ultimo);
                    Lista.getHead().setPrevio(null);
                    Ultimo.setPrevio(actual);
                    Ultimo.setNext(temp.getNext());
                    
                }            
            }
        }
        else{
            NodoDoble Ultimo=Lista.getHead();
            NodoDoble actual=Ultimo.getNext();
            int elemactual=(int) actual.getElemt();
            int elemUltimo=(int) Ultimo.getElemt();
            if(elemactual < elemUltimo){
                NodoDoble temp = Ultimo;                 
                Ultimo.setNext(actual.getNext());
                Lista.setHead(actual);
                actual.setNext(Ultimo);
                Lista.getHead().setPrevio(null);
                Ultimo.setPrevio(actual);
                Ultimo.setNext(temp.getNext());
            }   
            
            
            else{
                Ultimo=actual;
                actual=Ultimo.getNext();
            }
            while(actual.getNext()!=null){
                Ultimo=Lista.getHead();
                actual=Ultimo.getNext();
                elemactual=(int) actual.getElemt();
                elemUltimo=(int) Ultimo.getElemt();
                if(elemactual<elemUltimo){
                    NodoDoble Cambia=Ultimo;
                    int elemCambia=(int) Cambia.getElemt();
                    while(elemCambia>elemactual && Cambia.getPrevio()!=null)
                    {
                        Cambia=Cambia.getPrevio();
                        elemCambia=(int) Cambia.getElemt();
                    }
                    NodoDoble temp1=Cambia.getNext();
                    NodoDoble temp2=actual;
                    Cambia.setNext(temp2);
                    temp2.setPrevio(Cambia);
                    temp2.setNext(temp1);
                    temp1.setPrevio(temp2);
                    temp1.setNext(actual.getNext());
                    temp1.getNext().setNext(temp1);
                    actual=temp1.getNext();                                        
                }
                else{
                    Ultimo=actual;
                    actual=Ultimo.getNext();
                }
            }                     
        }                                              
        return Lista;
    }        

}
