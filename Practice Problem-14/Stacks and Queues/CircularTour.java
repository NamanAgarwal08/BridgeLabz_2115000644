import java.util.*;

public class CircularTour {
    
    static class Node {
        int petrol;
        int distance;

        Node(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartPoint(int petrolPump[] , int distanceCoverage[]) {

        Queue<Integer> q = new LinkedList<>();
        int len = petrolPump.length;
        for (int i = 0; i < len; i++) {
            q.add(i);
        }

        int dis = 0;
        boolean b = true;
        while (!q.isEmpty()) {
            b = true;
            int idx = q.poll();
            int copy = idx;
            for (int i = 0; i < len; i++) {
                dis += petrolPump[idx % len];
                int nextIdx = (idx + 1) % len;
                if (dis < distanceCoverage[nextIdx]) {
                    b = false;
                    break;
                }
                idx++;
            }
            if (b) {
                return copy;
            }
        }
        return -1;

    }
}
