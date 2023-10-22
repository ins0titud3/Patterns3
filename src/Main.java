public class Main {
    public static void main(String[] args) {
        IBus bus = new BusImpl();
        ITaxi taxi = new TaxiImpl();

        bus.takeBus();

        ITaxi busAdapter = new BusToTaxiAdapter(bus);
        busAdapter.takeTaxi();
    }
}