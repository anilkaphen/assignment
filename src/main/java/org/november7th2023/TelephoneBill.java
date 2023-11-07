package org.november7th2023;

public class TelephoneBill {

    public static void main(String[] args) {

        TelephoneBill telephoneBill = new TelephoneBill();
        System.out.println("1stBill :" +telephoneBill.calculateTelephoneBill(100));
        System.out.println("2ndBill :" +telephoneBill.calculateTelephoneBill(150));
        System.out.println("3rdBill :" +telephoneBill.calculateTelephoneBill(300));
    }

    public int calculateTelephoneBill(int call) {
        double charge;
        double amt;
        if (call <= 100)
            charge = call * 0.6;
        else if (call <= 200)
            charge = 60 + ((call - 100) * 0.8);
        else if (call <= 300)
            charge = 60 + 80 + ((call - 200) * 1.2);
        else
            charge = 60 + 80 + 120 + ((call - 300) * 1.5);

       return (int) (amt = charge + 125);


}}
