public class Main {

    public static void main(String[] args) {
        Person ivan = new Person().withFirstName("Ivan").withLastName("Ivanov");

        Frog frog1 = new Frog().withColor("green").withName("Frog1");
        System.out.println(new Frog("Frog1", "yellow").equals(frog1));
        System.out.println(new Frog().toString());
    }
}
