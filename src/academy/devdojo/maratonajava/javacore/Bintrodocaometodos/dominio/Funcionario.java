package academy.devdojo.maratonajava.javacore.Bintrodocaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println("Salarios: ");
        for(double salario: salarios) {
            System.out.println(salario);
        }
    }

    public void mediaSalarial() {
        double soma = 0;

        for(double salario : this.salarios) {
            soma += salario;
        }
        double media = soma / salarios.length;
        System.out.printf("Media salarial do guerreirinho é de R$ %.2f", media);
    }
}

