public class exemploWrapper {
    public static void main(String[] args) {
        Integer myInt = 100;

        String myString = myInt.toString();

        System.out.println("Comprimento da string: " + myString.length());

        int primitiveInt = myInt.intValue();
        System.out.println("Valor primitivo: " + primitiveInt);
        
        if (myInt % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

    }
}
