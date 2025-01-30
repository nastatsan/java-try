import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Software Solutions", "John Lewis", 857, 1997);
        Book book2 = new Book("Mysterious", "Fabio", 348, 1998);
        Book book3 = new Book("The Pillars of the Earth", "Ken Follett", 806, 1989);
        Book book4 = new Book("Altered Carbon", "Richard K. Morgan", 416, 2002);
        Book book5 = new Book("Amatka", "Karin Tidbeck", 223, 2012);
        Book book6 = new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", 464, 1993);
        Book book7 = new Book("The Innovator's Dilemma", "Clayton M. Christensen", 288, 1997);
        Book book8 = new Book("Literature and language arts", "Holt Mcdougal", 308, 2010);
        Book book9 = new Book("English Mercury Reader", "Kathleen T. McWhorter", 266, 2014);
        Book book10 = new Book("Wolves of the Calla", "Stephen King", 714, 2003);
        Book book11 = new Book("Selamat Tinggal", "Tere Liye", 360, 2020);

        List<Book> booksList1 = new ArrayList<>();
        booksList1.add(book1);
        booksList1.add(book3);
        booksList1.add(book5);
        booksList1.add(book7);
        booksList1.add(book9);

        List<Book> booksList2 = new ArrayList<>();
        booksList2.add(book2);
        booksList2.add(book4);
        booksList2.add(book6);
        booksList2.add(book8);
        booksList2.add(book10);

        List<Book> booksList3 = new ArrayList<>();
        booksList3.add(book2);
        booksList3.add(book5);
        booksList3.add(book8);
        booksList3.add(book10);
        booksList3.add(book11);

        Student student1 = new Student("John", 1, 23, booksList1);
        Student student2 = new Student("Tom", 2, 21, booksList2);
        Student student3 = new Student("Kate", 3, 22, booksList3);

        List<Student> studentList = List.of(student1, student2, student3);
        var result = studentList.stream()
                .peek(student -> System.out.println(student.toString()))
                .map(Student::getBooks)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findAny();
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("такой книги нет");
        }
    }
}