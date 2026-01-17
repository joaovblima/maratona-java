package academy.devdojo.maratonajava.javacore.Dmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Dmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro = new Carro("Gol", 180);
        Carro carro2 = new Carro("Corolla", 200);

        carro.imprime();
        carro2.imprime();
    }
}
