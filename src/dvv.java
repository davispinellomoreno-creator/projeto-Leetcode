

import java.util.Scanner;

class solution {

    public int mirrorDistance(int n) {
        int numero = n;
        int reversed = 0;

        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return Math.abs(numero - reversed);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int numero = scanner.nextInt();

        solution obj = new solution();
        int resultado = obj.mirrorDistance(numero);

        System.out.println(resultado);
    }
}

