public class Main {
    public static void main(String[] args) {
        Author haioMiadzaki = new Author("Хаяо", "Миядзаки");
        Book stranaChudes = new Book("Страна чудес без тормозов", 1987, haioMiadzaki);

        stranaChudes.setPublicationYear(1990);

        System.out.println(haioMiadzaki);
        System.out.println(stranaChudes);


    }
}