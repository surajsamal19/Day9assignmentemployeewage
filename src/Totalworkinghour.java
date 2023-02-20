public class Totalworkinghour {
    public static void main(String[] args) {
        int WagePerHour=20;
        int HoursWorked=8;
        int Wage=0;
        int WorkingDaysPerMonth=20;
        int TotalWorkingHoursPerMonth=100;
        int TotalWorkingDays=0;
        int TotalWorkingHours=0;
        int TotalWage=0;
        while(TotalWorkingDays<WorkingDaysPerMonth&& TotalWorkingHours<TotalWorkingHoursPerMonth){
            int randomNum=(int)(Math.random()*2);
            if(randomNum==1){
                Wage=WagePerHour*HoursWorked;
                TotalWage=TotalWage+Wage;
                TotalWorkingHours=TotalWorkingHours+HoursWorked;
            }
            TotalWorkingDays++;
        }
        System.out.println("The total Employee Wage per Month is:" +TotalWage);
    }
    }

