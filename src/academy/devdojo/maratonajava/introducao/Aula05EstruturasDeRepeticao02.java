package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //dado um valor de um carro descubra quantas vezes ele pode ser parcelado
        // valor da parcela >= 1000;
        double valorTotal = 30000;


        for (int parcela = 1; parcela <= valorTotal; parcela++ ) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela+ ", valor R$"+ valorParcela);
            }
        }
    }
}
