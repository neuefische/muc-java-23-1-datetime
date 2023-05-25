package timeExperiments;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TimeScenarios {

    public static void main(String[] args) {
        // Wie speichern wir die Abflugszeit eines Flugzeugs
        ZonedDateTime abflugsZeit = ZonedDateTime.now();

        // Wie speichern wir die Uhrzeiten auf einem Bus-Fahrplan
        LocalDateTime busAbfahrt = LocalDateTime.now();

        // Wie speichern wir, wann der Notruf in der Zentrale eingeht
        LocalDateTime notruf = LocalDateTime.now();
        ZonedDateTime notrufAusRegion = ZonedDateTime.now();

        // Wie speichern wir, wann Ostern im Jahre 2024 stattfindet
        LocalDate ostern = LocalDate.of(2024, 4, 21);

        // Wie rechnen wir aus, wie lange ein Ticket mit 1-Tag-Gültigkeit endet?
        LocalDateTime ticketFuer24Stunden = LocalDateTime.now().plusDays(1);

        // Wie speichert man das Datum neben einer Unterschrift (Vertragsverwaltungssoftware)?
        // International = Time Zone wichtig
        ZonedDateTime vertragsBeginn = ZonedDateTime.now();

        // Wann feiern wir Silvester? Am 1.1. um 00:00 (egal wo)
        LocalDate silvester = LocalDate.of(2023, 12, 31);

        // Wann ist der Videocall?
        ZonedDateTime videocall = ZonedDateTime.now();
    }


}
