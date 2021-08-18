// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class QueueUsingStack {

    /** Initialize your data structure here. */
    Stack st1;
    Stack st2;
    private int front;
    public QueueUsingStack() {

        st1 = new Stack();
        st2 = new Stack();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        if(st1.isEmpty()){

            front = x;
        }

        while(!st1.isEmpty()){

            st2.push(st1.pop());
        }

        st2.push(x);

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        int pop = (int)st1.pop();
        return pop;
    }

    /** Get the front element. */
    public int peek() {

        return (int)st1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

        if(st1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */