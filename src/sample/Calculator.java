package sample;

import java.lang.Math;

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

    public String Root(){
        c = Math.sqrt(a);
        return x = "=" + c;
    }

    public String Square(int pok){
        c = Math.pow(a, pok);
        if (b > 0)x = "=" + c;
        return x;
    }

    public String Average(){
        c = (a+b)/2;
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
