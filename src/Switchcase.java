public class Switchcase {
    public static void main(String[] args) {
        int WagePerHour = 20;
        int HoursWorked = 8;
        int Wage = 0;
        String EmployeeType = "Part-Time";
        switch (EmployeeType) {
            case "Full TIme":
                Wage = WagePerHour * HoursWorked;
                System.out.println("Full-Time Employee Wage is :" + Wage);
                break;
            case "Part-Time":
                Wage = WagePerHour * HoursWorked / 2;
                System.out.println("Part-Time  Employee wage is:" + Wage);
                break;
            default:
                System.out.println("Invalid Employee Type");
                break;


        }
    }
}


