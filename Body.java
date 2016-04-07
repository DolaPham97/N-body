package nbody;

import edu.princeton.cs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;

/******************************************************************************
 *  Compilation:  javac Body.java
 *  Execution:    java Body
 *  Dependencies: Vector.java StdDraw.java
 *
 *  Implementation of a 2D Body with a position, velocity and mass.
 *
 *
 ******************************************************************************/

public class Body {
    private Vector r;      // position
    private Vector v;      // velocity
    private final double mass;   // mass
    private final Color color;
    private double radius;
    private final double rad;
    private final ArrayList<double[]> trail = new ArrayList<>();
    private double tlength;
    private double td;
   // private String title;
    /**
     *
     * @param r
     * @param v
     * @param mass
     * @param rad
     * @param radius
     * @param tlength
     * @param td
     * @param c
     */
    public Body(Vector r, Vector v, double mass,double rad,double radius,double tlength, double td, Color c) {
        this.r = r;
        this.v = v;
        this.rad = rad;
        this.mass = mass;
        this.color = c;
        this.tlength = tlength;
        this.td = td;
        this.radius = radius;
               
    } // Body( Vector, Vector, double )

    Body(Vector r, Vector v, double mass, Color c, double rad, double radius, double tlength, double td) {
        this.r = r;
        this.v = v;
        this.rad = rad;
        this.mass = mass;
        this.color = c;
        this.tlength = tlength;
        this.td = td;
        this.radius = radius;
    }

   

    /**
     *
     * @param f
     * @param dt
     */
    public void move(Vector f, double dt) {
        Vector a = f.times(1/mass);
        v = v.plus(a.times(dt));
        r = r.plus(v.times(dt));
        this.Tail(r);
        
    } // move( Vector, double )
    
    /**
     *
     * @param r
     */
    public void Tail(Vector r){
        double[] ap = {r.cartesian (0), r.cartesian (1)};
        trail.add(0,ap);
        if(trail.size() > tlength){
            trail.remove(trail.size() -1);
            
        }
    }
  
    /**
     * makes the ball bounce
     * @param frame size of screen
     */
    public void rebelion (double frame){
        double xp = r.cartesian(0);
        double xy = r.cartesian(1);
        if (xp >= frame&&v.cartesian(0)>0){
            v.xrebelion();
        }
        if(xy >= frame&&v.cartesian(1)>0){
            v.yrebelion();
        }
        if(xp <= -frame&&v.cartesian(0)<0){
            v.xrebelion();
        }
        if(xy <= -frame&&v.cartesian(1)<0){
            v.yrebelion();
        }
    }

    /**
     *
     * @param b
     * @return the force between 2 bodies
     */
    public Vector forceFrom(Body b) {
        Body a = this;
        double G = 6.67e-11;
        Vector delta = b.r.minus(a.r);
        double dist = delta.magnitude();
        double F = (G * a.mass * b.mass) / (dist * dist);
        return delta.direction().times(F);
    } // forceFrom( Body )
    
    /**
     *
     */
    public void drawtrail(){
        double nr = rad;
        for(int i = 0; i < trail.size() -1; i++){
            if (i%2 == 0){
                nr = nr * td;
            }
            double[]first = trail.get(i);
            double[] second = trail.get(i+1);
            StdDraw.setPenRadius(nr);
            StdDraw.line(first[0], first[1],second[0], second[1]);
        }
    }
            
    /**
     *
     */
    public void draw() {
        StdDraw.setPenRadius(0.025);
        StdDraw.setPenColor(this.color);
        StdDraw.point(r.cartesian(0), r.cartesian(1));
        this.drawtrail();
    } // draw()

    // this method is only needed if you want to change the size of the bodies

    /**
     *
     * @param penRadius
     */
    public void draw(double penRadius) {
        StdDraw.setPenRadius(penRadius);
        StdDraw.point(r.cartesian(0), r.cartesian(1));
    } // draw( double )

} // Body