package Tv;

public class Main {
    public static void main(String[] args) {
        TvSet tv = new TvSet();
        Remote remote = new Remote();
        remote.setTvset(tv);
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        System.out.println(remote);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);
    }
}
