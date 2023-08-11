package PS;

// Find the smallest letter greater than target in a sorted array => leeetcode 744
public class nextGreatestchar {
    public char nextGreatestCharacter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % (letters.length)];
    }

    public static void main(String[] args) {
        char[] letters = { 'a', 'b', 'd' };
        char target = 'c';
        nextGreatestchar obj = new nextGreatestchar();
        System.out.println(obj.nextGreatestCharacter(letters, target));
    }
}
