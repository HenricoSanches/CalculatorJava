package calculadora;

/**
 * Calculadora simples que realiza operações básicas entre dois inteiros.
 * Suporta: "+", "-", "*" e "/".
 *
 * @author Henrico
 * @version 1.0
 */
public class Calculadora {

    /**
     * Executa a operação especificada entre a e b.
     *
     * @param a  primeiro operando
     * @param b  segundo operando
     * @param op operador: "+", "-", "*" ou "/"
     * @return resultado inteiro da operação
     * @throws IllegalArgumentException se o operador for inválido ou em divisão por zero
     */
    public int calc(int a, int b, String op) {
        switch (op) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operador inválido: " + op);
        }
    }

    /** Soma a + b. */
    private int somar(int a, int b) {
        return a + b;
    }

    /** Subtrai a - b. */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /** Multiplica a * b. */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide a / b (divisão inteira).
     *
     * @throws IllegalArgumentException se b for 0
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}
