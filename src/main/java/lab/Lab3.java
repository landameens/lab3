package lab;

import lab.activity.*;
import lab.shorties.*;
import lab.things.*;
import lab.things.thingss1.Thing1;

public class Lab3 {

    public static void main(String[] args) {

        Thing1 cristall = new Thing1("кристаллы ", "обыкновенной поваренной соли ");
        Thing1 salt = new Thing1("соль ", "мелкая столовая");
        Thing1 sea = new Thing1("море ", "");
        Thing1 stone = new Thing1("камни ","похожие на осколки глыб ");
        Thing1 parashut = new Thing1("парашют ","");
        Thing1 allThing = new Thing1("то ", "что попадается в руки ");
        Thing1 pocket = new Thing1("карманы ", "курточки ");
        Ponchik ponchik = new Ponchik("Пончик");
        Coast coast = new Coast();
        City city = new City("Лос-Паганос");
        Drag drag = new Drag(sea.getNAME(), "полосой вдоль");


        System.out.println(coast.doActivity(drag.getActivityName()));
        //System.out.println(ponchik.doActivity(new Check(stone.getNAME(), "внимательно")));
        //System.out.println(ponchik.doActivity("Pound"));

//        description.GetDescribe() + coast.getName() + coast.doActivity(drag.getName(), new Sea()) + coast.doActivity("Limited", hill)
//                + " c " + plant.GetDescribe() + ". " + coast.getName() + " был " + coast.doActivity("Covered", stone) + stone.Similar() + ". " +
//                ponchik.getName() + ponchik.doActivity("Check", stone) + " и " + ponchik.doActivity("Lick", stone) +
//                ponchik.doActivity("Ensure", cristall) + describe.GetDescribe() + ". " + ponchik.doActivity("Chose", cristall) +
//                ponchik.doActivity("Put", cristall) + ponchik.doActivity("Start", cristall) + ponchik.doActivity("End", salt) +
//                View.GetDescribe()+". "+ ponchik.getName()+" " + ponchik.doActivity("Pound", new Salt()) + " побольше и "+
//                ponchik.doActivity("Fill", new Jacket.Pocket()) + ". " + "Он " + ponchik.doActivity("PutOn", new Jacket())+
//                " и " + ponchik.doActivity("Go", hill) + " города, который он " + ponchik.doActivity("See", null) +
//                " , когда " + ponchik.doActivity("Parashute", new Parashut()) + "е. "
//                +sea.getName() + sea.Form() + ", на "+ coast.getName() + " у которого расположился город." +
//                " Это был " + city.getName() + ", в который " + dives.doActivity("Come", null) + " " + dives.getName()
//                + " из других городов, так как здесь был " + city.Description() + dives.doActivity("Party", city)+". "+
//                StreetDescription.GetDescribe()+street.getName()+street.doActivity("Drag", coast);


//        Drag drag = new Drag();
//        Coast coast = new Coast();
//        Hill hill = new Hill();
//        Coast.Description description = coast.new Description();
//        Hill.Plant plant = new Hill.Plant();
//        Stone stone=new Stone();
//        Cristall cristall = new Cristall();
//        Cristall.Describe describe = cristall.new Describe();
//        Salt salt = new Salt();
//        Salt.Describe View = salt.new Describe();
//        Sea sea = new Sea();
//        City city = new City("Лос-Паганос");
//
//        Dives dives = new Dives("Богачи");
//        Street street = new Street();
//        Street.Description StreetDescription = street.new Description();
    }
}
