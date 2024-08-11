package edu.métodos;

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
}
