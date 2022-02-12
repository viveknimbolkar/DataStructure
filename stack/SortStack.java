package stack;
import java.util.Collections;
import java.util.Stack;
public class SortStack {

    void sort(Stack<Integer> st){
        if (!st.isEmpty()){
            int temp = st.pop();
            sort(st);
            sortedInsert(st,temp);
        }
    }

    void sortedInsert(Stack<Integer> st, int data){
        if(st.isEmpty() || data > st.peek()){
            st.push(data);
        }else {
            int temp = st.pop();
            sortedInsert(st,data);
            st.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        SortStack sort = new SortStack();
        st.push(45);
        st.push(123);
        st.push(5);
        st.push(4);
        st.push(878);
        st.push(60);
        st.push(81);
        sort.sort(st);
        System.out.println(st);
    }
}
