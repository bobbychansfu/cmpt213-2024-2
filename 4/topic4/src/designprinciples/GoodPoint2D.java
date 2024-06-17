package designprinciples;// BAD interface!

import java.awt.geom.Point2D;

/**
 * Represent a point in 2D space.
 */
interface GoodPoint2D {
	void setLocation(int x, int y);
	void setHeight(int height);
	int getX();
	int getYValue();
	double getDistanceTo(int y, int x);
	void drawStarAtPoint();
	void drawCircleAtPoint(int radius);
	double computeTriangle(Point2D p1, Point2D p2);

}
