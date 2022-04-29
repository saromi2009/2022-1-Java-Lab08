package edu.handong.csee.java.hw2.math;


public class MathCalculator{
    ///Field
    private String name;
    ///Method

    ///setter
    public void setName(String newName){
        this.name = newName;
    }
    ///getter
    public String getName(){
        return name;
    }
    ///Max
    public int getMax(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    ///Min
    public int getMin(int x, int y){
        if(x<y){
            return x;
        }
        else{
            return y;
        }
    }
    ///Abs
    public int getAbs(int x){
        if(x<0){
            return x*-1;
        }
        else{
            return x;
        }
    }
    ///Addition (Sum)
    public int getSum(int x, int y){
        return x+y;
    }
    ///Subtraction (Difference)
    public int getDiff(int x, int y){
        return x-y;
    }
    ///Multiplication (Product)
    public int getProduct(int x, int y){
        return x*y;
    }
    ///Division (Quotient)
    public int getQuotient(int x, int y){
        return x/y;
    }
    ///Remainder
    public int getRemainder(int x, int y){
        return x%y;
    }
    ///Power
    public int getPower(int x, int y){
        int power=1;
        if(y==0){
            power = 1;
        }
        else{
            for(int i=0;i<y;i++){
                power*=x;
            }
    }
        return power;
    }
    ///Factorial
    public int getFactorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    ///GCD
    public int getGCD(int x, int y){
        int min= (x<y) ? x:y;
        int gcd=0;

        for(int i=1; i<=min; i++){
            if( x%i == 0 && y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    ///LCM
    public int getLCM(int x, int y){
        return (x*y)/getGCD(x, y);
    }
    ///Square
    public int getSquare(int x){
        return x*x;
    }

}






