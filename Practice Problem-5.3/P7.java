public class P7 { //OTPGenerator
    public static void main(String[] args) {

        // array storing 10 otps 
        int otps[] = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOtp();
        }

        //checking uniqueness of otps
        if (isUnique(otps)) {
            System.out.println("All otps are unique.");
        } else {
            System.out.println("Otps are repeated");
        }


    }
    
    public static int generateOtp() {
        return (int) Math.random() * 899999 + 100000;
    }

    public static boolean isUnique(int otps[]) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
