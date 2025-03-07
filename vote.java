class VoteException extends Exception {
    public VoteException(String message) {
        super(message);
    }
}

class Vote {
    public static void main(String[] args) {
        int age = 18;

        try {
            if (age < 18) {
                throw new VoteException("You are not eligible to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (VoteException e) {
            System.out.println(e.getMessage());
        }
    }
}
