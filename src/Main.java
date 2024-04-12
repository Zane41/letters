import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //ArrayList<String> list = reading("INPUT.txt");
        //totalCounter(glassnyeOkonchania(list));
        vivod(countLetters(reading("INPUT.txt"),createMap()));
    }

    public static ArrayList<String> reading(String file) throws FileNotFoundException {
        Scanner vvod = new Scanner(new File(file));
        ArrayList<String> list = new ArrayList<>();
        while (vvod.hasNext()) {
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
    public static HashMap<Character,Integer> createMap(){
        HashMap<Character,Integer> letters = new HashMap<>();
            letters.put('а', 0);letters.put('я', 0);letters.put('ё', 0);letters.put('е', 0);
            letters.put('о', 0);letters.put('у', 0);letters.put('ю', 0);letters.put('ы', 0);
            letters.put('э', 0);letters.put('и', 0);
        return letters;
    }
    public static HashMap<Character,Integer> countLetters (ArrayList<String> list, HashMap<Character,Integer> map){
        int i;
        for (String x:list){
            System.out.println(x.charAt(x.length()-1));
            if (map.containsKey((x.charAt(x.length()-1)))){
                i=map.get((x.charAt(x.length()-1)))+1;
                map.put(((x.charAt(x.length()-1))), i);
            }
        }
        return map;
    }
    public static void vivod (HashMap<Character, Integer> map){
        System.out.println("Количество слов заканчивающихся на опр букву:");
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
