import java.util.Random;

public class Employeewage {
    public static void main(String[] args) {
        Random rand=new Random();
        int attendence=rand.nextInt(2);
        if(attendence==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
