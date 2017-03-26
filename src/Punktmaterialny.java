
class PunktMaterialny {                         //tworzymy klase PunktMaterialny

    float masa;
    float glowny_momet_bezwladnosci;

    public float pobierzMase() {
        return this.masa;
    }           //akcesor

    public float pobierzGlownyMomentBezwladnosci() {
        return this.glowny_momet_bezwladnosci;
    }   //akcesor

    public void zmienMase(float nowaMasa) { //korzystanie z akcesorow
        this.masa = nowaMasa;
        this.obliczGlownyMomentBezwladnosci();
    }

    public PunktMaterialny() {                     //konstruktor
        this.masa = 0.0F;
        this.obliczGlownyMomentBezwladnosci();
    }

    public PunktMaterialny(float poczatkowaMasa) {              //konstruktor korzystajacy zmieniajacy mase w zmienna poczatkowa mase
        this.masa = poczatkowaMasa;
        this.obliczGlownyMomentBezwladnosci();
    }

    public float obliczGlownyMomentBezwladnosci() {                     //Akcesor
        this.glowny_momet_bezwladnosci = 0.0F;
        return this.glowny_momet_bezwladnosci;
    }

    public float obliczMometBezwladnosciWzdluzOsi(float odlegloscMiedzyOsiami) {                    //Akcesor
        float temp = this.glowny_momet_bezwladnosci + this.masa * odlegloscMiedzyOsiami * odlegloscMiedzyOsiami;
        return temp;
    }

    public String opis() {                      //Akcesor
        return "Opis obiektu";
    }

}
