package Arithmetic;

public class Arithmetic <Nf extends Number, Ns extends Number> {
    private final Nf num1st;
    private final Ns num2nd;

    public Arithmetic (Nf num1st, Ns num2nd){
        if(!(num1st instanceof Number) || !(num2nd instanceof Number)){
            throw new IllegalArgumentException("Invalid");
        }
        this.num1st = num1st;
        this.num2nd = num2nd;
    }
    public Number add(){
        return num1st.doubleValue() + num2nd.doubleValue();
    }
    public Number subtract(){
        return num1st.doubleValue() - num2nd.doubleValue();
    }
    public Number multiply(){
        return num1st.doubleValue() * num2nd.doubleValue();
    }
    public Number divide(){
        if(num2nd.doubleValue() == 0){
            throw new ArithmeticException("Cannot divide with zero");
        }
        return num1st.doubleValue() / num2nd.doubleValue();
    }
    public Number getMin(){
        return Math.min(num1st.doubleValue(), num2nd.doubleValue());
    }
    public Number getMax(){
        return Math.max(num1st.doubleValue(), num2nd.doubleValue());
    }
}
