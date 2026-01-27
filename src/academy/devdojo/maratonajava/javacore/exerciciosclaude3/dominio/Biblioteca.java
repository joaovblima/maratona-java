package academy.devdojo.maratonajava.javacore.exerciciosclaude3.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemBiblioteca> acervo = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarItem(ItemBiblioteca item ){
        acervo.add(item);
    }

    public Emprestimo emprestarItem(String codigo, Usuario usuario) {
        ItemBiblioteca item = buscarItem(codigo);

        if(item == null) {
            throw new RuntimeException("Item não encontrado");
        }

        if (!item.podeEmprestar()) {
            throw new RuntimeException("Item indisponível");
        }

        if (!usuario.podeEmprestar()) {
            throw new RuntimeException("Você atingiu o limite de emprestimos");
        }

        item.emprestar();

        Emprestimo emprestimo = new Emprestimo(item, usuario);
        emprestimos.add(emprestimo);
        usuario.adicionarEmprestimo(emprestimo);

        return emprestimo;
    }
    public void devolverItem(Emprestimo emprestimo, Usuario usuario) {
        emprestimo.devolver();
        usuario.removerEmprestimo(emprestimo);
        emprestimos.remove(emprestimo);

        System.out.println("Multa $"+emprestimo.getMulta());
    }

    private ItemBiblioteca buscarItem(String codigo) {
        for (ItemBiblioteca item : acervo) {
            if (item.getCodigo().equals(codigo)) {
                return item;
            }
        }
        return null;
    }
}
