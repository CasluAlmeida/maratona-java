package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class TesteExerciciosSchools {
    public static void main(String[] args) {

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));

        //O método retorna a raiz quadrada
        int x = 49;
        System.out.println(Math.sqrt(x));

        //O método pode ser usado para encontrar o valor mais alto
        System.out.println(Math.max(5, 10));

        //O método pode ser usado para encontrar o menor valor
        System.out.println(Math.min(5, 10));

        //O método retorna o valor absoluto (positivo)
        double valorNegativo = -4.9;
        System.out.println(Math.abs(valorNegativo));

        System.out.println(Math.random());

        //Para obter mais controle sobre o número aleatório, por exemplo, se você deseja apenas um número aleatório entre 0 e 100
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
