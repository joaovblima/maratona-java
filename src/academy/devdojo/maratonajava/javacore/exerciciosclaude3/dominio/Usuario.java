package academy.devdojo.maratonajava.javacore.exerciciosclaude3.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int limiteEmprestimos;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(String nome, int limiteEmprestimos) {
        this.nome = nome;
        this.limiteEmprestimos = limiteEmprestimos;
    }

    public boolean podeEmprestar() {
        return emprestimos.size() < limiteEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    public void removerEmprestimo(Emprestimo e) {
        emprestimos.remove(e);
    }
}
