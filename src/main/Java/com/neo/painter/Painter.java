package com.neo.painter;


//        The Painter class is not an actual Painter. It's a blueprint for what a painter should be.
//       /         \
//      |          |
public class Painter {

    private String painting;
    private String painterName;
    private int timepainting;
    private int updates;
    public static final int MAX_UPDATES = 3;

    public Painter(String painter) {
        painterName = painter;
    }

    public String getPainterName() {
        return painterName;
    }


    public void setPainter(String painterName) {
        this.painterName = painterName + "days";
        updates = 0;
    }

    public String getPainter() {
        return painterName;
    }

    public String swapPainter(String painter) {
        String swappedPainter = this.painterName;
        this.painterName = painter;
        return swappedPainter;
    }


    public String swapPainting(String painting) {
        String swappedPainting = this.painting;
        this.painting = painting;
        return swappedPainting;
    }


    public String getPainting() {
        return painting;
    }


    public void setPainting(String painting) {
        this.painting = painting;
    }


    public void setTimepainting(int timepainting) {


        this.timepainting = timepainting;
    }


    public int getTimepainting() {
        return timepainting;
    }


    public void update() {
        updates = MAX_UPDATES;
        System.out.println("\n Updating painting completion... \n");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.printf("An exception occurs");
        }

    }


    public boolean paintingIsComplete() {
        return updates == 3;
    }


    public void createPainting() {
        System.out.println(getPainter() + " spent " + getTimepainting() + " days painting " + getPainting());

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.printf("An exception occurs");
        }
    }


}