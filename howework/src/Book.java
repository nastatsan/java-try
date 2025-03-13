public class Book {
    public String title;
    public String author;
    public int pages;
    public int year;

    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n\tBook title: " + title + "; author: " + author + "; pages: " + pages + "; year: " + year;
    }

}
