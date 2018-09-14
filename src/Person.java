public class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    Person(String fn, String ln, int a, String c){
        firstName = fn;
        lastName = ln;
        age = a;
        city = c;
    }

    void increaseAge(){
        age--;
    }

    void showInfo(){
        System.out.println(age);
        System.out.println(city);
        System.out.println(firstName);
        System.out.println(lastName);
    }


}
