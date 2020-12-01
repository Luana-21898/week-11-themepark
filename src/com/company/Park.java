package com.company;

public class Park {

    int peopleLine = 90;
    int time=0;
    int newPeople = 63;
    int outPeople = 40;


            while (peopleLine <= 600) {
        peopleLine = peopleLine + newPeople - outPeople;
        time = time + 5;
    }
                System.out.println(time + " minutes");
            }