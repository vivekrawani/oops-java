package templates;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashMop {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            st.add(i);
        }
        for( var it : st){
            System.out.println(it);
            if(it % 2 == 0) st.remove(it);
        }
    }
}
