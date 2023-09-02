public class Main {
    public static void main(String[] args) {
        var person = new Person(1, "Rajashekar", "Hyd" , "9876543210");
        System.out.println(person);

        System.out.println(person.id());
        System.out.println(person.name());
        System.out.println(person.address());
        System.out.println(person.phone());

        System.out.println("________________________________");
        var person1 = new Person("abc","delhi");
        System.out.println(person1);

        System.out.println("________________________________");
        person.justTest();
        person.displayName();

        System.out.println("________________________________");
        System.out.println(person1.id());
        System.out.println(person1.name());
        System.out.println(person1.address());
        System.out.println(person1.phone());

    }
}