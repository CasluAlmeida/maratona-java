package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05Exercicio {
    public static void main(String[] args) {
        // salarioAnual > 0 && salarioAnual <= 34712 - 9.70%
        // salarioAnual >= 34713 && salarioAnual <= 68507 - 37.35%
        // salarioAnual >= 68508 - 49.50%
        double salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario anual:"));
        double valorImpostoAPagar;
        String resultado;

        if (salarioAnual <= 34712) {
            valorImpostoAPagar = salarioAnual * 0.0970;
            resultado = "O total do imposto a pagar com base no seu salário anual é " + valorImpostoAPagar;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImpostoAPagar = salarioAnual * 0.3735;
            resultado = "O total do imposto a pagar com base no seu salário anual é " + valorImpostoAPagar;
        } else {
            valorImpostoAPagar = salarioAnual * 0.4950;
            resultado = "O total do imposto a pagar com base no seu salário anual é " + valorImpostoAPagar;
        }

//        resultado = salarioAnual <= 34712 ? "O total do imposto a pagar com base no seu salário anual é " + salarioAnual * 0.0970 :
//                salarioAnual >= 34713 && salarioAnual <= 68507 ? "O total do imposto a pagar com base no seu salário anual é " + salarioAnual * 0.3735 :
//                        "O total do imposto a pagar com base no seu salário anual é " + salarioAnual * 0.4950;

        System.out.println(resultado);
    }
}
