package br.pucrs;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
    long maxVal2(long A[], int init, int end) {  
        if (end - init <= 1)
            return max(A[init], A[end]);  
        else {
              int m = (init + end)/2;
              long v1 = maxVal2(A,init,m);   
              long v2 = maxVal2(A,m+1,end);  
              return max(v1,v2);
             }
    }

    public static void main( String[] args )
    {
        Random random = new Random();
        int init = 0;
        int end = 32; 
        long A[] = new long [32];
        System.out.println(maxVal2);


        for(int i = 0; i < A.length; i++){
            A[i] = random.nextLong(1000);
            System.out.println(A[i]);
        }
    }
}
