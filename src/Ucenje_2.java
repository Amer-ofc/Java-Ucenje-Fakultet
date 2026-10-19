import java.util.Scanner;

public class Ucenje_2 {
//Napredni kalkulator-Ucenje JAVE
    //Napiši program u kojem korisnik prvo unese dva broja, a zatim unese i željenu operaciju
    // kao tekst (npr. "+" ili "sabiranje", "-", "*" ili "/").
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------KALKULATOR--------------");
        System.out.println("Unesite prvi broj:");
        int broj1=input.nextInt();
        System.out.println("Unesite zeljenu operaciju(+,-,%,/):");
        System.out.println("Za odlazak na rad sa logickim operacijama unesite 0:");
        char operacija=input.next().charAt(0);
        int rezultat;
       switch(operacija){
           case '+':
               System.out.println("Unesite broj:");
               int broj2=input.nextInt();
               rezultat=broj1+broj2;
               System.out.println("Rezultat:"+ rezultat);
               break;
           case '-':
               System.out.println("Unesite broj:");
               int broj3=input.nextInt();
               rezultat=broj1-broj3;
               System.out.println("Rezultat:"+ rezultat);
               break;
           case  '*':
               System.out.println("Unesite broj:");
               int broj4=input.nextInt();
               rezultat=broj1*broj4;
               System.out.println("Rezultat:"+ rezultat);
               break;
           case '/':
               System.out.println("Unesite broj:");
               int broj5=input.nextInt();
               if(broj5==0){
                   System.out.println("Nije moguce dijeljenje sa 0!");
               }else{
               rezultat=broj1/broj5;
               System.out.println("Rezultat:"+ rezultat);}
               break;
           case 0:
               break;


       }
// Rad sa logickim operacijama
        System.out.println("Unesite jedan broj i biti ce uradene 3 provjere.");
        System.out.println("Da li je broj paran ili neparan,pozitivan ili negativan,djeljiv sa 5");
        System.out.println("Unos broja:");
        int broj6=input.nextInt();
        if (broj6%2==0){
            System.out.println("Uneseni broj:"+broj6+" je paran!");
        }else{
            System.out.println("Uneseni broj:"+broj6+" nije paran!");
        }

        if(broj6>0){
            System.out.println("Uneseni broj:"+broj6+" je pozitivan!");
        } else if (broj6<0) {
            System.out.println("Uneseni broj:"+broj6+" je negativan!");

        }else{
            System.out.println("Uneseni broj:"+broj6+" je nula!");
        }
        if(broj6%5==0){
            System.out.println("Uneseni broj:"+broj6+" je djeljiv sa 5 bez ostatka");
        }else{
            System.out.println("Uneseni broj:"+broj6+" nije djeljiv sa 5 bez ostatka");

        }



    }


}
