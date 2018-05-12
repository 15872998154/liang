class Test{
    public static void main(String[] args) {
        Queue queue = new Queue();
        for(int i = 0; i < 21; i++ ) {
            queue.enqueue(i);
        }
        System.out.println(queue.getSize());
        System.out.println(queue.empty());
        for(int i = 0; i < queue.getSize(); i++) {
            System.out.println(queue.getElement()[i]);
        }
    }
}

class Queue {
    private int size;
    private int capacity = 8;
    private int[] element;
    public Queue() {
        this.size = 0;
        element = new int[capacity];
    }

    public void enqueue(int v){
        if (this.size < this.capacity){
            this.element[size] = v;
            this.size++;
        }
        else{
            this.capacity *= 2;
            int[] t = this.element;
            this.element = new int[capacity];
            for(int i =0;i<this.size;i++){
                this.element[i] = t[i];
            }
            this.element[this.size] = v;
            this.size++;
        }
        
    }

    public int dequeue(){
        this.element[size] = 0;
        for(int i = 0; i < size-1; i++){
            this.element[i] = this.element[i];
        }
        int t = size;
        this.size--;
        return this.element[t];
    }

    public boolean empty(){
        if (this.size == 0){
            return true;
        }
        return false;
    }

    public int getSize(){
        return this.size;
    }
    public int[] getElement(){
        return this.element;
    }

    //public int getSize
}