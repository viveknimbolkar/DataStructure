package stack;
//https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1/
import java.util.Stack;
public class RemoveMiddleElement {

    void deleteMid(Stack<Integer> s,int sizeOfStack){
        int mid = s.size()/2;
        System.out.println("mid:"+mid);
        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < mid+1; i++) {
            temp.push(s.pop());
        }

        temp.pop();
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
        System.out.println("temp:"+temp+"\n"+"s:"+s);
    }

    public static void main(String[] args) {
        RemoveMiddleElement remove = new RemoveMiddleElement();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        remove.deleteMid(s,s.size());
        System.out.println(s);
    }
}
