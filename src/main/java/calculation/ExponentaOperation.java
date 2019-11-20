package calculation;

public class ExponentaOperation {

    private double number1;
    private int number2;
    private int resultExp;

    public ExponentaOperation(double number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public double exp (){
        if (number1 <0){
            System.out.println("Введите положительное число");
        return 0;
        }
        else {
            double result = 1;
            for (int i = 0; i<this.number2; i++) {
                result = result * this.number1;

            }

            return result;
        }
    }

}
