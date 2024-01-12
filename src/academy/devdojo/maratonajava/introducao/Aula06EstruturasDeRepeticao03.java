package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um determinado valor. Por exemplo, 50
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break; // O break só pode ser utilizado dentro de um switch ou loop
            }
            System.out.println(i);
        }
    }
}
