package academy.devdojo.maratonajava.javacore.Dmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private  double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(this.velocidadeLimite);
    }
}
