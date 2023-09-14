import java.util.Scanner;
class MyLibeary{
  private String [] avaibleBook = {"Bsg", "ICT", "Fun Java", "Python for Beg", "math 1","Physics" };
  private String [] issuedBook;
  public void showAvaibleBook(){
      for(int i=1; i<=avaibleBook.length; i++) {
          if (avaibleBook[i-1]==null){
              continue;
          }else {
              System.out.print(avaibleBook[i-1]+", ");
          }
      }
      System.out.println();
  }
  public void getBook(String n){
      for (int i=0; i < this.avaibleBook.length; i++){
          if (this.avaibleBook[i] != null && avaibleBook[i].equals(n)){
              System.out.println("Avaible! Take this book: "+n);
                //String a = avaibleBook[i];
              for (int j = i; j<avaibleBook.length-1; j++){
                  avaibleBook[j]=avaibleBook[j+1];
              }
              avaibleBook[avaibleBook.length-1] = null;
              break;
          }
          else if (i == (avaibleBook.length-1)) {
              System.out.println("Book not avaible");
          }
      }
  }
  public void returnBook(String n){
      for (int i=0; i<avaibleBook.length;i++){
          if (avaibleBook[i]==null){
              avaibleBook[i]=n;
              System.out.println("Thank you for return our book");
              break;
          } else if (i==avaibleBook.length-1) {
              System.out.println("No enough space in libeary");
          }
      }
  }
}
public class Exercise4 {
    public static void main(String[] args) {
        MyLibeary Ml = new MyLibeary();
        Scanner myInput = new Scanner(System.in);
        System.out.println("Hello sir! Here is the books that We have in our library");
        Ml.showAvaibleBook();
        System.out.print("Enter How much book do you need: ");
        int Num = myInput.nextInt();
        myInput.nextLine();
        for(int m =1;m<=Num;m++){
            System.out.printf("Enter the %dst book: ",m);
            String Name1 = myInput.nextLine();
            Ml.getBook(Name1);
            System.out.print("Avaible books: ");
            Ml.showAvaibleBook();
        }
        System.out.print("Do you want to return any book(if yes(0) or No(1)): ");
        int d = myInput.nextInt();
        if (d==0){
            System.out.print("Enter How much book do you return: ");
            int Num2 = myInput.nextInt();
            myInput.nextLine();
            for (int i = 0;i<Num2;i++){
                System.out.print("Enter the book Name: ");
                String BKName = myInput.nextLine();
                Ml.returnBook(BKName);
            }
            System.out.print("Now! Avaible books: ");
            Ml.showAvaibleBook();
        }
    }
}