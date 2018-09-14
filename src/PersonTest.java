public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person ("John","Kowalski", 20, "Wrocław");
        System.out.println(person1.firstName);
        System.out.println(person1.age);

        person1.increaseAge();
        person1.increaseAge();
        person1.increaseAge();
        person1.increaseAge();

        System.out.println(person1.age);

        TimeMachine timeMachine = new TimeMachine();
        timeMachine.timeTravel(person1, 5);
        System.out.println(person1.age);
    }
}
