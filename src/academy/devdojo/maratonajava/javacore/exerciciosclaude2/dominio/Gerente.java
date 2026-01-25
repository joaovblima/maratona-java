package academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, Cargo cargo, double salarioBase) {
        super(nome, cargo, salarioBase);
    }

    @Override
    public double calcularBonus() {
        double bonus = (salarioBase * 0.2) + 2000.0;
        return bonus;
    }

    @Override
    public double calcularSalarioTotal() {
        double bonus = calcularBonus();
        double salarioTotal = this.salarioBase + bonus;
        return salarioTotal;
    }
}
