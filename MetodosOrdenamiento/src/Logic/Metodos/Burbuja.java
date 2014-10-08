package Logic.Metodos;
public class Burbuja 
{    
    int temp=0;
    public void Burbuja_Array(int Array[])
    {
     for (int i=0; i<Array.length;i++)
     {
         for (int j=0;j<Array.length;j++)
         {
             if (Array[i]>Array[j])
             {
              temp=Array[j];
              Array[j]=Array[i];
              Array[i]=temp;
             }
         }
     }
     
     for (int i=0;i<Array.length;i++)
     {
         System.out.println(Array[i]);
     }

    }
}



