import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;
    int pos = 0;

    public void insert(String[] str) {

        Queue<Node> q = new LinkedList<>();

        Node current = new Node(Integer.parseInt(str[0]));

        current.setPos(pos);
        root = current;


        q.add(current);

        int n = str.length;

        int i = 1;

        while (i < n) {

            pos++;
            Node temp = q.remove();

            if (!str[i].equals("-")) {
                temp.setLeft(new Node(Integer.parseInt(str[i])));
                temp.getLeft().setPos(pos);
               ;
                q.add(temp.getLeft());

            }
            i++;
            pos++;
            if (!str[i].equals("-")) {
                temp.setRight(new Node(Integer.parseInt(str[i])));
                temp.getRight().setPos(pos);

                q.add(temp.getRight());
            }
            i++;

        }
    }

    int x=0;
   static ArrayList<Integer>a=new ArrayList<>();
    public boolean hasPathSum(Node node, int sum) throws NullPointerException {
       // System.out.println(sum);
        try {
           // System.out.println(node.pos);
            if(sum>=0){
                a.add(node.getPos());
            }
        } catch (NullPointerException e) {
           // System.out.println("null");
        }

        if (node == null)
            return sum == 0;
        return hasPathSum(node.getLeft(), sum - node.getData())
                || hasPathSum(node.getRight(), sum - node.getData());
    }


    public boolean isBalanced(Node node) {

        int lh;

        int rh;

        if (node == null)

            return true;

        lh = height(node.getLeft());

        rh = height(node.getRight());

        if (Math.abs(lh - rh) <= 1

                && isBalanced(node.getLeft())

                && isBalanced(node.getRight()))

            return true;

        return false;

    }

    public int height(Node node) {


        if (node == null)

            return 0;

        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));

    }



}