public class Main {
    public static void main(String[] args) {
        //Part1
        //creating object of class Movie
        Movie movie1 = new Movie();
        //variable movie2 equals object movie1
        Movie movie2 = movie1;
        //changing the object property
        movie1.rating = 7.8;
        //checking if movie2.rating will be equals movie1.rating
        System.out.println(movie2.rating);
        //Part 2
        //creating object of class Book
        Book book1 = new Book();
        //changing the object property
        book1.genre = "drama";
        //passing the object into a method as an argument.
        Book.changeValue(book1);
        //checking if book.genre will be "horror"
        System.out.println(book1.genre);
    }
}