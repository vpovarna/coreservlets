package people;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employ = new Employee("Vlad", "Povarna", 1234, "Adobe");
        System.out.printf("%s%n", employ.toString());
    }
}
