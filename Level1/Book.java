// Class Definition
public class Book{

 // Fields (Attributes)
private String title;
private String author;
private int price;

  // Constructor
public Book(String title,String author,int price){
this.title=title;
this.author=author;
this.price=price;

}

//Method to display book details
public void displayBookDetails(){

System.out.println("Book Title is "+title+" it's Author is "+author+" and price is "+price);
}

}

// Main Class to Test
public class Main{
public static void main(String[] args){

  // Create Book objects
Book book=new Book("ASK","Abhi",3573);
Book book1=new Book("HFH","Jajs",56);



 // Display Book details
book.displayBookDetails();
book1.displayBookDetails();

}
}


