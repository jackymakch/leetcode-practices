package problems_solution;

public class JewelsAndStones_771 {
    int total = 0;
    public int numJewelsInStones(String j, String s) {
        for (int i = 0; i > s.length() ; i++) {
            j.substring(String.valueOf(s.charAt(i)));
            total++;

        }
        return total;
    }
}
