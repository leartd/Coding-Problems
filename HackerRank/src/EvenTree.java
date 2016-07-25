

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.M;

/**
 * Created by Leart Doko on 7/21/2016.
 */
public class EvenTree {
    public static void main(String[] args) {
        BigInteger a = new BigInteger(""+2);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int vertices = in.nextInt();
        int edges = in.nextInt();
        //for ease of use, the first node is null.
        Node[] nodes = new Node[vertices+1];

        for(int i = 0; i < edges; i++){
            int childNode = in.nextInt();
            int parentNode = in.nextInt();
            if(nodes[childNode] == null){
                nodes[childNode] = new Node(childNode);
            }
            if(nodes[parentNode] == null){
                nodes[parentNode] = new Node(parentNode);
            }
            nodes[parentNode].addChild(nodes[childNode]);
        }

        int count = 0;
        for(int i = 1; i < nodes.length; i++){
            if(nodes[i].treeSize > 2){
                for(Node child: nodes[i].children){
                    if((child.treeSize%2==0) && (child.treeSize >=2)){
                        nodes[i].treeSize -= child.treeSize;
                        child.parent = null;
//                        nodes[i].children.remove(child);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }

    static class Node {
        public int data;
        public Node parent;
        public List<Node> children;
        public int treeSize;

        public Node(int value){
            data = value;
            parent = null;
            children = new ArrayList<Node>();
            treeSize = 1;
        }

        public void addChild(Node child){
            children.add(child);
            treeSize += child.treeSize;
            child.parent = this;

            //update ancestors
            Node ancestor = this.parent;
            while(ancestor != null){
                ancestor.treeSize++;
                ancestor = ancestor.parent;
            }
        }
    }
}