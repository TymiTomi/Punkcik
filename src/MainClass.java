
import java.util.ArrayList; //importujemy klase ArrayList

public class MainClass {    //Tworzymy klase publiczna o nazwie MainClass
    public MainClass() {    
    }

    public static void main(String[] args) {        //wywołujemy funkcje glowne (konstruktor)
        PunktMaterialny punkt01 = new PunktMaterialny();
        PunktMaterialny punkt02 = new PunktMaterialny(10.0F);
        System.out.println("Punkt pierwszy \tOpis: " + punkt01.opis());                                                                                 //wyswietlamy wszystkie rzeczy println
        System.out.println("\tMasa:" + punkt01.pobierzMase());
        System.out.println("\tGlowny momet bezwladnosci:" + punkt01.pobierzGlownyMomentBezwladnosci());
        System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" + punkt01.obliczMometBezwladnosciWzdluzOsi(10.0F));
        System.out.println("Punkt drugi \tOpis: " + punkt02.opis());
        System.out.println("\tMasa:" + punkt02.pobierzMase());
        System.out.println("\tGlowny momet bezwladnosci:" + punkt02.pobierzGlownyMomentBezwladnosci());
        System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" + punkt02.obliczMometBezwladnosciWzdluzOsi(10.0F));
        punkt01.zmienMase(9.0F);
        System.out.println("Punkt pierwszy \tOpis: " + punkt01.opis());
        System.out.println("\tMasa:" + punkt01.pobierzMase());
        System.out.println("\tGlowny momet bezwladnosci:" + punkt01.pobierzGlownyMomentBezwladnosci());
        System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" + punkt01.obliczMometBezwladnosciWzdluzOsi(10.0F));
        ArrayList<PunktMaterialny> ListaTymczasowa = new ArrayList();

        for(int i = 0; i < 10; ++i) {  //Tworzymy petle w ktorej dodajemy od 0 do 9 nowe punkty
            ListaTymczasowa.add(new PunktMaterialny((float)i));
        }

        new PunktMaterialny();

        for(int i = 0; i < ListaTymczasowa.size(); ++i) {                   //kolejna petla tym razem wywolujemy te funkcje z pobieraniem listy tymczasowej pokazuje nam to calosc odpowiednia ilosc razy
            PunktMaterialny temp = (PunktMaterialny)ListaTymczasowa.get(i);
            System.out.println("Punkt pierwszy \tOpis: " + temp.opis());
            System.out.println("\tMasa:" + temp.pobierzMase());
            System.out.println("\tGlowny momet bezwladnosci:" + temp.pobierzGlownyMomentBezwladnosci());
            System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" + temp.obliczMometBezwladnosciWzdluzOsi(10.0F));
        }

    }

}
