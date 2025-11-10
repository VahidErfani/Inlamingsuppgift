package Rectangle;

public class Rectangle2 {

    public int bredd;
    public int hojd;
    public boolean isSquare;

    public Rectangle2(int bredd, int hojd) {
        this.bredd = bredd;
        this.hojd = hojd;
    }

    public int calculateArea() {
        return this.hojd * this.bredd;
    }

    public int calculatePerimeter() {
        return 2 * (this.hojd + this.bredd);
    }

    public boolean isSquare() {
        return this.bredd == this.hojd;


    }
}
