public class SimpleCalculator {
    public double Add(double a,double b){
        return a + b;
    }
    public double substract(double a,double b){
        return a - b;
    }
    public double multiple(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        if(b == 0)
            throw new IllegalArgumentException("The devisor should not 0!! ");
        return a / b;
    }
}
