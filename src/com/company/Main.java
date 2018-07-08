package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         int speechDurability;
         int weekDay;

        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Введите длительность разговора (минута - 1.80)");
            speechDurability = in.nextInt();
            }while(speechDurability < 0);
            System.out.println("Введите день недели цифрой");
            weekDay = in.nextInt();


            switch (weekDay){
                case 1: case 2: case 3: case 4: case 5:
                    System.out.println("Стоимость разговора: " + (1.8*speechDurability));
                    break;
                case 6: case 7:
                    System.out.println("Предоставляется скидка 20%. \nСтоимость разговора: " + ((speechDurability*8)/10)*1.8 + " грн.");
                    break;
                    default:
                        System.out.println("День недели введён неверно");
                        break;}


    }
}
