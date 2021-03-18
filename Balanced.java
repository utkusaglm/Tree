import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Balanced {
    public static void main(String[] args) throws IOException {
        readFile readFile=new readFile();
        readFile.openFile();
        readFile.readFile();

        String x=readFile.inputStr;

        String[] str = x.trim().split(" ");

        String counterS = "outputBalanced.txt";

        FileWriter fileWriter = new FileWriter(counterS);


        PrintWriter printWriter = new PrintWriter(fileWriter);



        /* Constructed binary tree is
         */
        BinaryTree tree = new BinaryTree();

        tree.insert(str);

        System.out.println(tree.isBalanced(tree.root));

        printWriter.print(tree.isBalanced(tree.root));

        printWriter.close();

        readFile.closeFile();
    }
}
