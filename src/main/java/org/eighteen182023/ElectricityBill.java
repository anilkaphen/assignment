package org.eighteen182023;

public class ElectricityBill {

    public static  void main(String [] args ){

        double units = 350,b;

        b= calculateElectricityBill(units);

        System.out.println("Bill to pay : " + b);
    }
    public static double calculateElectricityBill(double units){
        {
            double billpay=0;

            if(units<100)
                billpay=units*10;
            else if(units<=200)
                billpay=100*20+(units-100)*2;
            else if(units>300)
                billpay=100*30+200 *2+(units-300)*3;
            return billpay;

        }}}


