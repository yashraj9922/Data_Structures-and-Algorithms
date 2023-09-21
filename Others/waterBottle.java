package Others;

// Leetcode: https://leetcode.com/problems/water-bottles/ --> 1518. Water Bottles

public class waterBottle {
    static int numWaterBottles(int numBottles, int numExchange) {
        int inum = numBottles;
        while (numBottles >= numExchange) {
            int rem = numBottles % numExchange;
            numBottles /= numExchange;
            inum = inum + numBottles;
            numBottles += rem;
        }
        return inum;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }
}