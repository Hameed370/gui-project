public class Books {
    private int bkid,pgno,price;
    private String bkname, isbn,author;

    public Books(int bkid, int pgno, int price, String bkname, String isbn, String author) {
        this.bkid = bkid;
        this.pgno = pgno;
        this.price = price;
        this.bkname = bkname;
        this.isbn = isbn;
        this.author = author;
    }

    public Books() {
    }

    public int getBkid() {
        return bkid;
    }

    public void setBkid(int bkid) {
        this.bkid = bkid;
    }

    public int getPgno() {
        return pgno;
    }

    public void setPgno(int pgno) {
        this.pgno = pgno;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" + "bkid=" + bkid + ", pgno=" + pgno + ", price=" + price + ", bkname=" + bkname + ", isbn=" + isbn + ", author=" + author + '}';
    }
    
    
    
}
