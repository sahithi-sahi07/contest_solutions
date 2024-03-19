import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();

        for (int value : students) {
            studentQueue.add(value);
        }

        int sandwichIndex = 0;
        int unableToEat = 0;
        while (!studentQueue.isEmpty() && unableToEat < studentQueue.size()) {
            if (sandwiches[sandwichIndex] == studentQueue.peek()) {
                unableToEat = 0;

                ++sandwichIndex;
                studentQueue.poll();
            } else {
                ++unableToEat;

                studentQueue.add(studentQueue.poll());
            }
        }

        return unableToEat;
    }
}
