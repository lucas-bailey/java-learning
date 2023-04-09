package com.lucasbailey.java.learning;

public class LogicGates {

    boolean input1 = false;
    boolean input2 = false;
    boolean result = false;

    public void andGate(){
        System.out.println("AND Gate");
        System.out.println("--------");
        input1 = false;
        input2 = false;
        result = input1 && input2;
        System.out.println("false AND false = " + result);
        input1 = true;
        input2 = false;
        result = input1 && input2;
        System.out.println("true AND false = " + result);
        input1 = false;
        input2 = true;
        result = input1 && input2;
        System.out.println("false AND true = " + result);
        input1 = true;
        input2 = true;
        result = input1 && input2;
        System.out.println("true AND true = " + result);
    }


    public void orGate(){
        System.out.println();
        System.out.println("OR Gate");
        System.out.println("--------");
        input1 = false;
        input2 = false;
        result = input1 || input2;
        System.out.println("false OR false = " + result);
        input1 = true;
        input2 = false;
        result = input1 || input2;
        System.out.println("true OR false = " + result);
        input1 = false;
        input2 = true;
        result = input1 || input2;
        System.out.println("false OR true = " + result);
        input1 = true;
        input2 = true;
        result = input1 || input2;
        System.out.println("true OR true = " + result);

    }


    public void notGate(){
        System.out.println();
        System.out.println("NOT Gate");
        System.out.println("--------");
        input1 = false;
        result = !input1;
        System.out.println("NOT false = " + result);
        System.out.println("NOT true = " + result);
    }

    public void nandGate(){
        System.out.println();
        System.out.println("NAND Gate");
        System.out.println("--------");
        input1 = false;
        input2 = false;
        result = !(input1 && input2);
        System.out.println("false NAND false = " + result);
        input1 = true;
        input2 = false;
        result = !(input1 && input2);
        System.out.println("true NAND false = " + result);
        input1 = false;
        input2 = true;
        result = !(input1 && input2);
        System.out.println("false NAND true = " + result);
        input1 = true;
        input2 = true;
        result = !(input1 && input2);
        System.out.println("true NAND true = " + result);


    }

    public void norGate(){
        System.out.println();
        System.out.println("NOR Gate");
        System.out.println("--------");
        input1 = false;
        input2 = false;
        result = !(input1 || input2);
        System.out.println("false NOR false = " + result);
        input1 = true;
        input2 = false;
        result = !(input1 || input2);
        System.out.println("true NOR false = " + result);
        input1 = false;
        input2 = true;
        result = !(input1 || input2);
        System.out.println("false NOR true = " + result);
        input1 = true;
        input2 = true;
        result = !(input1 || input2);
        System.out.println("true NOR true = " + result);
    }




}
