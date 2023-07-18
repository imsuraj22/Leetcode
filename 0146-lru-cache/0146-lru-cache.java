class Node
{
    int key,val;
    Node prev,next;
    Node(int key,int val){
        this.key=key;
        this.val=val;

    }
}

class LRUCache {

    int capacity=0;
    HashMap<Integer,Node> map=new HashMap<>();
    Node head=new Node(0, 0);
    Node tail=new Node(0, 0);
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node curr=map.get(key);
            int res=curr.val;
            remove(curr);
            insert(curr);
            return res;
        } else return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    void insert(Node node){
        map.put(node.key,node);
        Node temp=head.next;
        head.next=node;
        node.prev=head;
        temp.prev=node;
        node.next=temp;
    }

    void remove(Node node){
         map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */