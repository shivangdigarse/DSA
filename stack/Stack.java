package stack;

class Stack{
    int top = -1;
    int[] st = new int[10];

    void push(int value){
        if(top == st.length-1){
            System.out.println("Overflow");
        }
        else{
            top += 1;
            st[top] = value;
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Underflow");
        }
        else{
            top -= 1;
        }
    }

    void peek(){
        if(top == -1){
            System.out.println("stack.Stack is empty");
        }
        else{
            System.out.println("Top element is: "+st[top]);
        }
    }

    void size(){
        System.out.println("Size of the stack is: "+ (top+1));
    }

}
