import java.io.File;
import java.util.Scanner;

public class readFile {


    Scanner scanner;
    private int height;
    private int width;
    private int numberOfObstacles;
    public static String inputStr="";


    public void openFile() {
        try {
            scanner = new Scanner(new File("input.txt"));

        } catch (Exception e) {

        }
    }

    public void readFile() {

        int count = 0;
        while (scanner.hasNext()) {

            String as = scanner.next();
            if(as==null){
                continue;
            }else{
                inputStr += as;
                inputStr+=" ";
            }



        }


    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getNumberOfObstacles() {
        return numberOfObstacles;
    }

    public void setNumberOfObstacles(int numberOfObstacles) {
        this.numberOfObstacles = numberOfObstacles;
    }

    public void closeFile() {

        scanner.close();
    }

}
