package com.neo.painter;


public class Main {

    /**
     * @param args
     */

    public static void main(String[] args) {

    class test {

    }

        Painter a = new Painter("Gustav Klimt");
//             |
//           Memory Reference. Where the Painter object is stored in memory. If a could talk, it would say, "I'm not a painter object, but I know where to get one".

        a.setPainting("\"The Kiss\"" + ". \n");

        if (a.paintingIsComplete()) {

            System.out.println("Painting is complete!!" + "\n");

        } else {

            System.out.println("The painting is not complete yet ");
        }

        a.update();
        a.setTimepainting(150);

        a.createPainting();





        Painter b = new Painter("Johannes Vermeer");

        b.setPainting("\"Girl with a Pearl Earring\"" + ".");

        if (b.paintingIsComplete()) {

            System.out.println("Painting is complete!!" + "\n");

        } else {

            System.out.println("The painting is not complete yet ");
        }

        b.update();
        b.setTimepainting(130);

        b.createPainting();




        String originalPainter = b.getPainter();


        b.swapPainter("Georges Braque");
        b.swapPainting("\"Fruit Dish and Glass\"" + ".");

        b.update();
        b.setTimepainting(120);

        System.out.println("Painter b was " + originalPainter + " but now it's painter " + b.getPainter() + ". This Painter spent " + b.getTimepainting() + " days.");



    }

}