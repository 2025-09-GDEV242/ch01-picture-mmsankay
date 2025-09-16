/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Marian Sankay
 * @version 2025.15.25
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person rain;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        rain = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-160);
            wall.moveVertical(40);
            wall.changeSize(130);
            wall.makeVisible();
            
            window.changeColor("Red");
            window.moveHorizontal(-180);
            window.moveVertical(60);
            window.changeSize(60);
            window.makeVisible();
    
            roof.changeSize(80, 200);
            roof.moveHorizontal(40);
            roof.moveVertical(-80);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(200);
            sun.moveVertical(-60);
            sun.changeSize(90);
            sun.makeVisible();
            
            rain.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
