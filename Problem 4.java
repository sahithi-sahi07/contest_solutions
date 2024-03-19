 class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    

    public void push(int x) {
        q.add(x);
        
        int n = q.size();
        while (n-- > 1)
            q.add(q.poll());
    }

    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }


    public boolean empty() {
        return q.isEmpty();
    }

  }
