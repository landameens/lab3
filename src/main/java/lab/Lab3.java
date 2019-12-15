package lab;

import lab.activity.*;
import lab.shorties.*;
import lab.things.*;

public class Lab3 {

    public static void main(String[] args) {


        Drag drag = new Drag();
        Coast coast = new Coast();
        Hill hill = new Hill();
        Coast.Description description = coast.new Description();
        Hill.Plant plant = new Hill.Plant();
        Stone stone=new Stone();
        Cristall cristall = new Cristall();
        Cristall.Describe describe = cristall.new Describe();
        Salt salt = new Salt();
        Salt.Describe View = salt.new Describe();
        Sea sea = new Sea();
        City city = new City("Лос-Паганос");
        Ponchik ponchik = new Ponchik("Пончик");
        Dives dives = new Dives("Богачи");
        Street street = new Street();
        Street.Description StreetDescription = street.new Description();
    }
}
