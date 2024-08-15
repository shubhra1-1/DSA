class ListNode {
    int key, value;
    ListNode prev, next;
    
    ListNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
class LRUCache {

    ListNode head= new ListNode(0,0), tail= new ListNode(0,0);
    HashMap<Integer,ListNode> mpp= new HashMap<>();
    int capi;


    public LRUCache(int capacity) {
        this.capi=capacity;
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        if(mpp.containsKey(key)){
            ListNode node= mpp.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        } 
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            remove(mpp.get(key));
        }
        if(mpp.size()==capi){
            remove(tail.prev);
        }
        insert(new ListNode(key,value));
        
    }
    private void remove(ListNode node){
        mpp.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void insert(ListNode node){
        mpp.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */