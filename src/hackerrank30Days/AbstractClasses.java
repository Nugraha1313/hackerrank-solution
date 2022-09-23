package hackerrank30Days;
/*
 * @created 22/06/2022 on 3:38
 * @project Hackerrank
 * @author Nugraha1313
 */

import java.util.Scanner;

abstract class Book {
    private String title, author;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void display();

}

class MyBook extends Book {

    public MyBook(String title, String author, int price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    @Override
    public void display() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPrice: " + getPrice());
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();
        scan.close();
        MyBook book1 = new MyBook(title, author, price);
        book1.display();
    }
}
