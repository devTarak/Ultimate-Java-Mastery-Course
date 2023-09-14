import java.util.Scanner;

public class PassFailDetactor {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the make of Bangla: ");
        int a = myInput.nextInt();
        System.out.print("Enter the make of English: ");
        int b = myInput.nextInt();
        System.out.print("Enter the make of Math: ");
        int c = myInput.nextInt();
        int sum = (a+b+c)*100/300;
        if (a>=33 && b>=33 && c>=33 && sum>=40){
            System.out.printf("the student passed with %d%% mark",sum);
        }
        else{
            System.out.println("The student failed");
        }


    }
}
