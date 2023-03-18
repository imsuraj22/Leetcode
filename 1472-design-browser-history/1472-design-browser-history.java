class BrowserHistory {

   class Node{
        String url;
        Node prev,next;
        Node (String url){
            this.url=url;
            prev=null;
            next=null;
        }
    }
    Node head,curr;

    public BrowserHistory(String homepage) {
        head=new Node(homepage);
        curr=head;
    }
    
    public void visit(String url) {
        Node node=new Node(url);
        curr.next=node;
        node.prev=curr;
        curr=node;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps>0){
            curr=curr.prev;
            steps--;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while(curr.next!=null && steps>0){
            curr=curr.next;
            steps--;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */