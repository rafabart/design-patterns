package behavioral.strategy;

// O contexto define a interface de interesse para clientes.
public class Context {


    // O contexto mantém uma referência para um dos objetos estratégia. O contexto não sabe a classe concreta de uma
    // estratégia. Ele deve trabalhar com todas as estratégias através da interface estratégia.
    private Strategy strategy;


    // Geralmente o contexto aceita uma estratégia através do construtor, e também fornece um setter para que a
    // estratégia possa ser trocado durante o tempo de execução.
    public void setStrategy(final Strategy strategy) {
        this.strategy = strategy;
    }


    // O contexto delega algum trabalho para o objeto estratégia ao invés de implementar múltiplas versões do algoritmo
    // por conta própria.
    Long executeCalculate(final Long numberA, final Long numberB) {
        return strategy.calculate(numberA, numberB);
    }
}
