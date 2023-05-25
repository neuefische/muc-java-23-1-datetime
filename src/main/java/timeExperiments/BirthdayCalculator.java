package timeExperiments;

import java.time.LocalDate;
import java.time.Period;

public class BirthdayCalculator {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1995, 9, 20);
        LocalDate birthdayThisYear = birthday.withYear(LocalDate.now().getYear());

        Period periodUntilBirthday = Period.between(LocalDate.now(), birthdayThisYear);


        System.out.println(periodUntilBirthday.getMonths() +
                " Monate und "  + periodUntilBirthday.getDays() + " Tage bis zum Geburtstag: ");

    }
}
