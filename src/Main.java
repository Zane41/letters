import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> list = reading("INPUT.txt");
        totalCounter(glassnyeOkonchania(list));

    }

    public static ArrayList<String> reading(String file) throws FileNotFoundException {
        Scanner vvod = new Scanner(new File(file));
        ArrayList<String> list = new ArrayList<>();
        while (vvod.hasNextLine()) {
            list.add(vvod.next());
        }
        vvod.close();
        return list;
    }
    public static ArrayList<String> glassnyeOkonchania(ArrayList<String> list){
        ArrayList<String> glasnyyList = new ArrayList<>();
        for (String x:list)
            if (x.endsWith("а")||x.endsWith("я")||x.endsWith("о")||x.endsWith("е")||x.endsWith("ё")||
                x.endsWith("и")||x.endsWith("ы")||x.endsWith("э")||x.endsWith("ю")||x.endsWith("у"))
                 glasnyyList.add(x);
        return glasnyyList;
    }

    public static void totalCounter(ArrayList<String> list){
        ArrayList<String> output =  new ArrayList<>();
        int counterA =0,counterYa=0,counterE=0,counterYo=0,counterYe=0,counterYu=0,
                counterI=0,counterbI=0,counterU=0,counterO=0;
        for (String x:list){
            if (x.endsWith("а")) counterA++; if (x.endsWith("я")) counterYa++;if (x.endsWith("e")) counterE++;
            if (x.endsWith("ё")) counterYo++;if (x.endsWith("э")) counterYe++;if (x.endsWith("ю")) counterYu++;
            if (x.endsWith("и")) counterI++;if (x.endsWith("ы")) counterbI++;if (x.endsWith("у")) counterU++;
            if (x.endsWith("о")) counterO++;
        }
        System.out.println("Слов заканчивающихся на А: "+counterA);
        System.out.println("Слов заканчивающихся на Я: "+counterYa);
        System.out.println("Слов заканчивающихся на Е: "+counterE);
        System.out.println("Слов заканчивающихся на Ё: "+counterYo);
        System.out.println("Слов заканчивающихся на Э: "+counterYe);
        System.out.println("Слов заканчивающихся на Ю: "+counterYu);
        System.out.println("Слов заканчивающихся на И: "+counterI);
        System.out.println("Слов заканчивающихся на Ы: "+counterbI);
        System.out.println("Слов заканчивающихся на У: "+counterU);
        System.out.println("Слов заканчивающихся на О: "+counterO);
}
}
