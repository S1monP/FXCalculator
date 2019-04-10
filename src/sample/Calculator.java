package sample;

public class Calculator {
    private double a, b, c;
    private String x;
    Calculator (double a, double b){
        this.a = a;
        this.b = b;
    }

    public String Plus(){
        c = a + b;
        return x = "=" + c;
    }

    public String Minus(){
        c = a - b;
        return x = "=" + c;
    }

    public String Mnoz(){
        c = a * b;
        return x = "=" + c;
    }

    public String Delenie(){
        c = a / b;
        if (b > 0)x = "=" + c;
        else x = "***На 0 не делим!***";
        return x;
    }
}
