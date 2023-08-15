package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


        float[] anos = new float[4];
        anos[0] = 2000F;
        anos[1] = 2001F;
        anos[2] = 2002F;
        anos[3] = 2003F;
        System.out.println(anos[0]);
        System.out.println(anos[1]);
        System.out.println(anos[2]);
        System.out.println(anos[3]);

        String[] sexo = new String[2];
        sexo[0] = "M";
        sexo[1] = "F";

        System.out.println(sexo[0]);
        System.out.println(sexo[1]);
    }
}
