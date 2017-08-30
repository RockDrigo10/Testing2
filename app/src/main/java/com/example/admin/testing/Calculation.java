package com.example.admin.testing;

/**
 * Created by Admin on 8/29/2017.
 */

public class Calculation {

    int val1;
    int val2;
    Addition addition;
    Subtraction subtract;
    Multiplication multiply;
    Division divide;

    public Calculation(Addition addition, Subtraction subtract, Multiplication multiply, Division divide) {
        this.addition = addition;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int add() {
        return addition.add(val1,val2);
    }

    public int subtract() {
        return subtract.subtract(val1,val2);
    }

    public int multiply() {
        return multiply.multiply(val1,val2);
    }

    public int divide() {
        return divide.divide(val1,val2);
    }
    public void clear(){
        val1 = 0;
        val2 = 0;
    }

}
