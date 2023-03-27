package oop_itvdn.ninth_lesson.device_equals_hashcode;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor device = (Monitor) obj;
        if (!super.equals(obj) || resolutionX != device.resolutionX|| resolutionY != device.resolutionY) return false;
        else return true;
    }


    @Override
    public int hashCode(){
        System.out.print("");
        return super.hashCode();
    }




    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
}
