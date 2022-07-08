//Marcos Antunes Plácido e Vinicius Machado 3-52
//Página 33 da apostila de Java

public class parImp {

    public static void main(String[] args) {

        int somaImp = 0;
        Long multPar = new Long(0);

        for (int i = 0; i <= 30; ++i) {
            if (i % 2 == 0) {
                multPar *= i;
            } else {
                somaImp += i;
            }
        }

        System.out.println("A soma dos números ímpares de 0 a 30: " + somaImp);
        System.out.println("A multiplicação dos números pares entre 0 e 30: " + multPar);
    }
}