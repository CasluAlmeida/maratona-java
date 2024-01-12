package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class JurosCompostos {
    public static void main(String[] args) {
        double capital = 1000;
        double taxa = 0.05;
        int tempo = 5;

        double montante = calcularMontante(capital, taxa, tempo);

        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Montante: " + currencyFormatter.format(montante));

        DecimalFormat df = new DecimalFormat();

    }

    public static double calcularMontante(double capital, double taxa, int tempo) {
        double montante = capital * Math.pow(1 + taxa, tempo);
        return montante;
    }
}
