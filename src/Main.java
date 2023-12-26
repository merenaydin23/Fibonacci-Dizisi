import java.util.Scanner;

public class Main {
    /* 1 1 2 3 5 8 13 21 34 55 89 144 233
    Fibonacci dizisi yukarıdaki satırdaki gibidir */

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sira;
        do {
            System.out.println("Fibonacci dizisinin kaçınçı elemanını görmek istersin");
            sira = klavye.nextInt();
        } while (sira < 1);
        System.out.println("Fibonacci dizisinin "+sira+". elemanı = " +fibo(sira));
    }
    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
