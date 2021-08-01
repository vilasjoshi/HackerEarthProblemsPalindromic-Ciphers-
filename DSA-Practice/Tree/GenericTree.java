
import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    ArrayList<Node> children;
    Node(int val){
        this.data = val;
        this.children = new ArrayList<>();
    }
  }
    public static Node construct(int [] arr){
        Node root = new Node(arr[0]);
        
        Stack<Node> s = new Stack<>();
        s.push(root);
        
        for(int i= 1; i< arr.length; i++ ){
            if(arr[i] == -1){
                s.pop();
            }else{
                Node temp = new Node(arr[i]);
                s.peek().children.add(temp);
                s.push(temp);
            }
        }
        
        return root;
        
    }
    public static void display(Node node){
        
        if(node == null) return;
        System.out.print(node.data + " -> ");
        for(int i= 0; i < node.children.size() ;i++)
        {
            System.out.print(node.children.get(i).data + " ");
           
        }
         System.out.println();
        
        for(int i= 0; i < node.children.size() ;i++)
        {
         display(node.children.get(i));
          
        }
         
        // System.out.println();
        
        
    }

  public static void main(String[] args) throws Exception {
        
        int [] inp = {10, 20 , 50, -1, 60, -1, -1, 30, 70, -1, 80, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        
        Node root = construct(inp);
        display(root);
        
  }
}
