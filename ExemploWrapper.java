
class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}

public class ExemploWrapper {
    public static void main(String[] args) {
        try {
            double resultado = dividir(10, 0); // dividir por zero
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage()); // mensagem de erro
        }
    }

    public static double dividir(double num1, double num2) throws DivisaoPorZeroException {
        if (num2 == 0) {
            throw new DivisaoPorZeroException("Erro: Não é possível dividir por zero!");
        }
        return num1 / num2;
    }

    
}
