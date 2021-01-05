import java.util.Random;

public class ArrayExample {
    public String[] createRandom() {
        Random rd = new Random();
        String [] arr = new String[10];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 10; i++) {
            arr[i] = ""+(char) (rd.nextInt(10) + 97)+(char) (rd.nextInt(10) + 97)+(char) (rd.nextInt(10) + 97);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
