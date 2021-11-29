package Project;

/**
 * @author Hamza Akbar
 */
public class PixelColor {
    int [] rgba;
//    String color;
    String bitPattern;
    String hexa;
    int frequency;
    
    public PixelColor(int rgba[], String bitPattern, String hexa){
        this.rgba = rgba;
//        color = this.color;
        this.bitPattern = bitPattern;
        this.hexa = hexa;
        this.frequency = 0;
    }

    public int getFrequency() {
        return frequency;
    }
    
    public int[] getRgba() {
        return rgba;
    }

//    public String getColor() {
//        return color;
//    }

    public String getBitPattern() {
        return bitPattern;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

    public void setBitPattern(String bitPattern) {
        this.bitPattern = bitPattern;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }
    
    
}
