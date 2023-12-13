package Tv;

 public class TvSet {
    int channel = 5;
     boolean isOn;

    public String toString(){
        if (!isOn){
            return "The TV set is off";
        }return "Channel " + channel + " is on the TvSet now";
    }

}
