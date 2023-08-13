package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        int numero = 0;

        while (numero <= 1000000) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }

        System.out.println();
        numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println("Dentro do Do-while " + numero);
            }
            numero++;
        } while (numero <= 1000000);

        System.out.println();

        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Dentro do For " + i);
            }
        }
    }
}
