package predefined;

public class Stack {
    static final int MAX = 100; //set the maxium size of stack
    int top; //index of top most element
    char[] stack = new char[MAX]; //declare an array of max size 100
//    int[] stack = new int[MAX];
    public Stack(){
        int top = -1; //set the index of down most element -1
    }

    //add element to the stack
    public boolean push(char item){
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
    public int pop(){
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
    public boolean isEmpty(){
        return (top < 0);
    }


    //find the top most item
    public int peek(){
        if (top < 0){

            return 0;
        }
        else{
            int x = stack[top];
            return x;
        }
    }
}
