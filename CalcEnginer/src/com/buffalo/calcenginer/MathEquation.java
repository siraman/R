package com.buffalo.calcenginer;

public class MathEquation {
    private double leftVals;
    private double rightVals;
    private char opCode;
    private double result;

    public double getLeftVals(){
        return leftVals;
    }
    public void setLeftVals(double leftVals){
        this.leftVals=leftVals;
    }
    public double getRightVals(){
        return rightVals;
    }
    public void setRightVals(double rightVals){
        this.rightVals=rightVals;
    }
    public double getOpCode(){
        return opCode;
    }
    public void setOpCode(char opCode){
        this.opCode=opCode;
    }
    public double getResult(){
        return result;
    }

    public MathEquation(){

    }
    public MathEquation(char opCode){
        this.opCode=opCode;
    }

    public MathEquation(char opCode,double leftVals,double rightVals){
        this(opCode);
        this.leftVals=leftVals;
        this.rightVals=rightVals;
    }

    public void execute(double leftVals,double rightVals){
       this.leftVals=leftVals;
       this.rightVals=rightVals;
       execute();
    }
    public void execute(int leftVals,int rightVals){
        this.leftVals=leftVals;
        this.rightVals=rightVals;
        execute();
        result =(int) result;
    }
    public void execute(){
        switch (opCode) {
            case 'a':
                result = leftVals + rightVals;
                break;

            case 's':
                result = leftVals- rightVals;
                break;

            case 'd':
                result= rightVals != 0.0d ? leftVals / rightVals : 0.0d;
                break;

            case 'm':
                result = leftVals * rightVals;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
