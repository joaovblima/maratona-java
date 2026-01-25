package academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio;

public abstract class Funcionario implements Bonificavel {
    protected String nome;
    protected Cargo cargo;
    protected double salarioBase;

    public Funcionario(String nome, Cargo cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioTotal();
}


