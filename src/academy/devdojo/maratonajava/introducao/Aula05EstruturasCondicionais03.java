package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        //considerando 1 como domingo

        int dia = 7;
        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            case 1:
            case 7:
                System.out.println("fim de semana");
                break;
        }
    }
}
