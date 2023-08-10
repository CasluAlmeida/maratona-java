package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é seu salário?"));
        //(condicao) ? verdadeira : falso
        //Todos as condições precisam ter o mesmo tipo da variável

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
