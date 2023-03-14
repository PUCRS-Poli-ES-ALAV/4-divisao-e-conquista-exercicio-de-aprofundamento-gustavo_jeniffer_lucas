package br.pucrs;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
    static long maxVal2(long A[], int init, int end) {
        if (end - init <= 1)
            return Math.max(A[init], A[end]);
        else {
            int m = (init + end) / 2;
            long v1 = maxVal2(A, init, m);
            long v2 = maxVal2(A, m + 1, end);
            return Math.max(v1, v2);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int init = 0;
        int end = 10;
        long A[] = new long[11];

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(1000);
            System.out.println(A[i]);
        }

        System.out.println("teste "+maxVal2(A, end, init));
    }
}
