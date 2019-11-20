package calculation;

class SumOperation {

    private double num1;
    private double num2;

    SumOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double summ(){
        return this.num1+this.num2;
    }

}
