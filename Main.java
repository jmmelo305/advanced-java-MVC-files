public class Main {
    public static void main(String[] args) {

        Book           book       = new Book("Clean Code", "Robert C. Martin", 2008);
        BookView       bookView   = new BookView();
        BookController controller = new BookController(book, bookView);

        controller.showBook();

        controller.updateYear(2020);
        controller.showBook();

        controller.updateYear(3000);
    }
}
