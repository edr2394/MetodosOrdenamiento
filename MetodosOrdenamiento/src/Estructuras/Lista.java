package Estructuras;
public class Lista<E>
{
    
    protected int length;
    protected Nodo<E> head;
    protected Nodo<E> tail;

    public Lista() 
    {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    
 
    public boolean vacio() 
    {
        return this.length == 0;
    }

 
    public boolean agregar(E pelemento) 
    {
        Nodo<E> nodo = new Nodo<E>(pelemento);

        if(vacio()) 
        {
            this.head = nodo;
        } 
        else 
        {
            this.tail.setsiguiente(nodo);
        }
        this.tail = nodo;
        this.length += 1;
        return true;
    }

 
    public boolean eliminar(E pelemento) 
    {
        if(vacio()) 
        {
            return false;
        }
        Nodo<E> nodoanterior = null;
        Nodo<E> nodoactual = this.head;
        while(nodoactual != null) 
        {
            if(nodoactual.getelemento().equals(pelemento)) 
            {
                break;
            }
            nodoanterior = nodoactual;
            nodoanterior = nodoactual.getsiguiente();
        }

        if(nodoactual == null) 
        {
            return false;
        }
        
        if(nodoactual == this.head) 
        {
            this.head = nodoactual.getsiguiente();
        }

        if(nodoactual == this.tail) 
        {
            this.tail = nodoanterior;
        }

        if(nodoanterior != null) 
        {
            nodoanterior.setsiguiente(nodoactual.getsiguiente());
        }
        nodoactual.setsiguiente(null);
        nodoactual = null;
        this.length -= 1;
        return true;
    }

    public int tamaño() 
    {
        return this.length;
    }


    public boolean insertar(int pos, E pelemento) {

        Nodo<E> nodo = new Nodo<E>(pelemento);

        if((pos < 0) || (pos > this.length)) {
            return false;
        }

        Nodo<E> nodoanterior = null;
        Nodo<E> nodoactual = this.head;
        for(int i = 0; i != pos; i++) {
            nodoanterior = nodoactual;
            nodoactual = nodoactual.getsiguiente();
        }

        nodo.setsiguiente(nodoactual);
        if(nodoanterior != null) 
        {
            nodoanterior.setsiguiente(nodo);
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

    public void describir()
    {
        Nodo<E> nodoactual = this.head;
        while(nodoactual.getsiguiente()!= null)
        {
            System.out.print(nodoactual.getelemento());
            System.out.print(" ");
            nodoactual = nodoactual.getsiguiente();
        }
        System.out.println(nodoactual.getelemento());
        //System.out.print("Cabeza: ");
        //System.out.println(this.head.getelem());
        //System.out.print("Cola: ");
        //System.out.println(this.tail.getelem());
        //System.out.print("Tamaño: ");
        //System.out.println(this.length); 
    }
    
    public E getcola()
    {
        return this.tail.getelemento();
    }
    public Nodo<E> getcabeza()
    {
        return this.head;
    }
}