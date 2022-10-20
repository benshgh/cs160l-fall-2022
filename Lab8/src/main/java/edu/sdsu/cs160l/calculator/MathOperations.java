package edu.sdsu.cs160l.calculator;

/**
 * TODO change MathOperation class so that it has a dependency on DoubleCalculator class and not SimpleCalculator
 *  what you also need to do is change the method signatures from int to double.
 *
 */
public class MathOperations {

    private Calculator<Double> calculator;

    public MathOperations() {
        // TODO change this to use DoubleCalculator
        this.calculator = new SimpleCalculator();
    }

    // Do not change this to double, let it be int only
    public int factorial(int n){
        int factorial = 1;
        for(int i=2;i<=n;i++){
            factorial = calculator.mul(factorial, i);
        }
        return factorial;
    }

    public int average(int[] arr){
        int sum=0;
        for(int i : arr){
            sum = calculator.add(sum, i);
        }

        return calculator.div(sum, arr.length);
    }

    // Make sure the second variable is int only
    // the signature should look like double power(double a, int b)
    public int power(int a, int b){
        int res = 1;
        for(int i=1;i<=b;i++){
            res = calculator.mul(res, a);
        }
        return  a;
    }

    public int midValue(int a, int b){
        int sub  = calculator.sub(a, b);
        int midValue = calculator.div(sub, 2);
        return midValue;
    }

    public int fahrenheitToCelsius(int fahrenheit){
        int baseSubtraction = calculator.sub(fahrenheit, 32);
        int baseMultiplication = calculator.mul(baseSubtraction, 5);
        int baseDivision = calculator.div(baseMultiplication, 9);
        return baseDivision;
    }
}
