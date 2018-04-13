import java.util.Date;
public class CompareTest {

    public static void main(String[] args) {
        Employee employeeA = new Employee("test", new Date(144, 0, 1));
        Employee employeeB = new Employee("test", new Date(144, 0, 1));

        System.out.println(employeeA.equals(employeeB));
        System.out.println(employeeA == employeeB);
    }
}
