package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String [] nomes = new String[3];

        nomes[0] = "Calleri";
        nomes[1] = "Luciano";
        nomes[2] = "Wendell";

        for (String nome : nomes) {
            System.out.println("pau tora no sp " + nome);
        }
    }
}
