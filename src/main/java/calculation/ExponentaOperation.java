package calculation;

public class ExponentaOperation {

    private double firstNumber;
    private int secondNumber;
    private int resultExp;

    public ExponentaOperation(double number1, int number2) {
        this.firstNumber = number1;
        this.secondNumber = secondNumber;
    }
    public double exp (){
        if (firstNumber <0){
            System.out.println("Введите положительное число");
        return 0;
        }
        else {
            double result = 1;
            for (int i = 0; i<this.secondNumber; i++) {
                result = result * this.firstNumber;

            }

            return result;
        }
    }

}
