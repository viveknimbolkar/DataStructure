package Stack;

//Implementation of stack using array DS
public class Stack {

    static final int MAX = 100; //set the maxium size of stack
    int top; //index of top most element
    int stack[] = new int[MAX]; //declare an array of max size 100

    Stack(){
        int top = -1; //set the index of down most element -1
    }

    //add element to the stack
    boolean pushItem(int item){
        //first of all check if the stack is overflow or not
        if (isStackEmpty())
            return false; //if stack is empty
        else{
            stack[top++] = item; //add the item to the next position in an array
            System.out.println(item + " "+ " is added into the stack.");
            return true; //if item successfully pushed
        }

    }


    //remove item from the stack
    int popItem(){
       if (isStackEmpty())
           System.out.println("Stack is empty");
       else {
           int temp = stack[top--];
           System.out.println(stack[top] + " "+" is removed out from stack.");
           return stack[top];
       }
       return 0;
    }


    //check weather the stack is empty or not
    boolean isStackEmpty(){
        if (top < 0)
            return true; //if stack is empty
        return false; //if stack is not empty
    }


    //print the items of stack
//    public void printStackElements(){
//        for (int i= MAX-1; i < MAX; i--){
//            System.out.println(i+"  "+stack[i]);
//            if (i == 0)
//                break;
//        }
//    }

    //find the top most item
    public int findTopItem(){
        if (isStackEmpty())
            return 0;
        else
            return stack[top];
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.pushItem(10);
        st.pushItem(20);
        st.pushItem(30);
        st.pushItem(40);
        st.pushItem(50);
        st.pushItem(60);

        System.out.println(st.isStackEmpty());
    }
}
