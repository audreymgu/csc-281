package shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

// Tri
// Breath of the wild

/**
 * This class contains all the components to allow PolyWhirl to properly draw a roughly equilateral triangle around the X-Y position specified.
 *
 * @param x The x coordinate for the center of the shape.
 * @param y The y coordinate for the center of the shape.
 */

public class Tri extends BasicShape {
  
	public Tri(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		// Cast the Graphics instance to the 2D version.
		Graphics2D g2d = (Graphics2D) g;

		// Lists to hold the x and y coordinates of the Polygon.
		List<Integer> xPoints = new ArrayList<Integer>();
		List<Integer> yPoints = new ArrayList<Integer>();

		// Create the x coordinates of vertices of the Polygon
		xPoints.add(this.x);
		xPoints.add(this.x - (int)(55.0/2.0));
		xPoints.add(this.x + (int)(55.0/2.0));

		// Create the y coordinates of vertices of the Polygon
		yPoints.add(this.y + (int)((Math.sqrt(3.0)/3.0)*55.0));
		yPoints.add(this.y - (int)((Math.sqrt(3.0)/6.0)*55.0));
		yPoints.add(this.y - (int)((Math.sqrt(3.0)/6.0)*55.0));

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
		 * Set the outline or stroke properties for the class.
		 */
		
		// Specify the color
		Color strokeColor = new Color(0, 0, 255, 220);
		
		// Make the color the active one
		g2d.setColor(strokeColor);
		
		// Set the stroke to have a width of 6.0f
		g2d.setStroke(new BasicStroke(6.0f));
		
		// Draw the stroke outline of Polygon p
		g2d.draw(p);

		/*
		 * Sets the internal or fill color of the polygon.
		 */
		 
		// Create instance for for the fill color.
		Color fillColor = new Color(0, 0, 255, 220);
		
		// Set the fill color to be the active color
		g2d.setColor(fillColor);
		
		// Fill Polygon p with fillColor
		g2d.fill(p);
	}
}