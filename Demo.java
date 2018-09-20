import java.util.*;

public class Demo
{
    static void ordenarEnteros(int max)
    {
        int enteros[];
        
        enteros = new int[max]; //Equivalente a int enteros[10]; en C
        for(int i = 0; i < max; i++)
        {
            enteros[i] = (int)(Math.random() * max) + 1; //Se pueden hacer cast entre tipos nativos
        }
        
        Arrays.sort(enteros);
        
        for(int i = 0; i < enteros.length; i++)
        {
            System.out.println(enteros[i]);   
        }
    }
    
    
}
