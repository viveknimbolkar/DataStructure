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
       if (top >= (MAX - 1)){
           System.out.println("Stack overflow");
           return false;
       }else {
           stack[++top] = item;
           System.out.println(item+" is added into stack");
           return true;
       }

    }


    //remove item from the stack
    int popItem(){
       if (top < 0){
           System.out.println("Stack is empty");
           return 0;
       }
       else {
           int temp = stack[top--];
           System.out.println(stack[top] + " "+" is removed out from stack.");
           return temp;
       }
    }


    //check weather the stack is empty or not
    boolean isStackEmpty(){
            return (top < 0);
    }


    //find the top most item
    public int findTopItem(){
        if (top < 0){

            return 0;
        }
        else{
            int x = stack[top];
            return x;
        }
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
        System.out.println(st.findTopItem());
    }
}
