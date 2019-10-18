import java.util.*;


//4.   Занести стихотворение в список. Провести сортировку по возрастанию длин строк.


public class Play {

    public static void main(String[] args) {
        Scanner sc= new Scanner("Buddy you're a boy make a big noise"+"\n"+
        "Playin' in the street gonna be a big man some day"+"\n"+
        "You got mud on yo' face"+"\n"+
        "You big disgrace"+"\n"+
        "Kickin' your can all over the place"+"\n"+
        "Singin'"+"\n");

        ArrayList<String> list = new ArrayList<String>();
        int i=0;

        while (sc.hasNext()){
            list.add(i, sc.nextLine());
            i++;
        }                                       // Заполняем список элементами. Элемент==строка

        Comparator<String> byLength = new Comparator<String>(){

            public int compare (String s1, String s2) {
                return s1.length () - s2.length ();
            }
        };
        Collections.sort(list, byLength);// Сортировка по длине
        for (String el: list){
            System.out.println(el);
        }


        sc.close();
    }
}
