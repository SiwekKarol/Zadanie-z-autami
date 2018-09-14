public class TimeCalculator {
    int daysToHours(int days){
        int hourse = days * 24;
        return hourse;
    }

    int hourseToMinutes(int hourse) {
        int minutes = hourse * 60;
        return minutes;
    }

    int minutesToSeconds(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }
}
