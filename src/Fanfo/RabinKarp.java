package Fanfo;



public class RabinKarp {
    // Constants
    private static final int PRIME = 101; // Base for the polynomial rolling hash
    private static final long MOD = 1000000007; // A large prime modulus to prevent overflow

    /**
     * Precomputes the highest power of PRIME needed for the rolling hash.
     *
     * @param patternLength Length of the pattern string
     * @return PRIME^(patternLength - 1) mod MOD
     */
    private long precomputeHighestPower(int patternLength) {
        long highestPower = 1;
        for (int i = 1; i < patternLength; i++) {
            highestPower = (highestPower * PRIME) % MOD;
        }
        return highestPower;
    }

    /**
     * Calculates the initial hash of a string using a polynomial rolling hash function.
     *
     * @param str          The string to hash
     * @param patternLength The length of the pattern (used for limiting the substring)
     * @return The computed hash value
     */
    private long calculateHash(String str, int patternLength) {
        long hash = 0;
        for (int i = 0; i < patternLength; i++) {
            hash = (hash * PRIME + str.charAt(i)) % MOD;
        }
        return hash;
    }

    /**
     * Updates the hash by removing the outgoing character and adding the incoming character.
     *
     * @param prevHash       The previous hash value
     * @param outgoingChar   The character exiting the window
     * @param incomingChar   The character entering the window
     * @param highestPower   PRIME^(patternLength-1) mod MOD
     * @param patternLength  Length of the pattern
     * @return The updated hash value
     */
    private long updateHash(long prevHash, char outgoingChar, char incomingChar, long highestPower, int patternLength) {
        // Remove the outgoing character
        long newHash = (prevHash - outgoingChar * highestPower) % MOD;
        if (newHash < 0) {
            newHash += MOD;
        }

        // Multiply by PRIME and add the incoming character
        newHash = (newHash * PRIME + incomingChar) % MOD;

        return newHash;
    }

    /**
     * Searches for all occurrences of the pattern in the given text using the Rabin-Karp algorithm.
     *
     * @param text    The text to search within
     * @param pattern The pattern to search for
     */
    public void search(String text, String pattern) {
        if (pattern.length() == 0) {
            System.out.println("Empty pattern provided.");
            return;
        }

        if (text.length() < pattern.length()) {
            System.out.println("Pattern length is greater than text length. No match possible.");
            return;
        }

        int patternLength = pattern.length();
        int textLength = text.length();

        long patternHash = calculateHash(pattern, patternLength);
        long textHash = calculateHash(text.substring(0, patternLength), patternLength);

        long highestPower = precomputeHighestPower(patternLength);

        for (int i = 0; i <= textLength - patternLength; i++) {
            // If hash values match, check the actual substring to confirm
            if (textHash == patternHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Update the hash for the next window
            if (i < textLength - patternLength) {
                char outgoingChar = text.charAt(i);
                char incomingChar = text.charAt(i + patternLength);
                textHash = updateHash(textHash, outgoingChar, incomingChar, highestPower, patternLength);
            }
        }
    }

    // Optional: Main method for demonstration purposes
    public static void main(String[] args) {
        RabinKarp rk = new RabinKarp();
        String text = "ababcabcababc";
        String pattern = "abc";
        rk.search(text, pattern);

//        RabinKarp rk = new RabinKarp();
//        String text = "The quick brown fox jumps over the lazy dog. The quick brown fox is quick.";
//        String pattern = "quick brown fox";
//
//        rk.search(text, pattern);
    }
}
