public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person().withId(123).withAge(20).withName("Tasha");
        System.out.println(p1);

        Person p2 = new Person().withId(456).withAge(53.6).withName("Dima");
        System.out.println(p2);

        Person p3 = new Person().withId(765).withAge(53.4).withName("Ira");
        System.out.println(p3);

        Person p4 = new Person().withId(0000).withAge(5.6).withName("Greg");
        System.out.println(p4);

        Person p5 = new Person().withId(1468).withAge(65.8).withName("Misha");
        System.out.println(p5);
    }

}
