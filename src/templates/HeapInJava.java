package templates;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
class Pair {int first, second; Pair(int first, int second) {this.first = first;this.second = second;}
public String toString(){
    return this.first + " : " + this.second;
}}
class HeapInJava
{
    
    public static void main(String[] args) {
        
    
  Comparator<Pair> p = (a,b)->(a.first-b.first);
       
  PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)-> (a.first - b.first));
  pq.add(new Pair(1, 2));
  pq.add(new Pair(4, 2));
  Iterator<Pair> itr = pq.iterator();
  while (itr.hasNext()) {
    System.out.println(itr.next().first);
  }
  int k = 8;
  while(k-->0) {
    System.out.println(k);
  }

       /*
       	PriorityQueue<Integer> pq = new PriorityQueue<>(10);
		
		// Add elements to the queue
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(4);
		
		// Print the queue
		System.out.println("Priority queue: " + pq);
		
		// Peek at the top element of the queue
		System.out.println("Peek: " + pq.peek());
		
		// Remove the top element of the queue
		pq.poll();
		
		// Print the queue again
		System.out.println("Priority queue after removing top element: " + pq);
		
		// Check if the queue contains a specific element
		System.out.println("Does the queue contain 3? " + pq.contains(3));
		
		// Get the size of the queue
		System.out.println("Size of queue: " + pq.size());
		
		// Remove all elements from the queue
		pq.clear();
		
		// Check if the queue is empty
		System.out.println("Is the queue empty? " + pq.isEmpty());
        */
    Set<Pair> st = new HashSet<>();
	// Map<Pair
	// st.add(new Pair(1, 3));
	// System.out.println(st);
    }
}