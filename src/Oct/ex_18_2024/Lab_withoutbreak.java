package Oct.ex_18_2024;

import java.util.Scanner;

public class Lab_withoutbreak {
    public static void main(String[] args) {
        //switch condition
        //user - enter integer no 1 tp 10
        //with day it is
        // 1- mon 4-tha  .. 0 or -1 or 8 - inavlid
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("mon");

            case 2:
                System.out.println("tue");

            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("tur");

            case 5:
                System.out.println("fri");

            case 6:
                System.out.println("sat");

            case 7:
                System.out.println("sun");
              
            default:
                System.out.println("no idea which day it is");


        }



    }
}
