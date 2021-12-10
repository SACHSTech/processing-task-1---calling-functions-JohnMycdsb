import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(51, 204, 255);
    }

    public void draw() {

        strokeWeight(4);
        stroke(0, 0, 0);
        fill(117, 73, 41);
        triangle(200, 100, 375, 240, 25, 240);

        strokeWeight(3);
        fill(222, 158, 113);
        rect(25, 240, 350, 380);

        strokeWeight(2);
        fill(60, 189, 222);
        rect(60, 250, 75, 75);

        strokeWeight(2);
        fill(117, 73, 41);
        rect(150, 275, 100, 275);

        fill(247, 237, 40);
        ellipse(15, 50, 75, 90);

        fill(102, 255, 102);
        rect(0, 380, 400, 300);


    }
}