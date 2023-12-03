import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) throws IOException {
//        String name = null;
//        Object object = new String("123");
//        File file = (File) object;
//        String number = "123gf";
//        int result = Integer.parseInt(number);
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());
//        int number = 1;
//        try {
//            number = 10 / 0;
//            String test = null;
//            System.out.println(test.length());
//        } catch (ArithmeticException e) {
//            System.out.println("AriphEx");
//        } catch (NullPointerException e) {
//            System.out.println("nullpointerEx");
//        } catch (Exception e){
//            System.out.println("Exception");
//        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("name");
            fileReader.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch Exc" + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (fileReader != null){
                fileReader.close();
            }
        }
        System.out.println("finally stop");

    }
}
