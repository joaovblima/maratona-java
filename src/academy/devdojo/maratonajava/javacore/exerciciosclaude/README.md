### Exercicios - Claude ai

#### Exercício 1: Sistema de Pagamentos
Crie um sistema que simule diferentes formas de pagamento.
##### Requisitos:

 - Crie um enum TipoPagamento com valores: CREDITO, DEBITO, PIX, BOLETO
- Crie uma interface Pagavel com o método processar(double valor)
- Implemente classes concretas para cada tipo de pagamento:

        - PagamentoCredito: aplica taxa de 2.5%
        - PagamentoDebito: taxa de 1%
        - PagamentoPix: sem taxa
        - PagamentoBoleto: taxa fixa de R$ 3,50


- Cada classe deve exibir o valor original, taxa aplicada e valor final
- Crie uma classe Pedido que contenha valor e tipo de pagamento
- Implemente um método para processar o pedido usando polimorfismo

#### Exercício 2: Gerenciador de Funcionários
Sistema para gerenciar diferentes tipos de funcionários.
##### Requisitos:

- Crie um enum Cargo com: ESTAGIARIO, JUNIOR, PLENO, SENIOR, GERENTE
- Crie uma classe abstrata Funcionario com atributos: nome, cargo, salarioBase
- Crie uma interface Bonificavel com método calcularBonus()
- Implemente classes:

        - Desenvolvedor: bônus de 10% do salário
        - Vendedor: bônus baseado em comissão sobre vendas
        - Gerente: bônus de 20% do salário + gratificação fixa


- Adicione um método abstrato calcularSalarioTotal() em Funcionario
- Crie uma classe Empresa que gerencie uma lista de funcionários e calcule a folha de pagamento total

#### Exercício 3: Sistema de Biblioteca
Sistema completo de gerenciamento de biblioteca.
##### Requisitos:

- Enum StatusLivro: DISPONIVEL, EMPRESTADO, RESERVADO, MANUTENCAO
- Enum CategoriaLivro: FICCAO, TECNICO, BIOGRAFIA, ACADEMICO
- Interface Emprestavel com métodos: emprestar(), devolver(), podeEmprestar()
- Classe abstrata ItemBiblioteca com: titulo, codigo, status
- Classes concretas: Livro, Revista, DVD
- Classe Usuario com limite de empréstimos simultâneos
- Classe Emprestimo com data de empréstimo, devolução e multa por atraso
- Classe Biblioteca que gerencie o acervo e os empréstimos
- Implemente validações: verificar disponibilidade, limite de empréstimos do usuário, cálculo de multas