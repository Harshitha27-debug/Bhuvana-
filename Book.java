class Book{
// beginning of the class book
public String Title;
private String author;
public int yearOfPublication;
// beginning of constructor
Book(String Title , String author , int yearOfPublication){
this.Title = Title;
this.author = author;
this.yearOfPublication = yearOfPublication;
}
//constructor ends here
// methos display starts here 
public void display(){
System.out.println("Title of the book is : " + Title + "The name of the author is : " + author + "The year of publication is : " + yearOfPublication );
}
// method display ends here
// creating objects 
public static void main(String[] args){
Book Book1 = new Book("Harry Potter" , "J.K.Rowling" ,1993);
Book Book2 = new Book("Someone Like You" , "Nikitha Singh" , 2010);
Book1.display();
Book2.display();
}
}
// class ends here 
