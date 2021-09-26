public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 200;
        int oneMile = 20;
        int mileTotal = service.calculate (ticketPrice);
        System.out.println(mileTotal);
    }
}
