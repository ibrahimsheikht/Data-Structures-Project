package Project;

/**
 * @author Hamza
 */
public class Main {

    public static void main(String[] args) {
        Test obj = new Test();
//        int [] testArr = {10,9,8,7,6,5,4,3,3,2,1,0};
//        for(int i = 0; i < 11; i++){
//            testArr[i] = i;
//        }
//        System.out.print("Before sorting: ");
//        obj.print(testArr);
//        System.out.print("After sorting:  ");
//        obj.quickSortByFrequency(testArr, 0, testArr.length - 1);
//        obj.print(testArr);
//        System.out.println();
//        
//        obj.getColorsFromImage("img.png");
        System.out.println(obj.toBinary(13));
        System.out.println(obj.toHexa(obj.toBinary(13)));
    }
    
    
}
