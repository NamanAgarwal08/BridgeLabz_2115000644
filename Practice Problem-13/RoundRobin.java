import java.util.Scanner;

class Process {
    int id, burstTime, remainingTime;
    Process next;

    public Process(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class CircularLinkedList {
    private Process head = null, tail = null;

    // Add a new process at the end
    public void addProcess(int id, int burstTime) {
        Process newProcess = new Process(id, burstTime);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head; // Circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head; // Maintain circular link
        }
    }

    // Remove a process by ID
    public void removeProcess(int id) {
        if (head == null)
            return;

        Process curr = head, prev = null;

        // Find the process to delete
        do {
            if (curr.id == id) {
                if (curr == head && curr == tail) { // Only one process
                    head = tail = null;
                } else {
                    if (curr == head)
                        head = head.next;
                    if (curr == tail)
                        tail = prev;
                    if (prev != null)
                        prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Display the process queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        Process temp = head;
        System.out.print("Processes in queue: ");
        do {
            System.out.print("[P" + temp.id + " | Remaining: " + temp.remainingTime + "ms] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Simulate Round Robin Scheduling
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null)
            return;

        int totalProcesses = 0;
        Process temp = head;
        do {
            totalProcesses++;
            temp = temp.next;
        } while (temp != head);

        int[] waitingTime = new int[totalProcesses];
        int[] turnaroundTime = new int[totalProcesses];
        int currentTime = 0;

        while (!isEmpty()) {
            temp = head;
            do {
                if (temp.remainingTime > 0) {
                    int executeTime = Math.min(timeQuantum, temp.remainingTime);
                    temp.remainingTime -= executeTime;
                    currentTime += executeTime;

                    if (temp.remainingTime == 0) {
                        turnaroundTime[temp.id - 1] = currentTime;
                        removeProcess(temp.id);
                    }
                }
                displayProcesses();
                temp = temp.next;
            } while (temp != head && !isEmpty());
        }

        // Calculate Waiting Time
        for (int i = 0; i < totalProcesses; i++) {
            waitingTime[i] = turnaroundTime[i] - (i + 1) * timeQuantum;
        }

        // Display Average Waiting & Turnaround Time
        int totalWaitingTime = 0, totalTurnaroundTime = 0;
        for (int i = 0; i < totalProcesses; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnaroundTime += turnaroundTime[i];
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / totalProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / totalProcesses);
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList processQueue = new CircularLinkedList();

        System.out.print("Enter the time quantum: ");
        int timeQuantum = scanner.nextInt();

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter burst time for Process " + i + ": ");
            int burstTime = scanner.nextInt();
            processQueue.addProcess(i, burstTime);
        }

        System.out.println("\nStarting Round Robin Scheduling...");
        processQueue.roundRobinScheduling(timeQuantum);

        scanner.close();
    }
}
