package pl.szkolenia.comarch;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setSex(Sex.MEN);

        User user2 = new User();
        user2.setSex(Sex.WOMEN);

        User user3 = new User();
        user2.setSex(Sex.OTHER);

        Console mojaKonsola = Console.PS5;
        System.out.println(mojaKonsola.getBrand());
        System.out.println(mojaKonsola.getPrice());

        String a = new String("ABC");
        String b = new String("ABC");

        Console console1 = Console.PS5;
        Console console2 = Console.PS5;

        console1.setPrice(10.00);

        System.out.println(console1.getPrice());
        System.out.println(console2.getPrice());
    }
}
