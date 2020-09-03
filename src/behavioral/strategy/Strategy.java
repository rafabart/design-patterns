package behavioral.strategy;


// A interface estratégia declara operações comuns a todas as versões suportadas de algum algoritmo. O contexto usa essa
// interface para chamar o algoritmo definido pelas estratégias concretas.
public interface Strategy {

    Long calculate(final Long numberA, final Long numberB);
}
