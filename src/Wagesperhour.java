public class Wagesperhour {
    public static void main(String[] args) {
        int WagePerHour=20;
        int HoursWorked=8;
        int Wage=0;
        int WoringsDayPerMonth=20;
        int totalwage=0;
        for(int i=1;i<=WoringsDayPerMonth;i++){
            int randomNum =(int) (Math.random()*2);
            if(randomNum==1){
                Wage=WagePerHour*HoursWorked;
                totalwage=totalwage+Wage;
            }
        }
        System.out.println("The totalWagesPerMonth is:" +totalwage);

    }
}
