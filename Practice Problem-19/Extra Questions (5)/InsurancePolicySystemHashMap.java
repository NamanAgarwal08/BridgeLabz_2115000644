import java.util.*;

class Policy {
    String policyholder;
    int expiryDays;

    Policy(String policyholder, int expiryDays) {
        this.policyholder = policyholder;
        this.expiryDays = expiryDays;
    }

    public String toString() {
        return policyholder + " " + expiryDays;
    }
}

public class InsurancePolicySystemHashMap {
    HashMap<String, Policy> hashMap = new HashMap<>();

    public void addPolicy(String policyNumber, Policy policy) {
        hashMap.put(policyNumber, policy);
    }

    public Policy getPolicy(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public ArrayList<Policy> getExpiringSoon() {
        ArrayList<Policy> result = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            Policy policy = hashMap.get(key);
            if (policy.expiryDays <= 30)
                result.add(policy);
        }
        return result;
    }

    public ArrayList<Policy> getPoliciesByHolder(String name) {
        ArrayList<Policy> result = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key).policyholder.equals(name))
                result.add(hashMap.get(key));
        }
        return result;
    }

    public void removeExpired() {
        ArrayList<String> toRemove = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key).expiryDays <= 0)
                toRemove.add(key);
        }
        for (String key : toRemove)
            hashMap.remove(key);
    }
}
