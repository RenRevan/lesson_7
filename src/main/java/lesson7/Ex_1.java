package lesson7;

import java.util.*;

import static java.lang.Math.*;


public class Ex_1 {




    public static void main(String[] arg){

        //Ex_1
//        ArrayList<String> list_1 = new ArrayList<String>();
//        list_1.add("Word 1");
//        list_1.add("Word 2");
//        list_1.add("Word 3");
//        list_1.add(1,"Word 4");
//        list_1.set(2,"Word_5");
//        list_1.remove(0);
//        for (String s: list_1) {
//            System.out.println(s);
//        }

        //Ex_1________

        //EX_2
//        Days day[]=Days.values();
//        for (Days d: day) {
//            System.out.println(d+" = "+d.getValue());
//
//        }
        //Ex_2________

        //Ex_3
        //Create Map vehicles : vehicles.put("BMW", 5);, print
//        Map<String,Integer> vehicles= new LinkedHashMap<String, Integer>();
//        vehicles.put("BMW",5);
//        vehicles.put("Bugatti",6);
//        System.out.println(vehicles);
//        System.out.println("BMW "+vehicles.get("BMW"));

        //Ex_3________


        //EX_4
        /* Create an array of 15 random integers
        from the segment [0;   9]. Display the array on the screen.
        Count how many in the array of even elements and display this number on the screen on a separate line.
        */
//        int count_even=0, a_e=0;
//        int arr_1[]= new int[10];
//        int arr_even[]= new int[10];
//        for (int v1=0; v1<10; v1++){
//            arr_1[v1]= (int) (random()*100);
//            if (arr_1[v1]%2==0){count_even++; arr_even[a_e]=arr_1[v1]; a_e++;}
//        }
//        System.out.print("Count: "+count_even+"\n");
//        for (int i: arr_even) {
//            if (i!=0){System.out.print(i+" ");}
//        }

        //EX_4________

        //Ex_5
//        ArrayList<String> arr_list=new ArrayList<String>();
//        arr_list.add("value 1");
//        arr_list.add("value 2");
//        arr_list.add("value 3");
//        arr_list.add("value 4");
//        arr_list.add("value 5");
//        System.out.println(arr_list.size());
//        for (String s: arr_list) {
//            System.out.println(s);
//        }
        //EX_5________

        //Ex_6
//        ArrayList<String> arr_list1=new ArrayList<String>();
//        arr_list1.add("val 1");
//        arr_list1.add("value 2");
//        arr_list1.add("val 3");
//        arr_list1.add("value 4 ");
//        arr_list1.add("va 5");
//        int max=0;
//        for (String s: arr_list1) {
//           if(s.length()>max) max=s.length();
//        }
//        for (String s: arr_list1) {
//            if(s.length()==max) System.out.println(s);
//        }
        //EX_6________

        //Ex_7
        HashMap<String, String> mapFruits=new HashMap<String, String>();
        mapFruits.put("watermelon", "berry");
        mapFruits.put("banana", "fruit");
        mapFruits.put("cherry", "berry");
        mapFruits.put("pineapple", "fruit");
        mapFruits.put("melon", "vegetable");
        mapFruits.put("cranberry", "berry");
        mapFruits.put("apple", "fruit");
        mapFruits.put("iris", "flower");
        mapFruits.put("potato", "vegetable");
        mapFruits.put("carrot", "vegetable");

//        for (String key: mapFruits.keySet()) {
//            System.out.println(key+" - "+mapFruits.get(key));
//        }

        //Ex_7________
        //EX_8
//        for (Map.Entry entry: mapFruits.entrySet()) {
//
//            String key = entry.getKey().toString();
//            String value = entry.getValue().toString();
//            if (value.equals("vegetable")){
//                System.out.println(key+" - "+value);
//            }
//        }
        //EX_8________


        //EX_9


//        ArrayList<Integer> arr_i = new ArrayList<Integer>();
//        HashSet<Integer> arr_h = new HashSet<Integer>();
//
//        for (int va=0; va<100; va++){
//            arr_i.set(va, (int) (random() * 100));
//        }
//
//        for (int i: arr_i) {
//           if(!arr_h.contains(i))arr_h.add(i);
//        }

        //EX_9________

        //EX_10
        Days[] day= Days.values();

        for (Days d: day) {

        switch (d){
            case MONDAY: { System.out.println(1); break;}
            case TUESDAY: { System.out.println(2); break;}
            case WEDNESDAY: { System.out.println(3); break;}
            case THURSDAY: { System.out.println(4); break;}
            case FRIDAY: { System.out.println(5); break;}
            case SATURDAY: { System.out.println(6); break;}
            case SUNDAY: { System.out.println(7); break;}
        }
        }

        //EX_10_______

    }
}

enum Days{
    MONDAY ("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String value;
    Days(String value) {
        this.value=value;
    }
    public String getValue(){
        return this.value;
    }


}
