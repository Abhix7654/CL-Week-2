class Book {

    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
     
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        
    }

    public static void main(String[] args) {
        Book book1 = new Book("Abhi", "master", "9780061122415");
        Book book2 = new Book("the girl in room 507", " rahul", "9780060935467");

        Book.displayLibraryName();

     
if(book1 instanceof Book){
        book1.displayDetails();
}
if(book2 instanceof Book){
        book2.displayDetails();
}
    
}

}
