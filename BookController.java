public class BookController {

    private Book     model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view  = view;
    }

    public void updateYear(int newYear) {
        if (newYear >= 1000 && newYear <= 2100) {
            model.setYear(newYear);
            view.displayMessage("Year updated.");
        } else {
            view.displayMessage("Invalid year.");
        }
    }

    public void showBook() {
        view.displayBook(model.getTitle(), model.getAuthor(), model.getYear());
    }
}
