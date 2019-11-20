package calculation;

public class FactorialOperation {


    private int number1;

    public FactorialOperation(int number1) {

        this.number1 = number1;
    }

    int fact(int number1){
        int result = 1;
        for (int i = 1; i <= this.number1; i++){
            result = result*i;

        }
        return result;
    }

}
