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

    public void nakresliRovnoramennyPravouhlyTrojuhelnik(double velikostStrany, Color barva){
        zofka.setPenColor(barva);
        zofka.move(velikostStrany);
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(180-45);
        zofka.move(Math.sqrt(2 * Math.pow(velikostStrany, 2)));
        zofka.turnRight(45);
    }

    public void nakresliRovnoramennyTrojuhelnik(double velikostStrany, double velikostOstrehoUhlu, Color barva){
        zofka.setPenColor(barva);

        zofka.turnRight(90 - velikostOstrehoUhlu);
        zofka.move(velikostStrany);
        zofka.turnRight(2 * velikostOstrehoUhlu);
        zofka.move(velikostStrany);
        zofka.turnRight(180 - velikostOstrehoUhlu);
        zofka.move(2 * velikostStrany * Math.cos(velikostOstrehoUhlu * (Math.PI / 180)));

    }

    public void start() {
        Color tyrkysova = new Color(0, 255, 247, 219);
        Color indigova = new Color(60, 0, 200, 255);
        Color fialova = new Color(193, 0, 200, 255);
        Color vinova = new Color(200, 0, 90, 255);
        Color zlata = new Color(200, 160, 0, 215);
        Color zelena = new Color(0, 255, 60, 244);

//        nakresliCtverec(150.0, tyrkysova);
//
//        zofka.penUp();
//        zofka.turnRight(90);
//        zofka.move(400);
//        zofka.turnLeft(180);
//        zofka.penDown();
//
//        nakresliTrojuhelnik(150.0, indigova);
//
//        zofka.penUp();
//        zofka.turnLeft(180);
//        zofka.move(100);
//        zofka.turnLeft(90);
//        zofka.penDown();
//
//        nakresliObdelnik(170.0, 120.0, fialova);
//
//        zofka.penUp();
//        zofka.turnRight(90);
//        zofka.move(300);
//        zofka.penDown();
//
//        nakresliKruh(6.0, 8.0, vinova);
//
//        zofka.penUp();
//        zofka.move(200);
//        zofka.turnLeft(90);
//        zofka.penDown();
//
//        nakresliRovnoramennyPravouhlyTrojuhelnik(150.0, zlata);
//
        // Žofka se posune
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        //Zmrzlina
        nakresliKruh(8.0, 10.0, vinova);
        zofka.turnLeft(180);
        nakresliRovnoramennyTrojuhelnik(275.0, 75.0, zlata);

        // Žofka se posune
        zofka.penUp();
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(350);
        zofka.turnLeft(90);
        zofka.penDown();

        // sněhulák
        nakresliKruh(8.0, 15.0, tyrkysova);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(215);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(8.0, 12.0, tyrkysova);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(172);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(8.0, 9.0, tyrkysova);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(172/2);
        zofka.turnRight(90);
        zofka.move(170/2);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(8.0, 4.0, tyrkysova);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(178);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKruh(8.0, 4.0, tyrkysova);

        // Žofka se posune
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(850);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();

        // Mašinka
        nakresliKruh(8.0, 15.0, indigova);  // zadní kolečko
        zofka.turnRight(180);
        nakresliObdelnik(300, 212, vinova); // kabinka
        zofka.turnLeft(90);
        nakresliObdelnik(300, 140, fialova);
        zofka.penUp();
        zofka.move(90);
        zofka.penDown();
        nakresliKruh(8.0, 7.0, zlata);
        zofka.penUp();
        zofka.move(130);
        zofka.penDown();
        nakresliKruh(8.0, 7.0, zlata);
        zofka.penUp();
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliRovnoramennyPravouhlyTrojuhelnik(120.0, zelena);

        // Žofka se posune
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
    }
}
