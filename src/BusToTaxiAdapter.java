class BusToTaxiAdapter implements ITaxi {
    private IBus bus;

    public BusToTaxiAdapter(IBus bus) {
        this.bus = bus;
    }

    @Override
    public void takeTaxi() {
        System.out.println("Переходим с автобуса на такси");
    }
}
