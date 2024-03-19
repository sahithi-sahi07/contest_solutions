import java.util.Queue;
import java.util.LinkedList;

class RecentCounter {
    private Queue<Integer> requestQueue;
    public RecentCounter() {
        requestQueue = new LinkedList<>();
    }
    public int ping(int t) {
        while (!requestQueue.isEmpty() && requestQueue.peek() < t - 3000) {
            requestQueue.poll();
        }
        requestQueue.offer(t);
        return requestQueue.size();
    }
}
