public class Main {
    public static void main(String[] args) {
        Book chamberNumberSix = new Book("А.П. Чехов ", "Палата №6 ", 1891);
        chamberNumberSix.setPublishingYear(1892);
        Book deadSouls = new Book("Н.В. Гоголь", "Мертвые души", 1842);

        Author сhekhov = new Author("А.П. Чехов ", 44);
        Author gogol = new Author("Н.В. Гоголь", 42);

        // выведу в консоль для себя, для более простой проверки выведу после обьявления обьектов
        System.out.println("Автор книги : " + chamberNumberSix.getAuthorName() + "\n" +
                "Произведение : " + chamberNumberSix.getBookName() + "\n" +
                "Дата публикации : " + chamberNumberSix.getPublishingYear() + "г.\n");
        System.out.println("Автор книги : " + deadSouls.getAuthorName() + "\n" +
                "Произведение : " + deadSouls.getBookName() + "\n" +
                "Дата публикации : " + deadSouls.getPublishingYear() + "г.\n");

        System.out.println("Писатель\nФ.И.О. : " + сhekhov.getName() + "\n" +
                "Возраст : " + сhekhov.getAge() + " года\n");
        System.out.println("Писатель\nФ.И.О. : " + gogol.getName() + "\n" +
                "Возраст : " + gogol.getAge() + " года\n");
    }

}