package calculadora;

/**
 * Teste simples para a classe Calculadora.
 * Execute: java calculadora.TesteCalculadora
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Casos normais
        System.out.println("2 + 3 = " + calc.calc(2, 3, "+"));        // esperado: 5
        System.out.println("10 - 4 = " + calc.calc(10, 4, "-"));     // esperado: 6
        System.out.println("6 * 7 = " + calc.calc(6, 7, "*"));       // esperado: 42
        System.out.println("20 / 5 = " + calc.calc(20, 5, "/"));     // esperado: 4

        // Teste divisão por zero
        try {
            System.out.println("5 / 0 = " + calc.calc(5, 0, "/"));
            System.out.println("ERRO: Divisão por zero não lançou exceção!");
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção esperada em 5 / 0: " + e.getMessage());
        }

        // Teste operador inválido
        try {
            System.out.println("1 % 2 = " + calc.calc(1, 2, "%"));
            System.out.println("ERRO: Operador inválido não lançou exceção!");
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção esperada para operador inválido: " + e.getMessage());
        }

        // Mais alguns testes rápidos
        System.out.println("0 + 0 = " + calc.calc(0, 0, "+")); // esperado: 0
        System.out.println("-3 * 5 = " + calc.calc(-3, 5, "*")); // esperado: -15
    }
}
