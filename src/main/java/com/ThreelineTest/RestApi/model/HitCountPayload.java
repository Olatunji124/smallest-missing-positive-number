package com.ThreelineTest.RestApi.model;

public class HitCountPayload {
    //variables in payload object are wrong as they negate the rules  of variable naming
    //they  can be renamed according to their usages
    int variableOne;
    int variableTwo;
    int variableThree;

    //Getters and Setters
    public int getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(int variableOne) {
        this.variableOne = variableOne;
    }

    public int getVariableTwo() {
        return variableTwo;
    }

    public void setVariableTwo(int variableTwo) {
        this.variableTwo = variableTwo;
    }

    public int getVariableThree() {
        return variableThree;
    }

    public void setVariableThree(int variableThree) {
        this.variableThree = variableThree;
    }
}
