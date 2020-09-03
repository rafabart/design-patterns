package behavioral.strategy;


// O código cliente escolhe uma estratégia concreta e passa ela para o contexto. O cliente deve estar ciente das diferenças
// entre as estratégia para que faça a escolha certa.
public class Main {
    public static void main(String[] args) {

        Context context = new Context();

        final Long numberA = 10L;
        final Long numberB = 5L;
        final String operation = "subtraction";


        switch (operation) {
            case "addition":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "subtraction":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "multiplication":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            case "division":
                context.setStrategy(new ConcreteStrategyDivision());
                break;
        }


        Long result = context.executeCalculate(numberA, numberB);

        System.out.println(operation);
        System.out.println(result);
    }
}
