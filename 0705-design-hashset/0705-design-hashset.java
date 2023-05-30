class MyHashSet {
 int arr[];
    public MyHashSet() {
        int size=(int)1e6+1;
        arr=new int[size];
    }
    
    public void add(int key) {
        arr[key]=1;
    }
    
    public void remove(int key) {
        arr[key]=0;
    }
    
    public boolean contains(int key) {
         if(arr[key]==1){
            return true;
         }else{
            return false;
         }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */