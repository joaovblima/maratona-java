package academy.devdojo.maratonajava.javacore.Ienum.teste;

import academy.devdojo.maratonajava.javacore.Ienum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Ienum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Lima", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
    }
}
