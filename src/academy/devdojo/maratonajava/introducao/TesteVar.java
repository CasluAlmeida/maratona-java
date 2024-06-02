package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class TesteVar {
    public static void main(String[] args) {
//        int a = 0;

//        while (a < 2) {
//            a++;
//            System.out.println(a);
//        }
//        System.out.println("END");
//
//        do {
//            a++;
//            System.out.println(a);
//        } while (a < 2);
//        System.out.println("END");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }
    }
}
