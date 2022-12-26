public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В.", 6554, "ФННХ", "04.06.1991", "+79658748");
        readers[1] = new Reader("Иванов А.Н.", 54, "ФТП", "03.07.1992", "+79965563123");
        readers[2] = new Reader("Волков Н.И.", 172, "ФУП", "23.12.19994", "+79663225593");

        Book dictionary = new Book("Словарь", "Ожегов С.И.");
        Book adveture = new Book("Приключения", "Марк Твен");
        Book novel = new Book("Война и Мир", "Толстой Л.Н.");

        readers[0].takeBook(4);
        readers[1].takeBook("Фэнтези", "Детектив", "Научпоп");
        readers[1].takeBook(dictionary, adveture, novel);
        readers[2].returnBook(9);
        readers[0].returnBook(adveture, dictionary);
        readers[1].returnBook("Органическая химия", "Физика");
    }
}