package Logic.Estructuras;

import Logic.Interfaces.interListaDoble;

public class ListaDoble<E> implements interListaDoble<E>
{
    
    protected int length;
    protected NodoDoble<E> head;
    protected NodoDoble<E> tail;

    public ListaDoble() 
    {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    
    @Override
    public boolean vacio() 
    {
        return this.length == 0;
    }

    @Override
    public boolean agregar(E pelemento) 
    {
        NodoDoble<E> nodo = new NodoDoble<E>(pelemento);

        if(vacio()) 
        {
            this.head = nodo;
        } 
        else 
        {
            nodo.anterior=this.tail;            
            this.tail.setNext(nodo);
        }
        this.tail = nodo;
        this.length += 1;
        return true;
    }

    @Override
    public boolean eliminar(E pelemento) 
    {
        if(vacio()) 
        {
            return false;
        }
        NodoDoble<E> nodoanterior = null;
        NodoDoble<E> nodoactual = this.head;
        while(nodoactual != null) 
        {
            if(nodoactual.getElemt().equals(pelemento)) 
            {
                break;
            }
            nodoanterior = nodoactual;
            nodoanterior = nodoactual.getNext();
        }
        if(nodoactual == null) 
        {
            return false;
        }
        
        if(nodoactual == this.head) 
        {
            this.head = nodoactual.getNext();
        }

        if(nodoactual == this.tail) 
        {
            this.tail = nodoanterior;
        }

        if(nodoanterior != null) 
        {
            nodoanterior.setNext(nodoactual.getNext());
        }
        nodoactual.setNext(null);
        nodoactual = null;
        this.length -= 1;
        return true;
    }
    
    @Override
    public int tamaño() 
    {
        return this.length;
    }

    @Override
    public boolean insertar(int pos, E pelemento) {

        NodoDoble<E> nodo = new NodoDoble<E>(pelemento);

        if((pos < 0) || (pos > this.length)) {
            return false;
        }

        NodoDoble<E> nodoanterior = null;
        NodoDoble<E> nodoactual = this.head;
        for(int i = 0; i != pos; i++) {
            nodoanterior = nodoactual;
            nodoactual = nodoactual.getNext();
        }

        nodo.setNext(nodoactual);
        if(nodoanterior != null) 
        {
            nodoanterior.setNext(nodo);
        }

        if(nodoactual == this.head) 
        {
            this.head = nodo;
        }
        if(nodoanterior == this.tail) 
        {
            this.tail = nodo;
        }

        this.length += 1;
        return true;
    }
    
    @Override
    public void describir()
    {
        NodoDoble<E> nodoactual = this.head;
        while(nodoactual.getNext()!= null)
        {
            System.out.print(nodoactual.getElemt());
            System.out.print(" ");
            nodoactual = nodoactual.getNext();
        }
        System.out.println(nodoactual.getElemt());
        //System.out.print("Cabeza: ");
        //System.out.println(this.head.getelem());
        //System.out.print("Cola: ");
        //System.out.println(this.tail.getelem());
        //System.out.print("Tamaño: ");
        //System.out.println(this.length); 
    }   
    @Override
    public E getcola()
    {
        return this.tail.getElemt();
    }
    
    @Override
    public NodoDoble<E> getHead()
    {
        return this.head;
    }

    public void setHead(NodoDoble Cabeza) {
        this.head=Cabeza;       
    }
}