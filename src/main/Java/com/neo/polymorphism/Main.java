package com.neo.polymorphism;

class Main {
    public static void main(String[] args) {

        Food[] tasty = new Food[2];
        tasty[0] = new Tuna();
        tasty[1] = new Pie();

        for (int i = 0; i < 2; i++) {
            tasty[i].eat();
        }

        Fatty phil = new Fatty();
        Food foodObj = new Food();
        Food pieObj = new Pie();

        phil.digest(foodObj);
        phil.digest(pieObj);
    }
}
