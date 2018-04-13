import java.util.Date;

public class Company {
    public static void main(String args[]) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Josephine", 
                new Date(144, 0, 1), 100);
        System.out.println(hourlyEmployee.getName());
    }
}
