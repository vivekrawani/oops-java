package templates;

import java.util.Iterator;
import java.util.PriorityQueue;

class Complex {
    int age;
    String name;

    public Complex(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>((b, a)-> a.compareTo(b));

        pq.add("Ramesh");
        pq.add("For");
        pq.add("Geeks");
        pq.add("Suresh");
        pq.add("Gukesh");
        pq.add("Vivek");
        pq.add("Caraxes");
        pq.add("Vhagar");

//        Iterator iterator = pq.iterator();

        while (!pq.isEmpty())
            System.out.print(pq.poll() + " ");
        System.out.println();
        PriorityQueue<Integer> pqi = new PriorityQueue<>((a, b)-> b-a);
        pqi.add(6);
        pqi.add(16);
        pqi.add(3);
        pqi.add(-1);
        pqi.add(1);


        while (!pqi.isEmpty())
            System.out.print(pqi.poll() + " ");

        System.out.println();
//Integer ad = 2;
//Integer bd = 7;
//        System.out.println("compare " + ad.compareTo(bd));
//a.compareTo(7);
        PriorityQueue<Complex> pqc = new PriorityQueue<>((a, b)->{
            if(a.age != b.age) {
                return a.age -b.age;
            }else {
                return a.name.compareTo(b.name);
            }
        });
        pqc.add(new Complex("aegon1", 10));
        pqc.add(new Complex("rhaena", 10));

        pqc.add(new Complex("jace", 14));
        pqc.add(new Complex("aegon", 21));

        pqc.add(new Complex("aemond", 17));



        while (!pqc.isEmpty())
            System.out.println(pqc.poll());

    }
}
