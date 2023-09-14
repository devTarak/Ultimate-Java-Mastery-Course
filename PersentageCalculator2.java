import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersentageCalculator2 {
    public static void main(String[] args){
        System.out.println("BTEB result persentage Calculator");
        System.out.println("----------------------------------");
        Scanner myInputObj = new Scanner(System.in);
        List <Integer> list1=new ArrayList<Integer>();
        for (int i=1; i<6; i++){
            System.out.print("Enter the "+i+"No. Subject Number: ");
            int a = myInputObj.nextInt();
            int sum = a*100/100;
            //float b = (float) a;
            list1.add(sum);
        }
        int j = 1;
        for (Integer Number1:list1){
            System.out.print("The Persentage of the "+j+" No.: ");
            System.out.print(Number1);
            System.out.println("%");
            j +=1;
        }
    }
}