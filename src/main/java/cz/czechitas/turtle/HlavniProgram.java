package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void nakresliCtverec(double velikostStrany, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++){
            zofka.move(velikostStrany);
            zofka.turnRight(90);
        }
    }

    public void nakresliTrojuhelnik(double velikostStrany, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++){
            zofka.move(velikostStrany);
            zofka.turnRight(120);
        }
    }

    public void nakresliObdelnik(double stranaA, double stranaB, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++){
            zofka.move(stranaA);
            zofka.turnRight(90);
            zofka.move(stranaB);
            zofka.turnRight(90);
        }
    }

    public void nakresliKruh(double uhelZakriveni, double delkaZakriveni, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 360/uhelZakriveni; i++){
            zofka.move(delkaZakriveni);
            zofka.turnLeft(uhelZakriveni);
        }
    }

    public void nakresliRovnoramennyTrojuhelnik(double velikostStrany, Color barva){
        zofka.setPenColor(barva);

        zofka.turnRight(45);
        zofka.move(velikostStrany);
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(180-45);
        zofka.move(Math.sqrt(2 * Math.pow(velikostStrany, 2)));
    }

    public void start() {
        Color tyrkysova = new Color(0, 255, 247, 219);
        Color indigova = new Color(60, 0, 200, 255);
        Color fialova = new Color(193, 0, 200, 255);
        Color vinova = new Color(200, 0, 90, 255);
        Color zlata = new Color(200, 160, 0, 215);

        nakresliCtverec(150.0, tyrkysova);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliTrojuhelnik(150.0, indigova);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliObdelnik(170.0, 120.0, fialova);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.penDown();

        nakresliKruh(6.0, 8.0, vinova);

        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliRovnoramennyTrojuhelnik(150.0, zlata);

        zofka.turnRight(90);
    }
}
