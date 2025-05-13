import java.time.*;
import java.time.temporal.ChronoUnit;

public class exemploDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(2026, 3, 27);
        long diasRestantes = ChronoUnit.DAYS.between(hoje, aniversario);

        System.out.println("Faltam " + diasRestantes + " dias.");

    }
}
