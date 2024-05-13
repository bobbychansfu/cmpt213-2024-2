package ca.cmpt213.rectangle;

public class Rectangle {
    private int length;
    private int width;
    private static int totalRectangles = 0;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public static int getTotalRectangles() {
        return totalRectangles;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        totalRectangles++;
    }

    public int area(){
        return this.length* this.width;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "\n Length: "+ this.length +
                "\n Width: " + this.width;
    }

    @Override
    public boolean equals(Object obj){
        Rectangle other = (Rectangle) obj;
        return this.area() == other.area();
    }
}

