import java.util.Arrays;

public class Sort {

    private static <S extends Comparable<S>> Object[] organize(S[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i].compareTo(array[j]) > 0){
                    S element = array[i];
                    array[i] = array[j];
                    array[j] = element;
                }
            }
        }
        return array;
    }

    public static void main(String[] aravi){
        Integer[] intArray = {5,4,6,8,7,9};
        String[] strArray = {"Omega", "Phi", "Zeta", "Gamma"};
        Character[] charArray = {'Z','A','L','U'};
        System.out.println(Arrays.toString(organize(intArray)));
        System.out.println(Arrays.toString(organize(strArray)));
        System.out.println(Arrays.toString(organize(charArray)));
    }

}
