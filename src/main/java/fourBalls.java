import processing.core.PApplet;
public class fourBalls extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int w=0,x=0,y=0,z=0;
    public static void main(String[] args) {
        PApplet.main( "fourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(w,HEIGHT/5,DIAMETER,DIAMETER);
        w++;
        ellipse(x,2*HEIGHT/5,DIAMETER,DIAMETER);
        x+=2;
        ellipse(y,3*HEIGHT/5,DIAMETER,DIAMETER);
        y+=3;
        ellipse(z,4*HEIGHT/5,DIAMETER,DIAMETER);
        z+=4;
    }

}
