import java.sql.SQLOutput;
import java.util.Arrays;

public class Ucenje_1 {
    public static void main(String[] args) {

        //Zadatak 1
        System.out.println("Hello World");


        //Zadatak 2
        int brojGodina=21;
        String Ime="Amer";
        char ocjena='A';





        //Samostalno ucenje
        //Stringovi
        String message="Hello World!!";
        System.out.println(message.replace("!","*"));
        System.out.println(message.toLowerCase());
        String message2="    HELLO   ";
        System.out.println(message2);
        System.out.println(message2.trim());
        //Nizovi
        int[] number = new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;

        System.out.println(Arrays.toString(number));
        System.out.println(number.length);

        int[] brojevi={7,3,6,1,7,0};
        Arrays.sort(brojevi);
        System.out.println(Arrays.toString(brojevi));


        //Dvodimenzionalni nizovi
        int[][] brojevi2 = new int[2][4];
        brojevi2[0][0]=10;
        brojevi2[0][1]=20;
        System.out.println(Arrays.deepToString(brojevi2));



        //konstante
        final float pi=3.14F;


        //Numericke operacije
        double rezultat=(double)10/(double)3;
        System.out.println(rezultat);

        //Math class
        int rez=Math.round(1.1F);
        System.out.println(rez);
        int rez2=(int)Math.ceil(1.1F);
        System.out.println(rez2);
        int rez3=(int)Math.floor(1.1F);
        System.out.println(rez3);

        int br1=10;
        int br2=20;
        int VeciRezDvaBroja=Math.max(br1,br2);
        System.out.println("Veci broj od brojeva:"+ br1 + " i " + br2 + " je:"+VeciRezDvaBroja);



    }

}
