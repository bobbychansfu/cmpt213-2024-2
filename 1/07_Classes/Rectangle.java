
public class Rectangle {
    private double length;
    private double width;
    private static int totalRectangles = 0;
    
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
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
    
}
