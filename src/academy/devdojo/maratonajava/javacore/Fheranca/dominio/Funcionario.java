package academy.devdojo.maratonajava.javacore.Fheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
}
