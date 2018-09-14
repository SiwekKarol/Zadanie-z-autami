public class Main {

    public static void main(String[] args) {
        TimeCalculator timeCalc = new TimeCalculator();
        int h = timeCalc.daysToHours(3);
        System.out.println(h);

        int m = timeCalc.hourseToMinutes(45);
        System.out.println(m);

        int s = timeCalc.minutesToSeconds(20);
        System.out.println(s);

    }
}
