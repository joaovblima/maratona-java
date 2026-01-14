package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Posso doar";
        String mensagemNaoDoar = "Não posso doar";
        String resultado = salario > 5000? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
