public class VotingEligibility {

    // Method to check if a person is eligible to vote
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        // Sample ages to test
        int[] ages = {16, 18, 20, 25, 30};

        // Check each age and print whether the person is eligible to vote
        for (int age : ages) {
            if (isEligibleToVote(age)) {
                System.out.println("Age " + age + ": Eligible to vote.");
            } else {
                System.out.println("Age " + age + ": Not eligible to vote.");
            }
        }
    }
}
