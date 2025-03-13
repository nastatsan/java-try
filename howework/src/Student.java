import java.util.List;

public class Student {
    private String name;
    private int id;
    private int age;
    List<Book> books;
//    private final Map<String, String> metadata;

    public Student(String name, int id, int age, List<Book> books) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.books = books;

//        Map<String, String> tempMap = new HashMap<>();
//
//        for (Map.Entry<String, String> entry :
//                metadata.entrySet()) {
//            tempMap.put(entry.getKey(), entry.getValue());
//        }
//
//        this.metadata = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
    }

//    public Map<String, String> getMetadata() {
//
//        Map<String, String> tempMap = new HashMap<>();
//
//        tempMap.putAll(this.metadata);
//        return tempMap;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Student name: " + name + ";\n\t id: " + id + "; age: " + age + ";\n\t books: ");
        for (Book book : books) {
            result.append(book.toString());
        }
        return result.toString();
    }
}
