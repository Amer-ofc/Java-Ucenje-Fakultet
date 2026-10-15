import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadaca1{
    public static void main(String[] args) {
    //Zadatak 1-Upoznavanje sa main metodom i System.out.println
        System.out.println("Hello, Java world!");
        //Promjenite poruku tako da uključuje vase ime
        System.out.println("Hello,Amer");
        //Dodajte još jedan redak za ispis sa zabavnom porukom
        System.out.println("Moje omiljena hrana je pizza!!!");



        //Zadatak 2 Varijable i tipovi podataka
        int dob = 21;
        double visina = 2.00;
        boolean jeStudent=true;
        char ocjena='A';
        String ime = "Amer";
        int godinaFakulteta = 3;

        System.out.println("Moje ime je "+ime+",imam "+dob+" godinu,"+"student sam "+godinaFakulteta+" godine i visok sam "+visina+" metra");


        //Zadatak 3 Ekspresije i operatori
        int a=5;
        int b=10;
        int suma=a+b;
        int razlika=b-a;
        boolean veciBroj = b > a;
        boolean pozitivni = (a>0) && (b>0);

        System.out.println("Suma brojeva:"+ suma);
        System.out.println("Razlika: "+razlika);
        System.out.println("Da li su oba broja pozitivna: "+pozitivni);
        System.out.println("Da li je b vece od a:"+veciBroj);

        //Kalkulator
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("------Kalkulator------");
        System.out.println("Unesite prvi broj:");
        int broj1=input.nextInt();
        System.out.println("Unesite drugi broj:");
        int broj2=input.nextInt();
        int suma1 = broj1 + broj2;
        int razlika1=broj1-broj2;
        int dijeljenje=broj1/broj2;
        int mnozenje=broj1*broj2;
        System.out.println("--------------------");
        System.out.println("Ispis rezultata svih operacija:");
        System.out.println("Suma unesenih brojeva je:"+suma1);
        System.out.println("Razlika unesenih brojeva je:"+razlika1);
        System.out.println("Rezultat dijeljenja ova dva broja je:"+dijeljenje);
        System.out.println("Rezultat mnozenja je:"+mnozenje);


        //Primitivni tipovi podataka
        double x=13000;
        System.out.println(x);

        int y = (int) x;
        System.out.println(y);
        //Zašto se broj promijenio? Što se događa s prekoračenjem?
        //Java prilikom promjene broja iz double u int "odsjeca" sve brojeve iza zareza
        //U slucaju prekoracenja maksimalne vrijednosti int-a program automatski mijenja broj sa maksimalnim mogucim int brojem ili minimalnim

        //Maksimalna vrijednost bajtova 127 - što se događa ako dodate 1?
        byte bajt=127;
        bajt=(byte)(bajt+1);
        System.out.println(bajt);
        //Sistem u slucaju prekoracenja dozvoljene byte vrijednosti ispisuje -128 to jest najniza moguca vrijednost


        String recenicaJedan="Programiranje u Javi";
        String recenicaDva="Je super";

        String kombinacija=recenicaJedan+" "+recenicaDva;
        System.out.println(kombinacija);
        System.out.println("Duzina teksta:"+kombinacija.length());
        System.out.println("String u lower case-u:"+kombinacija.toLowerCase());
        System.out.println("Da li string sadrzi rijec 'Java':"+kombinacija.contains("Javi"));
        //Ispišite prvi i zadnji znak njihovog niza.
        char prvi=kombinacija.charAt(0);
        int duzina=kombinacija.length();
        char zadnji=kombinacija.charAt(duzina-1);
        System.out.println("Prvi i zadnji znak stringova je:"+prvi+",a zadnji je:"+zadnji);


        //Izazov: „Tajni kod“ — zamijenite dva slova pomoću substring().1?
        String tajniKod=zamjeniPrvoiZadnje(kombinacija);

        System.out.println("Orginalni tekst:"+ kombinacija);
        System.out.println("Nakon zamjene:"+tajniKod);



        // Bonus Izazov 1:Kombinirajte sve sto smo prosli I napravite jedan mali
        //program ProfileSummary.java
    /*  int dob = 21;
        double visina = 2.00;
        boolean jeStudent=true;
        char ocjena='A';
        String ime = "Amer";
        int godinaFakulteta = 3; */
        int godiste=2005;
        float prosjek=9.6F;
        System.out.println("Upoznajte "+ ime + "-a!!!!");
        System.out.println("Godiste:"+godiste+",Visine:"+visina+",prosjeka:"+prosjek);
        System.out.println("Da li je student?:"+jeStudent);



        //Napišite vlastitu verziju koja ispisuje 3 komplimenta svom najboljem prijatelju,
        //profesoru ili čak sebi.
        // Koristite \n za nove retke i učinite da „govori kao robot“.
        String ime2="JOHN";
        System.out.println("HEY "+ime2+"\nSCANNING USER... STATUS: 100% AWESOME. KEEP CODING, HUMAN!\nALERT: HUMAN IS DOING GREAT! COMPILING SUCCESS STORIES... NO SYSTEM ERRORS FOUND. KEEP GOING, BEP BOP!\nCPU TEMP: NORMAL. HUMAN MOTIVATION: MAXIMUM!");


    }


    public static String zamjeniPrvoiZadnje(String tekst){
        if (tekst == null){
            System.out.println("Unijeli ste prazan tekst");
            return tekst;
        }

        String prvoSlovo=tekst.substring(0,1);
        String zadnjeSlovo=tekst.substring(tekst.length()-1);
        String sredina=tekst.substring(1,tekst.length()-1);

        return zadnjeSlovo + sredina + prvoSlovo;
    }






}
