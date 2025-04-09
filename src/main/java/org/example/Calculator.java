package org.example;

public class Calculator {
    public int result = 0;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void reset() {
        this.setResult(0);
    }

    public void plus(Integer num) {
        try {
            this.setResult(this.getResult() + num);
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            this.reset();
        }
    }

    public void minus(Integer num) {
        try {
            this.setResult(this.getResult() - num);
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            this.reset();
        }
    }

    public void mul(Integer num) {
        try {
            this.setResult(this.getResult() * num);
        } catch (NullPointerException | NumberFormatException e) {
            this.reset();
        }
    }

    public void div(int num) {
        try {
            this.setResult(this.getResult() / num);
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            this.reset();
        }
    }
}

