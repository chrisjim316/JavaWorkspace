/*
 * This class includes all basic functions of a television. 
 */

public class Television {

    private String manufacturer; //the maker of the television
    private int screenSize; //the size of the television
    private boolean powerOn; //contains true if the TV power is on
    private int channel; //the numeric station setting
    private int volume; //the numeric level of the sound


    public Television(String brand, int size){
        manufacturer = brand;
        screenSize = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }


    public int getVolume(){
        return volume;
    }


    public int getChannel(){
        return channel;
    }


    public String getManufacturer(){
        return manufacturer;
    }


    public int getScreenSize(){
        return screenSize;
    }


    public void setChannel(int channel){
        this.channel = channel;
    }


    public void power(){
        powerOn = !powerOn;
    }


    public void increaseVolume(){
        volume++;
    }


    public void decreaseVolume(){
        volume--;
    }


    public void mute(){
        volume = 0; 
    }

}//end class 
