package templates;
import java.util.*;

public class DLLExample {
    public static void main(String[] args) {
      
        // [[2],[2],[2,6],[1],[1,5],[1,2],[1],[2]]
        int a = 0;
        LRUCache obj = new LRUCache(2);
       System.out.println(obj.get(1));
        obj.put(2, 6);
        System.out.println(obj.get(1));
      
        obj.put(1, 5);
       
       // System.out.println(obj.get(2));
      // obj.put(5, 5);
     obj.print();
        obj.put(1, 2);
         
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
    }
}

class DLLNode {
    int key;  int val;
    DLLNode next;
    DLLNode prev;
    DLLNode(){

    }
    DLLNode(int key, int val) {
         this.key = key;
         this.val = val; 
     }
}
class LRUCache {

    int capacity;
    Map<Integer, DLLNode> cache;
    DLLNode head;
    DLLNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new DLLNode(-1, -1);
        tail = new DLLNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLLNode node = cache.get(key);
        if(node == null) return -1;
        shift(cache.get(key));
        return node.val;
    }

    public void put(int key, int value) {
        DLLNode tmp;
        if (cache.containsKey(key)) {
            tmp = cache.get(key);
            tmp.val = value;
            cache.put(key, tmp);
            shift(tmp);

        } else {
            tmp = new DLLNode(key, value);
            cache.put(key, tmp);
            insert(tmp);
        }
         if(cache.size() > capacity) {
            cache.remove(tail.prev.key);
            remove(tail.prev);
        }
    }

    private void shift(DLLNode node) {
        remove(node);
        insert(node);
    }

    private void insert(DLLNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    private void remove(DLLNode node){
        DLLNode next = node.next;
        DLLNode prev = node.prev;
        prev.next = node.next;
        next.prev = node.prev;
    }
    public void print(){
        DLLNode tmp = head;
        while(tmp != tail){
            System.out.print("[" + tmp.key+"," + tmp.val + "]");
            System.out.println();
            tmp = tmp.next;
        }
    }
}
