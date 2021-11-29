package Project;
import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * @author Hamza Akbar
 */
public class HuffmanCoding {
    Node root;
    PixelColor colors[];
    
    public HuffmanCoding(PixelColor colors[]){
        this.colors = colors;
        root = null;
    }
    
    public Node formHuffmanTree(){
        Node huffmanRoot = new Node(null);
        if(colors.length > 2){
            PixelColor[] secondaryColorsArr = createColorsArrDeepCopy(colors);
            PixelColor first = secondaryColorsArr[0];
            PixelColor second = secondaryColorsArr[1];
            while(huffmanRoot.left == null || huffmanRoot.right == null){
                
            }
        }
        return huffmanRoot;
    }
    
    public void quickSortByFrequency(PixelColor param[], int low, int high){ // Use QuickSort
        if(low < high){
            int partitionIndex = partition(low, high, param);
            quickSortByFrequency(param, low, partitionIndex - 1);
            quickSortByFrequency(param, partitionIndex + 1, high);
        }
    }
    
    public void swap(int index1, int index2, PixelColor param[]){
        if(index1 < param.length && index2 < param.length){
            PixelColor temp = param[index1];
            param[index1] = param[index2];
            param[index2] = temp;
        }
    }
    
    public int partition(int low, int high, PixelColor param[]){
        PixelColor pivot = param[low + ((high - low)/ 2)];
        swap(low + ((high - low)/ 2), high, param);
        int i = low - 1; int j = low;
        for(; j < high; j++){
            if(param[j].frequency > pivot.frequency){
                swap(++i, j, param);
            }
        }
        swap(++i, high, param);
        return i;
    }
    
    public PixelColor[] createColorsArrDeepCopy(PixelColor param[]){
        PixelColor[] secondaryColorsArr = new PixelColor[param.length];
        for(int i = 0; i < param.length; i++){
            secondaryColorsArr[i] = new PixelColor(param[i].getRgba(), param[i].getBitPattern(), param[i].getHexa());
        }
        return secondaryColorsArr;
    }
    
    public String toHexa(String num){
        String hexa = "0x";
        int power = 3;
        int sum = 0;
        int i = 0;
        for(; i < num.length() / 2; i++, power--){
            sum += ((int) Math.pow(2, power)) * Integer.parseInt(num.substring(i, i + 1));
        }
        if(sum < 10){
            hexa += sum;
        }
        else{
            if(sum == 10)
                hexa += "A";
            else if(sum == 11)
                hexa += "B";
            else if(sum == 11)
                hexa += "C";
            else if(sum == 11)
                hexa += "D";
            else if(sum == 11)
                hexa += "E";
            else
                hexa += "F";
        }
        sum = 0;
        power = 3;
        for(; i < num.length(); i++, power--){
            sum += ((int) Math.pow(2, power)) * Integer.parseInt(num.substring(i, i + 1));
        }
        if(sum < 10){
            hexa += sum;
        }
        else{
            if(sum == 10)
                hexa += "A";
            else if(sum == 11)
                hexa += "B";
            else if(sum == 12)
                hexa += "C";
            else if(sum == 13)
                hexa += "D";
            else if(sum == 14)
                hexa += "E";
            else if(sum == 15)
                hexa += "F";
        }
        return hexa;
    }
    
    public String toBinary(int num){
        String bits = "";
        for(; num > 0; num = num / 2){
            bits = num % 2 + bits;
        }
        for(int i = 8 - bits.length(); i > 0; i--){
            bits = "0" +  bits;
        }
        return bits;
    }
    
    public void getColorsFromImage(String imageFile){
        File file = new File(imageFile);
        try{
            FileWriter writer = new FileWriter("pixel_values.txt");
            BufferedImage img = ImageIO.read(file);
            for (int y = 0; y < img.getHeight(); y++) {
               for (int x = 0; x < img.getWidth(); x++) {
                  int pixel = img.getRGB(x,y);
                  Color color = new Color(pixel, true);
                  int red = color.getRed();
                  int green = color.getGreen();
                  int blue = color.getBlue();
                  
//                  System.out.println(color.getColorComponents(null));
//                  System.out.println("Red: " + red + ", Green: " + green + ", Blue: " + blue);
//                  writer.append(red+":");
//                  writer.append(green+":");
//                  writer.append(blue+"");
//                  writer.append("\n");
//                  writer.flush();
               }
            }
            writer.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
}
