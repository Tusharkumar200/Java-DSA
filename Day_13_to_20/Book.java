public class Book{
  int totalNoOfBook;
  String title;
  String author;
  boolean isbn;

  {
    totalNoOfBook =0;
  }
  {
    totalNoOfBook++;
  }

  Book(boolean isbn,String title , String author){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
  }

  Book(String isbn){
    this(isbn,title 'Unknown', author 'Unknown');
  }
   void borrowBook(){
    if(isBorrowed){
      System.out.println("Book is alrady borrowed");
    }
    else{
      this.isBorrowed = true;
      System.out.println("Enjoy the book");
    }
  }
  
   void returnBook(){
      if(isBorrowed){
        this.isBorrowed = false;
        System.out.println("Hope you enjoyed . Please leave a review ");
      }
      else{
        System.out.println("this book is already in library ");
      }
  }
  static int getTotalNoOfBooks(){

    return TotalNoOfBooks;
  }

  public static void main(String[] args) {
    Book designOfThings = new Book("1","Design","Author");
    Book myBook = new Book("2");
    System.out.println(Book.getTotalNoOfBooks());
    designOfThings.borrowBook();
    myBook.borrowBook();
    designOfThings.borrowBook();
    designOfThings.returnBook();
    designOfThings.returnBook();
  }

}