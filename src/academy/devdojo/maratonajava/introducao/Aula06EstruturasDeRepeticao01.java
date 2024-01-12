package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // wjile, do while, for

        int count = 0;

        while (count < 10) {
            //System.out.println(count);
            //count++; De 1
            System.out.println(++count); //De 1 a 10
        }
        //System.out.println();

        count = 0;
        do {
            System.out.println("Dentro do Do-While " + count);
            count++;
        } while (count < 10);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("Dentro do for " + i );
        }

    }
}
