public class main {
    public static void main(String[] args) {
        welcome();
    }

    static void welcome() {
        String welcomeMessage = """
                I love animals!
                Let's check on the animals...
                The deer looks fine.
                The bat looks happy.
                The lion looks healthy.
                """;

        System.out.print(welcomeMessage);
    }
}