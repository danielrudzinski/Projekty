package education;

public class Library {
    private String name;
    private String location;
    private int books;

    public Library(String name, String location, int books) {
       if(name==null||name.isEmpty()){
           name="Biblioteka Miejska";

       }
       if(location==null||location.isEmpty()){
           name="ul. Wiedzy 123, 00-001 Miasteczko";
        }
       if(books<0){
           books=1000;
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }
}
