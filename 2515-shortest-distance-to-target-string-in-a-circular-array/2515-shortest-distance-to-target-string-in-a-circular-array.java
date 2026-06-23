class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int leftdis = -1;
        int rightdis = -1;

        int count = 0;
        int i = startIndex;

        do {
            if (words[i].equals(target)) {
                rightdis = count;
                break;
            }
            count++;
            i = (i + 1) % words.length;
        } while (i != startIndex);

        count = 0;
        i = startIndex;

        do {
            if (words[i].equals(target)) {
                leftdis = count;
                break;
            }
            count++;
            i = (i - 1 + words.length) % words.length;
        } while (i != startIndex);

        if (leftdis == -1 && rightdis == -1)
            return -1;
        if (leftdis == -1)
            return rightdis;
        if (rightdis == -1)
            return leftdis;

        return Math.min(leftdis, rightdis);
    }
}