package day36_InheritanceIntro.Sport;

public class Sport {

    public String name;
    public int numberOfPlayers;
    public int numberOfReferer;
    public String rules;


    public Sport(String name, int numberOfPlayers, int numberOfReferer, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferer = numberOfReferer;
        this.rules = rules;
    }

    public void play(){
        System.out.println(numberOfPlayers + " players are playing");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferer=" + numberOfReferer +
                ", rules='" + rules + '\'' +
                '}';
    }
}
/*
Sports Task:
1. Create a class named Sport
variables:
name, numberOfPlayers, numberOfReferer,
rules
methods:
setInfo()
play()
toString()

2. create the following subclasses of Sport:
1. Basketball
2. Baseball
3. Football
4. AmericanFootball
Add any missing variables or methods
Note: you can search them on Google

 */