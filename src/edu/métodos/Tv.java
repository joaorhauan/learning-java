package edu.métodos;
import java.util.Scanner;

public class Tv {
    boolean on = false;
    int channel = 0;
    int volume = 0;

    public String toggleTv() {
        on = !on;
        return on == true ? "TV ON" : "TV OFF";
    }

    public int increaseVolume() {
        if (on == true)
            volume++;
        return volume;
    }

    public int decreaseVolume() {
        if (on == true && volume >= 1)
            volume--;
        return volume;
    }

    public int changeToChannel(int newChannel) {
        if (on == true)
            channel = newChannel;
        return channel;
    }

    public int nextChannel() {
        if (on == true)
            channel++;
        return channel;
    }

    public int backChannel() {
        if (on == true && channel >= 1)
            channel--;
        return channel;
    }

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
            // if (command == 1) {
            //     System.out.println(tv.toggleTv());
            // } else if (command == 2) {
            //     System.out.println(tv.increaseVolume());
            // } else if (command == 3) {
            //     System.out.println(tv.decreaseVolume());
            // } else if (command == 4) {
            //     System.out.println("Enter the channel number:");
            //     int channelNumber = myScanner.nextInt();
            //     System.out.println(tv.changeToChannel(channelNumber));
            // } else if (command == 5) {
            //     System.out.println(tv.nextChannel());
            // } else if (command == 6) {
            //     System.out.println(tv.backChannel());
            // } else if (command == 7) {
            //     System.out.println("Quit");
            //     exec = false;
            // }
        }        
    }
}
