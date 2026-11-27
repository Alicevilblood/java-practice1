package homework3;

public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.pageCount = pageCount;
        this.title = title;
    }

    void addPages(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = this.pageCount + pageCount;
        } else {
            throw new IllegalArgumentException("Некорректное число страниц: " + pageCount);
        }
    }

    void printInfo() {
        System.out.println("Книга: " + title + ", количество страниц - " + pageCount);
    }
}
