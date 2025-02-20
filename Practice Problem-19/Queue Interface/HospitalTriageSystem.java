import java.util.*;

class HospitalTriageSystem {

    static class Patient {

        String name;
        int severity;

        Patient(String name, int severity) {

            this.name = name;
            this.severity = severity;

        }

        public void display() {
            System.out.println("Patient name is : " + this.name);
            System.out.println("Patient severity is : " + this.severity);

        }

    }

    PriorityQueue<Patient> pq;

    HospitalTriageSystem() {

        pq = new PriorityQueue<>(new Comparator<Patient>() {
            public int compare(Patient p1, Patient p2) {
                return p1.severity - p2.severity;
            }
        });

    }

    public void add(Patient p) {

        pq.add(p);

    }

    public void simulate() {

        System.out.println("Order in which the patients will be treated is : ");

        Stack<Patient> st = new Stack<>();

        while (!pq.isEmpty()) {

            Patient p = pq.poll();
            System.out.println(p.name);
            st.push(p);
        }
        while (!st.isEmpty()) {

            Patient p = st.pop();
            pq.add(p);
        }

    }

    public static void main(String[] args) {

        Patient p1 = new Patient("ABC", 1);
        Patient p2 = new Patient("DEF", 2);
        Patient p3 = new Patient("GHI", 3);

        HospitalTriageSystem hs = new HospitalTriageSystem();

        hs.add(p1);
        hs.add(p2);
        hs.add(p3);

        hs.simulate();

    }
}
