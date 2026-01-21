package academy.devdojo.maratonajava.javacore.Hmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Hmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Hmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Hilux");
        System.out.println(Carro.VELOCIDADE_LIMITE);

        carro.COMPRADOR.setNome("João");
        System.out.println(carro.COMPRADOR);



    }
}
