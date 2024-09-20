package Fanfo;

import java.util.HashMap;

public class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost; // frequency
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        public Node(Character data, int cost, Node left, Node right) {
            this.data = data;
            this.cost = cost;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder)  {
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        HashMap<Character, Integer> fmap = new HashMap<>();
        for(char ch : feeder.toCharArray()){
            fmap.put(ch, fmap.getOrDefault(ch, 0)+1);

        }

        Heap<Node> minHeap = new Heap<>();

        for(var key : fmap.keySet()) {
            Node node = new Node(key, fmap.get(key));
            minHeap.insert(node);
        }

        while(minHeap.size() != 1) {
            Node least = minHeap.remove();
            Node secondLeast = minHeap.remove();
            Node newNode = new Node('\0', least.cost + secondLeast.cost, secondLeast, least);
            minHeap.insert(newNode);
        }
        Node ft = minHeap.remove();
        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node node, String osf) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }
        initEncoderDecoder(node.left, osf+"0");
        initEncoderDecoder(node.right, osf+"1");
    }

    public String encode(String source) {
        String ans = "";

        // Bitset can be used: like an array but with a bit at each index

        for(int i=0; i<source.length(); i++) {
            ans = ans + encoder.get(source.charAt(i));
        }

        return ans;
    }

    public String decode(String codedString) {
        String key = "";
        String ans = "";
        for(int i=0; i<codedString.length(); i++) {
            key = key + codedString.charAt(i);
            if(decoder.containsKey(key)) {
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
