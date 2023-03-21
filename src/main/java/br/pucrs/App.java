package br.pucrs;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
    static int cont = 0;

    static long maxVal1(long A[], int n) {
        long max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    static long maxVal2(long A[], int init, int end) {
        cont++;
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
        // 32, 2048 e 1.048.576
        Random random = new Random();
        int init = 0;
        long A[] = new long[32];
        int end = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(10000);
            System.out.println(A[i]);
        }
        long start = System.currentTimeMillis();
        System.out.println("maior numero: " + maxVal2(A, init, end));
        long tempoFinal = System.currentTimeMillis();
        System.out.println("tempo de execucao: " + (tempoFinal - start) / 1000d);
        System.out.println("numero de passos: " + cont);
    }
}
