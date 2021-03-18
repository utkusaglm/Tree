import java.io.*;
import java.util.ArrayList;

public class Path {
    public static void main(String[] args) throws IOException {


        readFile readFile=new readFile();
       readFile.openFile();
       readFile.readFile();

        String counterS = "outputPath.txt";

        FileWriter fileWriter = new FileWriter(counterS);


        PrintWriter printWriter = new PrintWriter(fileWriter);


        String x = readFile.inputStr;

        String[] str = x.trim().split(" ");

        String de=args[0];

        int sum = Integer.parseInt(de);

        /* Constructed binary tree is
         */
        BinaryTree tree = new BinaryTree();

        tree.insert(str);

        // System.out.println(tree.root.left.right.pos);
        System.out.println(tree.hasPathSum(tree.root, sum));



        ArrayList<Integer> a = BinaryTree.a;
        ArrayList<Integer> arrayListForPath = new ArrayList<>();

       for(String xy:str){
           if(xy.equals("-")){
               arrayListForPath.add(-9);

           }else{
               arrayListForPath.add(Integer.parseInt(xy));
           }


       }
       //T[0]+T[1]+T[3]+T[8]=22
        String stra="T[";
       for(int xy:a){
           stra+=xy;
           stra+="]+[";
        }

       stra+="="+sum;
       System.out.println(stra);

       printWriter.print(stra);




        printWriter.close();
        readFile.closeFile();
    }



}
