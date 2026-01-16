package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.nome = "Ford Ka";
        carro.modelo = "Ratch da Ford";
        carro.ano = 2019;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);


        Carro carro2 = new Carro();
        carro2.nome = "Toyota";
        carro2.modelo = "Hilux";
        carro2.ano = 2024;

        System.out.println("-----------------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
