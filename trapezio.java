//Marcos Antunes Plácido e Vinicius Machado 3-52
//Página 33 da apostila de Java

import java.util.Scanner;

public class trapezio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double B, b, h, A;

        System.out.println("Bem-vindo ao calculador de área!");
        System.out.println("Informe o valor de B = base maior: ");
        B = input.nextDouble();
        System.out.println("Informe o valor de b = base menor: ");
        b = input.nextDouble();
        System.out.println("Informe o valor de h = altura");
        h = input.nextDouble();
        A = ((B + b) / 2) * h;
        System.out.println("O valor dado é B: " + B + " b: " + b + " h: " + h);
        System.out.println("A área do trapézio é: " + A);
        input.close();
    }

}