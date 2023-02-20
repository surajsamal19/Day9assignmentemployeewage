public class Dailyemployeewage {
    public static void main(String[] args) {
        int wageperhour=20;
        int FullDayHour=8;
        int ParttimeHour=8;
        int DailyWage=(wageperhour*FullDayHour)+ParttimeHour;
        int PartTimeWage=wageperhour*ParttimeHour;
        System.out.println("The Dailywage is:"+DailyWage);
        System.out.println("The ParttimeWage is:" +PartTimeWage);
    }
    }

