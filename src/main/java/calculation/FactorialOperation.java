package calculation;

public class FactorialOperation {


    private int firstNumber;

    public FactorialOperation(int number1) {

        this.firstNumber = number1;
    }

    int fact(int number1){
        int result = 1;
        for (int i = 1; i <= this.firstNumber; i++){
            result = result*i;

        }
        return result;
    }

}