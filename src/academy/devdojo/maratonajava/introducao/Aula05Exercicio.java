package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05Exercicio {
    public static void main(String[] args) {
        // salarioAnual > 0 && salarioAnual <= 34712 - 9.70%
        // salarioAnual >= 34713 && salarioAnual <= 68507 - 37.35%
        // salarioAnual >= 68508 - 49.50%
        double salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario anual:"));
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImpostoAPagar;
        String resultado;

        if (salarioAnual <= 34712) {
            valorImpostoAPagar = salarioAnual * primeiraFaixa;
            resultado = "O total do imposto a pagar com base no seu salário anual é " + valorImpostoAPagar;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImpostoAPagar = salarioAnual * segundaFaixa;
            resultado = "O total do imposto a pagar com base no seu salário anual é " + valorImpostoAPagar;
        } else {
            valorImpostoAPagar = salarioAnual * terceiraFaixa;
            resultado = "O total do imposto a pagar com base no seu salário anual é " + valorImpostoAPagar;
        }
        System.out.println(resultado);
    }
}
