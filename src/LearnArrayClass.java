import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String args[]) {
      int[] number = {1, 2, 3, 4, 5};
      int index = Arrays.binarySearch(number, 2);
      System.out.println(index);  
      Arrays.sort(number);
      Arrays.fill(number, 12);

      for (int i : number) {
        System.out.println(i + "") ;
      }
    }
}
