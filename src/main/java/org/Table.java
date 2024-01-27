package org;

public class Table {
    public static void main(String[] args) {
        Table table = new Table();
        table.getTable(2);
        table.getOddNumber(10, 20);
        table.getTelephoneBill(20);
        System.out.println("telephone bill "+table.getTelephoneBill(20));

    }

    public void getTable(Integer num) {
        //int i =1;
        for (int i = 1; i <= 10; i++) {

            System.out.println(num + "* " + i + " =" + num * i);
        }

    }

    public void getOddNumber(Integer start, Integer end) {
        //int number =100;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
        }

    }
    public int getTelephoneBill(int unit){
        int b=0;

            int i = unit;

            if (i <= 100) {
                b = i * 10;
            } else {
                b = 100 * 10;
                i = i - 100;

                if (i <= 100) {
                    b = b + i * 20;
                } else {
                    b = b + 100 * 20;
                    i = i - 100;

                    b = b + i * 30;

                }
            }
    return b;
}}
