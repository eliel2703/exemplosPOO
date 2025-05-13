public class ExemploException {
    public static void main(String[] args) {
        try {
            checkPassword("54321");  
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPassword("12345");  // Senha correta
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void checkPassword(String password) {
        String correctPassword = "12345"; 

        if (!password.equals(correctPassword)) {
            throw new ArithmeticException("Acesso Negado - Senha Incorreta.");
        } else {
            System.out.println("Accesso Aprovado - Senha Correta!");
        }
    }

}
