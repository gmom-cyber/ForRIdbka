package ru.mirea.ikbo1619.lab5.laba5;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Random;


public class Draw extends JFrame {
    public Draw() {
        setSize(500, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Random rand = new Random();
        Graphics2D g2 = (Graphics2D) g;

        Shape rectangle = new Rectangle2D.Double(3, 3, 500, 300);
        Shape line = new Line2D.Double(3, 3, 500, 300);
        Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
        Shape ellips = new Ellipse2D.Double(200, 200, 120, 80);
        Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 100, 100);
        int color1 = (int) (Math.random() * 3) + 1;//Переменная отвечающая за цвет rectangle, генерируется случайно от 1 до 3
        if (color1 == 1) {
            g2.setColor(Color.blue);
            g2.fill(rectangle);
        } else if (color1 == 2) {
            g2.setColor(Color.yellow);
            g2.fill(rectangle);
        } else if (color1 == 3) {
            g2.setColor(Color.red);
            g2.fill(rectangle);
        }
        int color2 = 0;
        //Цикл нужен чтобы были разные цвета у объектов
        do {
            color2 = (int) (Math.random() * 3) + 1;//Переменная отвечающая за цвет roundRect, генерируется случайно от 1 до 3
        }
        while (color1 == color2);
        if ((color2 == 1)) {
            g2.setColor(Color.blue);
            g2.fill(roundRect);
        } else if (color2 == 2) {
            g2.setColor(Color.yellow);
            g2.fill(roundRect);
        } else if (color2 == 3) {
            g2.setColor(Color.red);
            g2.fill(roundRect);
        }


        int color3 = (int) (Math.random() * 3) + 1;//Переменная отвечающая за цвет circle, генерируется случайно от 1 до 3


        if ((color3 == 1)) {
            g2.setColor(Color.green);
            g2.fill(circle);
        } else if (color3 == 2) {
            g2.setColor(Color.black);
            g2.fill(circle);
        } else if (color3 == 3) {
            g2.setColor(Color.orange);
            g2.fill(circle);
        }
        int color4 = 0;
        //Цикл нужен чтобы были разные цвета у объектов
        do {
            color4 = (int) (Math.random() * 3) + 1;//Переменная отвечающая за цвет roundRect, генерируется случайно от 1 до 3
        }
        while (color3 == color4);
        if ((color4 == 1)) {
            g2.setColor(Color.green);
            g2.fill(ellips);
        } else if (color4 == 2) {
            g2.setColor(Color.black);
            g2.fill(ellips);
        } else if (color4 == 3) {
            g2.setColor(Color.orange);
            g2.fill(ellips);
        }
        int color5 = (int) (Math.random() * 2) + 1;//Переменная отвечающая за цвет line, генерируется случайно от 1 до 2
        if ((color5 == 1)) {
            g2.setColor(Color.pink);
            g2.draw(line);
        } else if (color5 == 2) {
            g2.setColor(Color.lightGray);
            g2.draw(line);


        }

    }
}
