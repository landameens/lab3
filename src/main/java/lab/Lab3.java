package lab;

import lab.activity.*;
import lab.subject.*;

public class Lab3 {


    public static void main(String[] args) {

        Thing1 cristall = new Thing1("кристаллы ", "обыкновенной поваренной соли ");
        Thing1 salt = new Thing1("соль ", "мелкая столовая");
        Thing1 sea = new Thing1("море ", "");
        Thing1 stone = new Thing1("камни ", "похожие на осколки глыб ");
        Thing1 parashut = new Thing1("парашют ", "");
        Thing1 allThing = new Thing1("то ", "что попадается в руки ");
        Thing1 pocket = new Thing1("карманы ", "курточки ");
        Thing1 clothes = new Thing1("одежда ", "");
        Thing1 hill = new Thing1("холмами ", "поросшими зеленой травкой и мелким кустарником ");

        City city = new City("Лос-Паганос");

        Drag drag = new Drag(sea.getNAME(), "полосой вдоль");
        Limited limited = new Limited(hill.getNAME(), "с противополложной стороны ");
        Covered covered = new Covered(stone.getNAME(), "");
        Check check = new Check(stone.getNAME(), "внримательно");
        Lick lick = new Lick(stone.getNAME(), "");
        Ensure ensure = new Ensure(cristall.getNAME(), "что это");
        Chose chose = new Chose(cristall.getNAME(), "пару");
        Put put = new Put(cristall.getNAME(), "между ними");
        Pound pound = new Pound(cristall.getNAME(), "");
        Start start = new Start(pound.getActivityName(), "");
        End end = new End(salt.getNAME(), "в результате");
        Part part = new Part(allThing.getNAME(), "");
        Fill fill = new Fill(salt.getNAME(), pocket.getNAME());
        Ensure ensureClothes = new Ensure(clothes.getNAME(), "что просохла");
        PutOn putOn = new PutOn("", "");
        Go go = new Go(hill.getNAME(), "вдоль");
        See see = new See(city.getName(), "который");
        Parashute parashute = new Parashute(parashut.getNAME(), "когда");
        Form form = new Form(sea.getNAME(), "залив");
        Placed placed = new Placed(city.getName(), "");
        Come come = new Come(city.getName(), "в");
        Party party = new Party(city.getName(), "в");

        Ponchik ponchik = new Ponchik("Пончик", pound, fill, putOn, see,
                parashute, go, part, check, lick,
                ensure, chose, put, start, end);
        Coast coast = new Coast(drag, limited, covered);
        Dives dives = new Dives("Богачи", come, party);
        Street street = new Street(drag);
    }
}