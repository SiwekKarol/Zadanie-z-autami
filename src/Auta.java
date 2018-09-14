class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2 = new Car("Opel, ","Vectra, ", 2004, 1.8);;
        System.out.println("Samochód 1:");
        System.out.println("Marka: " + car1.carBrand + ", model: " + car1.carModel +
                ", rocznik: " + car1.carYear + ", pojemność: " + car1.carCapacity);
        System.out.println("Samochód 2:");
        System.out.println("Marka: " + car2.carBrand + ", model: " + car2.carModel +
                ", rocznik: " + car2.carYear + ", pojemność: " + car2.carCapacity);
    }
}
