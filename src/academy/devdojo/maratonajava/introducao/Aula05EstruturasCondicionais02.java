package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        boolean isCategoriaInfantil = idade < 15;
        boolean isCategoriaJuvenil = idade >= 15 && idade < 18;
        String categoria;
        if (isCategoriaInfantil){
            categoria = "Sua categoria é infantil";
        } else if (isCategoriaJuvenil) {
            categoria = "Sua categoria é juvenil";
        } else {
            categoria = "Sua categoria é adulto";
        }
        //É possivel fazer com operador ternario, mas não é recomendado!!
        //categoria = isCategoriaInfantil ? "Sua categoria é infantil" : isCategoriaJuvenil ? "Sua categoria é juvenil" : "Sua categoria é adulto";

        System.out.println(categoria);
    }
}
