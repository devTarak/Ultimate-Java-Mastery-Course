import  java.util.Random;
import  java.util.Scanner;
class gameMain{
    Random Rm = new Random();
    private int com;
    private int Useer1;
    public void Genarator1(){
        com = Rm.nextInt(0,100);
    }
    public int gammer1(int n) {
        Useer1 = n;
    if (Useer1==com){
            return 1;
        } else if (Useer1>com) {
            System.out.println("Enter a smaller number");
            return 0;
        } else if (Useer1<com) {
            System.out.println("Enter a bigger number");
            return 0;
        } else {
            return 0;
        }
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Number Guess  Game");
        System.out.println("--------------------------------");
        Scanner myInput = new Scanner(System.in);
        gameMain Gm = new gameMain();
        Gm.Genarator1();
        int sum =0;
        while (true){
            System.out.print("Enter your number: ");
            int User = Gm.gammer1(myInput.nextInt());
            myInput.nextLine();
            if (User == 1){
                break;
            }
            else {
                sum+=1;
            }
            if (sum >8){
                break;
            }
        }
        System.out.printf("Your Score is: %d\n",sum);
        if (sum<=2){
            System.out.println("Excillent! you do amazing");
        } else if (sum<=5) {
            System.out.println("Good! Keep it up");
        } else if (sum<=7) {
            System.out.println("Need to be improve");
        }else {
            System.out.println("Sorry Failed");
        }
    }
}