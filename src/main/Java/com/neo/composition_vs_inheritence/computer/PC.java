package com.neo.composition_vs_inheritence.computer;

public class PC {

//  This is composition

//  Composition in essense is creating objects within objects

//  Look at using composition before using inheritence (But it depends on what you're trying to achieve)

//  The advantage with composition is that you can use multiple classes
//  With inheritence, you can only inherit from one class at a time

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {

//      Notice how I am using the variable instead of a getter which is cleaner. (Use getters for some other form of validation, varification)
//        |
        monitor.drawPixelAt(1200, 50,"yellow");
    }

}
