import java.time.*;
import java.time.temporal.ChronoUnit;

public class exemploDate {
    public static void main(String[] args) {
        // data atual
        LocalDate hoje = LocalDate.now();

        // data do aniversário
        LocalDate aniversario = LocalDate.of(2026, 3, 27);

        // calcular a diferença em dias
        long diasRestantes = ChronoUnit.DAYS.between(hoje, aniversario);

        System.out.println("Faltam " + diasRestantes + " dias.");

    }
}
