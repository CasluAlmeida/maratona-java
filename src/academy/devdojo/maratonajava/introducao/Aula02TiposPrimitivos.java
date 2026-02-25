package academy.devdojo.maratonajava.introducao;

import java.math.BigDecimal;

public class Aula02TiposPrimitivos {
//    int, double, float, char, byte, short, long, boolean
    public static void main(String[] args) {
        int idade = 10;
        long nomeroGrande = 1000000L;
        byte idadeByte = 10;
        short idadeShort = 10;
        float peso = 128.8F;
        double pesoDouble = 128.8;
        boolean verdadeido = true;
        boolean falso = false;
        char sexoMasculino = 'M';
        char sexoFeminino = 'F';
        char sexoA = '\u0041';
        BigDecimal salario = BigDecimal.valueOf(1000.00);
        BigDecimal salario2 = new BigDecimal("2000.00");

        System.out.println("A idade é "+idade+" anos!");
        System.out.println(sexoMasculino);
        System.out.println(sexoFeminino);
        System.out.println(sexoA);

        System.out.println(salario);
        System.out.println(salario2);

    }
}
