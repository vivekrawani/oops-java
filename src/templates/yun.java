package templates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

class yun {
    public static void main(String[] args) {
       // Act a2 = new Act();
        ArrayList<Act> al = new ArrayList<>();

        al.add(new Act(2,5));
        al.add(new Act(1,7));
        al.add(new Act(4,-3));
        al.add(new Act(4,105));
        al.add(new Act(62,56));
        al.add(new Act(24,55));
        PriorityQueue<Act> pq =  new PriorityQueue<>();
        
        // pq.add(new Act(2,5));
        // pq.add(new Act(1,7));
        // pq.add(new Act(4,-3));
        // pq.add(new Act(4,105));
        // pq.add(new Act(62,56));
        // pq.add(new Act(24,55));
        
      

        System.out.println(al.toString());

        Collections.sort(al);

        System.out.println(al.toString());

      
        // equals boolean
        //toStirng String
    }
}
