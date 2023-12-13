package Tv;

public class Remote {
    private TvSet tvSet;

    public void setTvset(TvSet tvSet){
        this.tvSet=tvSet;
    }

    public void setChannel(int channel){
        tvSet.channel=channel;
    }

    public void turnOn(){
        tvSet.isOn=true;
    }

    public void turnOff(){
        tvSet.isOn=false;
    }

    public String toString(){
        return "I set " + tvSet.channel + " channel on TV";
    }
}
