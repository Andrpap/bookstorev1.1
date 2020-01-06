/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author andpa
 */
@Entity(name="Book")
@Table(name="book")
@NamedQueries({
    @NamedQuery(name = "Book.deleteById", query = "DELETE FROM Book b WHERE b.sku =:number"),
    @NamedQuery(name = "Book.findLikeTitle", query = "SELECT b FROM book b WHERE b.titlee LIKE :name")
})
public class Book implements Serializable {

    @Id
    @Column(name="sku")
    private int sku;
    @Column(name="isbn")
    private int isbn;
    @Column(name="barcode")
    private int barcode;
    @Column(name="title")
    private String title;
    @Column(name="book_description")
    private String book_description;
    @Column(name="publication_date")
    private LocalDate publication_date;
    @Column(name="available_quantity")
    private int available_quantity;
    @Column(name="book_language")
    private String book_language;
    @Column(name="cover_page")
    private String cover_page;
    @Column(name="image")
    private byte[] image;
    @Column(name="book_price")
    private double book_price;
    @Column(name="book_price_with_discount")
    private double book_price_with_discount;
    @Column(name="publisher")
    private String publisher;
    @Column(name="pages")
    private int pages;
    @Column(name="dimensions")
    private String dimensions;
    @Column(name="weight")
    private double weight;
    @JoinColumn(name="author_id",referencedColumnName = "author_id")
    @ManyToOne(optional = false,fetch=FetchType.LAZY) 
    private Author author_id;
    
    @JoinColumn(name="book_category_id",referencedColumnName = "book_category_id")
    private BookCategory book_category_id;

    public Book() {
    }

    public Book(int sku, int isbn, int barcode, String title, String book_description, LocalDate publication_date, int available_quantity, String book_language, String cover_page, byte[] image, double book_price, double book_price_with_discount, String publisher, int pages, String dimensions, double weight, Author author_id, BookCategory book_category_id) {
        this.sku = sku;
        this.isbn = isbn;
        this.barcode = barcode;
        this.title = title;
        this.book_description = book_description;
        this.publication_date = publication_date;
        this.available_quantity = available_quantity;
        this.book_language = book_language;
        this.cover_page = cover_page;
        this.image = image;
        this.book_price = book_price;
        this.book_price_with_discount = book_price_with_discount;
        this.publisher = publisher;
        this.pages = pages;
        this.dimensions = dimensions;
        this.weight = weight;
        this.author_id = author_id;
        this.book_category_id = book_category_id;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBook_description() {
        return book_description;
    }

    public void setBook_description(String book_description) {
        this.book_description = book_description;
    }

    public LocalDate getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(LocalDate publication_date) {
        this.publication_date = publication_date;
    }

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }

    public String getBook_language() {
        return book_language;
    }

    public void setBook_language(String book_language) {
        this.book_language = book_language;
    }

    public String getCover_page() {
        return cover_page;
    }

    public void setCover_page(String cover_page) {
        this.cover_page = cover_page;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public double getBook_price_with_discount() {
        return book_price_with_discount;
    }

    public void setBook_price_with_discount(double book_price_with_discount) {
        this.book_price_with_discount = book_price_with_discount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Author getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Author author_id) {
        this.author_id = author_id;
    }

    public BookCategory getBook_category_id() {
        return book_category_id;
    }

    public void setBook_category_id(BookCategory book_category_id) {
        this.book_category_id = book_category_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.sku;
        hash = 83 * hash + this.isbn;
        hash = 83 * hash + this.barcode;
        hash = 83 * hash + Objects.hashCode(this.title);
        hash = 83 * hash + Objects.hashCode(this.book_description);
        hash = 83 * hash + Objects.hashCode(this.publication_date);
        hash = 83 * hash + this.available_quantity;
        hash = 83 * hash + Objects.hashCode(this.book_language);
        hash = 83 * hash + Objects.hashCode(this.cover_page);
        hash = 83 * hash + Arrays.hashCode(this.image);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.book_price) ^ (Double.doubleToLongBits(this.book_price) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.book_price_with_discount) ^ (Double.doubleToLongBits(this.book_price_with_discount) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.publisher);
        hash = 83 * hash + this.pages;
        hash = 83 * hash + Objects.hashCode(this.dimensions);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.author_id);
        hash = 83 * hash + Objects.hashCode(this.book_category_id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.sku != other.sku) {
            return false;
        }
        if (this.isbn != other.isbn) {
            return false;
        }
        if (this.barcode != other.barcode) {
            return false;
        }
        if (this.available_quantity != other.available_quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.book_price) != Double.doubleToLongBits(other.book_price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.book_price_with_discount) != Double.doubleToLongBits(other.book_price_with_discount)) {
            return false;
        }
        if (this.pages != other.pages) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.book_description, other.book_description)) {
            return false;
        }
        if (!Objects.equals(this.book_language, other.book_language)) {
            return false;
        }
        if (!Objects.equals(this.cover_page, other.cover_page)) {
            return false;
        }
        if (!Objects.equals(this.publisher, other.publisher)) {
            return false;
        }
        if (!Objects.equals(this.dimensions, other.dimensions)) {
            return false;
        }
        if (!Objects.equals(this.publication_date, other.publication_date)) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.author_id, other.author_id)) {
            return false;
        }
        if (!Objects.equals(this.book_category_id, other.book_category_id)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Book{" + "sku=" + sku + ", isbn=" + isbn + ", barcode=" + barcode + ", title=" + title + ", book_description=" + book_description + ", publication_date=" + publication_date + ", available_quantity=" + available_quantity + ", book_language=" + book_language + ", cover_page=" + cover_page + ", image=" + image + ", book_price=" + book_price + ", book_price_with_discount=" + book_price_with_discount + ", publisher=" + publisher + ", pages=" + pages + ", dimensions=" + dimensions + ", weight=" + weight + ", author_id=" + author_id + ", book_category_id=" + book_category_id + '}';
    }

 
    
    
    
}
