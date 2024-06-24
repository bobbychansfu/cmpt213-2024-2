package designprinciples;// BAD interface!

import java.awt.geom.Point2D;

/**
 * Represent a point in 2D space.
 */
interface GoodPoint2D {
	void setLocation(int x, int y);
	void setY(); // void setHeight(int height); // clarity
	void setX(); // completeness
	int getX();
	int getY(); // int getYValue(); - consistent
	double getDistanceTo(int x, int y); // double getDistanceTo(int y, int x); // consistent
	void drawStarAtPoint();
	void drawCircleAtPoint(int radius);
	// double computeTriangle(Point2D p1, Point2D p2); // Cohesion

}
