//Marcos Antunes Plácido e Vinicius Machado 3-52
//Página 33 da apostila de Java

public class primos {

    public static void main(String[] args) {
        int n = 123;
        for (int i = 0; i <= n; i++) {
            if ((i % 2 != 0) && (i % 3 != 0)) {
                System.out.println(i);
            }

        }
    }

}
