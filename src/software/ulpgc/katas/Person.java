package software.ulpgc.katas;
import java.time.LocalDate;
import java.time.Period;

public record Person(String name, LocalDate birthday) {
    public int getAge() {
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }
}