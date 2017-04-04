/**
 * Homework 2 - PolyWhirl
 * 
 * Due: Monday, April 3rd at 11:59pm. Follow the standard homework submission guidelines.
 * 
 * Grading: 70 points for correct completion of all tasks and 30 points for style, creativity, and
 * following instructions. Up to 10 points can be recovered if you successfully complete the bonus.
 * 
 * Tasks:
 * 
 * -Read in shape specifications that consist of 3 numbers: number of sides of the shape, the left
 * coordinate of the center in pixels, and the right coordinate of the center in pixels. There will
 * be one shape per line of input text via standard input.
 * 
 * -Make a list per shape to store instances of that shape.
 * 
 * -Read through each shape specification from the input and add a new instance of that shape to the
 * appropriate shape list. For example, the input of 3 100 100 would result in code like the
 * following in the readAndGenerateShapes method of the Surface class: this.tris.add(new Tri(100,
 * 100));
 * 
 * -Create a set of classes that extend BasicShape with the following number of sides: Tri - 3
 * sided, Quad - 4 sided, Pent - 5 sided, and Hex - 6 sided. Note that these shapes do not need to
 * be regular; each shape can have sides of non-uniform length (e.g. both squares and rectangles are
 * valid Quads.
 * 
 * -Pick a fill and stroke color for each class. Let your inner graphic designer or color theorist
 * shine through!
 * 
 * -Each shape should be ~50 pixels wide (i.e. all of the points should be roughly 25 pixels from
 * the center of the shape).
 * 
 * -Document the classes and methods you create.
 * 
 * -Document the functions that are declared after comments that contain TODO: document.
 * 
 * Bonus: Create an additional class that inherits BasicShape that can draw a regular shape with any
 * number of sides.
 */


import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

import javax.swing.JFrame;
import javax.swing.JPanel;

import shapes.*;

public class PolyWhirl extends JFrame {

  public static final int WINDOW_WIDTH = 720;
  public static final int WINDOW_HEIGHT = 640;

  private Surface surface;

  public PolyWhirl() {
    initUI();
  }

  /**
   * Initializes the graphics window (a JFrame) and adds the drawing surface (a JPanel).
   */
  
  private void initUI() {
    this.surface = new Surface();
    setTitle("PolyWhirl");
    // set the resolution of the window to be glorious 720p
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(this.surface);
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        PolyWhirl polyWhirl = new PolyWhirl();
        polyWhirl.surface.readAndGenerateShapes();
        polyWhirl.setVisible(true);
      }
    });
  }

  /**
   * The Surface class inherits JPanel and acts as a drawing surface. It is the core of this program
   * and does the following:
   * 
   * 1. Reads input, creates appropriate instances of shapes, and adds them to the correct list via
   * the readAndGenerateShapes method.
   * 
   * 2. Manages the lists of shapes and is responsible for rendering them via the drawShapes method.
   * 
   * You are responsible for editing and adding capabilities to this class for the assignment.
   */
  
  class Surface extends JPanel {

    List<Crystal> crystals;
    List<Tri> triangles;
    List<Quad> quadrilaterals;
    List<Pent> pentagons;
    List<Hex> hexagons;

    public Surface() {
      crystals = new ArrayList<Crystal>();
      triangles = new ArrayList<Tri>();
      quadrilaterals = new ArrayList<Quad>();
      pentagons = new ArrayList<Pent>();
      hexagons = new ArrayList<Hex>();
    }

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.drawShapes(g);
      this.readAndGenerateShapes();
    }
     
    // readAndGenerateShapes
    
    /**
     * This method translates user input into shape drawing requests. It splits and formats the input
     * and uses conditional logic to add the information to the proper shape list.
     */
    
    public void readAndGenerateShapes() {
      Scanner stdin = new Scanner(System.in);
      while(stdin.hasNextLine()) {
        String line = stdin.nextLine();
        String[] strSpec = line.split("\\s+");
        int[] intSpec = new int[3];
        for(int i = 0; i < strSpec.length; i++) {
          int num = Integer.parseInt(strSpec[i]);
          intSpec[i] = num;  
        }
        if (intSpec[0] == 3) {
          this.triangles.add(new Tri(intSpec[1], intSpec[2]));
        } else if (intSpec[0] == 4) {
          this.quadrilaterals.add(new Quad(intSpec[1], intSpec[2]));
        } else if (intSpec[0] == 5) {
          this.pentagons.add(new Pent(intSpec[1], intSpec[2]));
        } else if (intSpec[0] == 6) {
          this.hexagons.add(new Hex(intSpec[1], intSpec[2]));
        }
      }
      stdin.close();
    }

    // drawShapes
    
    /**
     * This method uses Java's Graphics2D library to draw all requested graphical elements
     * atop a background set to the size of the display window. It does so by
     * drawing objects according to the specifications enumerated in the program's shape lists.
     */
    
    public void drawShapes(Graphics g) {
      // draw background
      // GradientPaint gradient;
      ((Graphics2D) g).setColor(java.awt.Color.WHITE);
      ((Graphics2D) g).fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

      for (Crystal c : this.crystals) {
        c.draw(g);
      }
      for (Tri t : this.triangles) {
        t.draw(g);
      }
      for (Quad q : this.quadrilaterals) {
        q.draw(g);
      }
      for (Pent p : this.pentagons) {
        p.draw(g);
      }
      for (Hex h : this.hexagons) {
        h.draw(g);
      }

    }
  }
}

