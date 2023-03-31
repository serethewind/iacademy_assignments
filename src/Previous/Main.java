package Previous;

public class Main {
    public static void main(String[] args) {
        Account noahAccount = new Account();
        Account chidinmaAccount = new Account();
        Account ridohAccount = new Account();


        System.out.println("Diplaying default values");
        noahAccount.displayMessage();


        chidinmaAccount.setAccountName("Chidinma Afogu");
        chidinmaAccount.setAccountNumber("0011223344");
        chidinmaAccount.setAccountBalance(50000);
        chidinmaAccount.setEmail("afogu@gmail.com");
        chidinmaAccount.setGender("Female");
        chidinmaAccount.setStatus(true);
        chidinmaAccount.setHouseNumber(82);

        chidinmaAccount.displayMessage();

        Shape circleObject = new Shape();
        circleObject.setRadius(54.44);
    }
}