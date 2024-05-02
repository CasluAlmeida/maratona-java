package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null
        int tamanhoArray = 5;
        String anime = "Sasuke";

        String[] nomes = new String[tamanhoArray];
        nomes[0] = "Naruto";
        nomes[1] = "Minato";
        nomes[2] = "Kakashi";
        nomes[3] = "Jiraiya";
        nomes[4] = anime;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
