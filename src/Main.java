public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Author сhekhov = new Author("Антон", "Чехов");
        Book chamberNumberSix = new Book(сhekhov, "Палата №6 ", 1891);
        Book deadSouls = new Book(gogol,"Мертвые души", 1842);
        chamberNumberSix.setPublishingYear(1892);
        System.out.println(chamberNumberSix);
        System.out.println(deadSouls);







    }

}