package academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, Cargo cargo, double salarioBase) {
        super(nome, cargo, salarioBase);
    }

    @Override
    public double calcularBonus() {
        double bonus = salarioBase * 0.10;
        return bonus;
    }

    @Override
    public double calcularSalarioTotal() {
        double bonus = calcularBonus();
        double salarioTotal = this.salarioBase + bonus;
        return salarioTotal;
    }
}
