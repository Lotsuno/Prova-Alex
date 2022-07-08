//Marcos Antunes Plácido e Vinicius Machado 3-52
//Página 33 da apostila de Java

import java.util.Scanner;

public class numero {

    public static void main(String[] args) {

        int i;

        Scanner Scan = new Scanner(System.in);

        System.out.println("Insira um número");
        int n = Scan.nextInt();

        Scan.close();

        if (n % 2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        if ((n == 1) || (n == 2)) {
            System.out.print("O número é primo");
        }
        for (i = 1; i <= n; i++) {
            i++;
        }
        if (i == 2) {
            System.out.println("O numero " + String.valueOf(n) + " é primo");

        }
    }

}
