import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\work");
        File[] files = file.listFiles();
        System.out.println(files.length);
       
    }

}