package edu.métodos;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Tv tv = new Tv();
        boolean exec = true;
        Scanner myScanner = new Scanner(System.in); // ignorar erro

        System.out.println("PHILCO TV");

        while (exec == true) {
            System.out.println("Remote Control: 1 - turn on/off TV, 2 - increase volume, 3 - decrease volume, 4 - change to this channel, 5 - next channel, 6 - back one channel, 7 - exit");
            int command = myScanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println(tv.toggleTv());
                    break;
                case 2:
                    System.out.println(tv.increaseVolume());
                    break;
                case 3:
                    System.out.println(tv.decreaseVolume());
                    break;
                case 4:
                    System.out.println("Enter the channel number:");
                    int channelNumber = myScanner.nextInt();
                    System.out.println(tv.changeToChannel(channelNumber));
                    break;
                case 5:
                    System.out.println(tv.nextChannel());
                    break;
                case 6:
                    System.out.println(tv.backChannel());
                    break;
                case 7:
                    System.out.println("Quit");
                    exec = false;
                    break;
            }
        }
    }
}
