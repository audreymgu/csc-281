package shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

// Pent
// Flatland's Department of Defense

/**
 * This class contains all the components to allow PolyWhirl to properly draw a pentagon around the X-Y position specified.
 *
 * @param x The x coordinate for the center of the shape.
 * @param y The y coordinate for the center of the shape.
 */

public class Pent extends BasicShape {

	public Pent(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		// cast the Graphics instance to the 2d version.
		Graphics2D g2d = (Graphics2D) g;

		/*Lists to hold the x and y coordinates of the Polygon.
		 */
		List<Integer> xPoints = new ArrayList<Integer>();
		List<Integer> yPoints = new ArrayList<Integer>();

		// Create the x coordinates of vertices of the Polygon
		xPoints.add(this.x);
		xPoints.add(this.x + (int)(30 * Math.cos(Math.toRadians(18))));
		xPoints.add(this.x + (int)(30 * Math.cos(Math.toRadians(-54))));
		xPoints.add(this.x + (int)(30 * Math.cos(Math.toRadians(-126))));
		xPoints.add(this.x + (int)(30 * Math.cos(Math.toRadians(162))));

		// Create the y coordinates of vertices of the Polygon
		yPoints.add(this.y + 30);
		yPoints.add(this.y + (int)(30 * Math.sin(Math.toRadians(18))));
		yPoints.add(this.y + (int)(30 * Math.sin(Math.toRadians(-54))));
		yPoints.add(this.y + (int)(30 * Math.sin(Math.toRadians(-126))));
		yPoints.add(this.y + (int)(30 * Math.sin(Math.toRadians(162))));

		/*
		 * Add each point to the Polygon p. Each x and y value in the lists index correspondent. This
		 * means that the ith point is made of up the ith index of xPoints and the ith index of yPoints.
		 * For example, the first point is at index 0 and can be made with xPoints.get(0) and
		 * yPoints.get(0).
		 */

		Polygon p = new Polygon();
		for (int i = 0; i < xPoints.size(); ++i) {
			p.addPoint(xPoints.get(i), yPoints.get(i));
		}

		/*
		 * Sets the outline or stroke properties for the class.
		 */
		// specify the color
		Color strokeColor = new Color(255, 0, 0, 220);
		// make the color the active one
		g2d.setColor(strokeColor);
		// set the stroke to have a width of 6.0f
		g2d.setStroke(new BasicStroke(6.0f));
		// draw the stroke outline of Polygon p
		g2d.draw(p);

		/*
		 * Sets the internal or fill color of the polygon.
		 */
		// create instance for for the fill color.
		Color fillColor = new Color(255, 0, 0, 220);
		// set the fill color to be the active color
		g2d.setColor(fillColor);
		// fill Polygon p with fillColor
		g2d.fill(p);
	}
}