public interface Device {
    boolean isOn();
    void turnOn();
    void turnOff();
    int getVolume();
    void setVolume(int value);
    int getChannel();
    void setChannel(int value);
    void status();
}
