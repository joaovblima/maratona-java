package academy.devdojo.maratonajava.javacore.exerciciosclaude3.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private ItemBiblioteca item;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private double multa;

    private static final double MULTA_POR_DIA = 2.0;

    public Emprestimo(ItemBiblioteca item, Usuario usuario) {
        this.item = item;
        this.usuario = usuario;
    }

    public void devolver() {
        this.dataDevolucao = LocalDate.now();
        calcularMulta();
        item.devolver();
    }

    public void calcularMulta() {
        long dias = ChronoUnit.DAYS.between(dataEmprestimo.plusDays(7), dataDevolucao);

        if (dias > 0) {
            multa = dias * MULTA_POR_DIA;
        } else {
            multa = 0;
        }
    }

    public double getMulta() {
        return multa;
    }

    public ItemBiblioteca getItem() {
        return item;
    }
}


