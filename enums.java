// This is an enumeration (enum) that defines the days of the week.
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// The main class where the program execution begins.
public class enums {
    public static void main(String[] args) {
        // We create a variable 'today' of type 'Day' and set it to WEDNESDAY.
        Day today = Day.WEDNESDAY;
        
        // We print out the value of 'today' to the console.
        System.out.println("Today is " + today);
    }
}

// The output of this program will be:
// Today is WEDNESDAY
// This shows that the variable 'today' holds the value WEDNESDAY from the Day enum.
