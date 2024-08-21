package Misc;

public class Main {
    public static void main(String[] args) {
        KarpRabin obj = new KarpRabin();
        String needle = "baby2";
        String haystack ="thisisnot enough i need more baby";
        obj.search(haystack, needle);
    }
}

