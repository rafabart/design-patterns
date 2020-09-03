package behavioral.strategy;

// Estratégias concretas implementam o algoritmo enquanto seguem a interface estratégia base. A interface faz delas
// intercomunicáveis no contexto.
public class ConcreteStrategyDivision implements Strategy {

    @Override
    public Long calculate(Long numberA, Long numberB) {
        return numberA / numberB;
    }
}
