package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo

        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Dom - Final de semana");
                break;
            case 2:
                System.out.println("Seg - Dia útil");
                break;
            case 3:
                System.out.println("Ter - Dia útil");
                break;
            case 4:
                System.out.println("Qua - Dia útil");
                break;
            case 5:
                System.out.println("Qui - Dia útil");
                break;
            case 6:
                System.out.println("Sex - Dia útil");
                break;
            case 7:
                System.out.println("Sab - Final de semana");
                break;
            default:
                System.out.println("Dia da semana inválido");
        }

        byte semana = 6;
        switch (semana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Dia da semana inválido");
                break;
        }
    }
}
