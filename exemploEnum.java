public class exemploEnum {
    public static void main(String[] args) {
        Sinal sinalAtual = Sinal.VERDE;
        System.out.println("Sinal Atual: " + sinalAtual);
        System.out.println("Mensagem: " + sinalAtual.getMensagem());
        if (sinalAtual == Sinal.VERDE) {
            System.out.println("Você pode seguir.");
        } else if (sinalAtual == Sinal.AMARELO) {
            System.out.println("Atenção, reduza a velocidade.");
        } else if (sinalAtual == Sinal.VERMELHO) {
            System.out.println("PARE!");
        }
    }

    public enum Sinal {
        VERDE("Siga"),
        AMARELO("Atenção"),
        VERMELHO("Pare");
        
        private final String mensagem;

        Sinal(String mensagem) {
            this.mensagem = mensagem;
        }

        public String getMensagem() {
            return mensagem;
        }
    }

}
