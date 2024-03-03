package Lecture10Problem5;

public abstract class Animal {

    public String name;
    public String favouriteFood;

    public Animal(String name, String favouriteFood){
        this.name = name;
        this.favouriteFood = favouriteFood;
    }
    public String explainSelf(){
        return String.format("I am %s and my favourite food is %s", name, favouriteFood);
    }
}
