class invalidInputError extends Exception{
    public String toString(){
        return "Please input a valid operation";
    }
}
class DividedByZero extends Exception{
    public String toString(){
        return "Divided by Zero Not Excepted \n Math ERROR Ocared";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Not Supported Max Input Exits";
    }
}
class MaxMultiplaierReached extends Exception{
    public String toString(){
        return "You can't Multiply more Limit Exixt";
    }
}
class CalculatorOPP{
    private double a;
    private String b;
    private double c;
    CalculatorOPP(double a, String b, double c) throws invalidInputError,MaxInputException{
        this.a = a;
        this.b =b;
        this.c = c;
        if (this.a<100000 && this.c<100000) {
            if (this.b == "+") {
                System.out.println(addition(this.a, this.c));
            } else if (this.b == "-") {
                System.out.println(Substraction(this.a, this.c));
            } else if (this.b == "x") {
                try {
                    System.out.println(Multipication(this.a, this.c));
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else if (this.b == "/") {
                try {
                    System.out.println(division(this.a, this.c));
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                try {
                    throw new invalidInputError();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }else {
            try {
                throw new MaxInputException();
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }
    private double addition(double a, double b){
        return a+b;
    }
    private double Substraction(double a, double b){
        return a-b;
    }
    private double Multipication(double a, double b) throws MaxMultiplaierReached{
        if(a<7000 && b <700) {
            return a*b;
        }else {
            try {
                throw new MaxMultiplaierReached();
            }catch (Exception e){
                System.out.println(e.toString());
            }
            return 0;
        }
    }
    private double division(double a, double b) throws DividedByZero{
        if (b>0){
            return a/b;
        }else {
            try {
                throw new DividedByZero();
            }catch (Exception e){
                System.out.println(e.toString());
            }
            return 0;
        }
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        try {
            CalculatorOPP CO = new CalculatorOPP(50,"*",10);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}