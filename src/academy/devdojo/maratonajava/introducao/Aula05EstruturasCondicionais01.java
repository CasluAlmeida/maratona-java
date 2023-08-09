package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } if (!isAutorizadoComprarBebida){
            System.out.println("Não pode comprar bebida alcólica");
        }
    }
}
