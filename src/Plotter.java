public class Plotter {

    public static < P > void printArray( P[] array){
        for (P block : array){
            System.out.printf("%s ", block);
        }
        System.out.println();
    }

    public static void main(String[] aravi){
        Integer[] iArray = {1,2,3,4,5};
        String[] sArray = {"Hello", "my", "friends", "Goodbye"};
        Double[] dArray = {1.0, 2.0 ,3.0,4.0,5.0};
        Character[] cArray = {'k','i','t','t','y'};
        System.out.println("Integer Array");
        printArray(iArray);
        System.out.println("String Array");
        printArray(sArray);
        System.out.println("Double Array");
        printArray(dArray);
        System.out.println("Char Array");
        printArray(cArray);
    }

}
