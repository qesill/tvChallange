public class Main {
    public static void main(String[] args) {
        /*
        Stwórz klasę Tv opisującą telewizor wraz z zmiennymi jak:
        producent, model, rok produkcji i dodatkowe, które będą
        pasowały do tego produktu.
        Dodaj jedną metodę printBasicDAta() prezentującą w konsoli te trzy
        powyższe wartości przechowywane w instancji klasy.
        Na koniec dodaj instancję do głównego programu i wartości do
        podstawowych pól oraz wywołaj metodę printBasicData()
         */
        Tv samsung = new Tv();
            samsung.producent = "Samsung";
            samsung.model = "T1000";
            samsung.rok_produkcji = 2023;
            samsung.ilosc_cali = 40.5f;
            samsung.system_dzwieku = "Dolby Athmos";
            samsung.system_operacyjny = "Tizen";

        samsung.printBasicData();
    }
}
class Tv
{
    String producent;
    String model;
    int rok_produkcji;
    float ilosc_cali;
    String system_operacyjny;
    String system_dzwieku;

    public void printBasicData()
    {
        System.out.println("Producent: " + this.producent + ","
                        + " Model: " + this.model + ","
                        + " Rok produkcji: " + this.rok_produkcji + ".");
    }


}




