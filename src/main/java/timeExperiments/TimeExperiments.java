package timeExperiments;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeExperiments {

    public static void main(String[] args) {
        // Uhrzeit
        LocalTime uhrzeit = LocalTime.now();
        System.out.println("Uhrzeit: " + uhrzeit);

        // Datum
        LocalDate datum = LocalDate.now();
        System.out.println("Datum: " + datum);

        LocalDateTime datumUndZeit = LocalDateTime.now();
        System.out.println("Datum & Zeit: " + datumUndZeit);

        // Wie machen wir die Anzeige hübsch?
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        System.out.println("Datum & Zeit hübsch: " + dateTimeFormatter.format(datumUndZeit));

        // Datum erstellen
        LocalDateTime datumUndZeitSelbstErstellt = LocalDateTime.of(2023, 8, 1, 12, 00, 00);
        System.out.println("Datum & Zeit SelbstErstellt: " + dateTimeFormatter.format(datumUndZeitSelbstErstellt));


        ZonedDateTime zeitpunktJetztInDieserKonkretenZeitzone = ZonedDateTime.now();
        System.out.println("zeitpunktJetztInDieserKonkretenZeitzone " + zeitpunktJetztInDieserKonkretenZeitzone);

        // UTC = Konkreter Moment in Nanosekund

        Instant schnappschuss = Instant.now();
        System.out.println("\nschnappschuss: " + schnappschuss);

        ZonedDateTime jetztInDeutschland = ZonedDateTime.ofInstant(schnappschuss, ZoneId.of("Europe/Berlin"));
        System.out.println("jetztInDeutschland: " + dateTimeFormatter.format(jetztInDeutschland));

        ZonedDateTime jetztInJapan = ZonedDateTime.ofInstant(schnappschuss, ZoneId.of("Asia/Tokyo"));
        System.out.println("jetztInJapan: " + dateTimeFormatter.format(jetztInJapan));


        Instant instant1 = ZonedDateTime.of(2023, Month.MAY.getValue(), 23, 13, 37, 30, 0,
                ZoneId.of("Europe/Berlin")).toInstant();
        Instant instant2 = ZonedDateTime.of(2023, Month.MAY.getValue(), 23, 14, 37, 30, 0,
                ZoneId.of("Europe/Berlin")).toInstant();

    }
}
