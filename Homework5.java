import java.util.*;

public class Homework5 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        addContact(map,"Nikita", "89121266666");
        addContact(map,"Nikita", "89129577777");
        addContact(map,"Efgaf", "84959856412");
        addContact(map,"Elena", "84958547962");
        addContact(map,"Elena", "84958665555");
        addContact(map,"Elena", "84955688488");
        addContact(map,"Police", "02");

        System.out.println(map);

        ArrayList<String> sorted = new ArrayList<>();
        for (String s: map.keySet()){
            sorted.add(s);
        }
        Collections.sort(sorted, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return map.get(o2).size() - map.get(o1).size();
                    }
                });
        System.out.println(sorted);

        //map.put("Ivan", List.of("123"));
        //map.put("Ivan", Arrays.asList("123"));
    }
    private static void addContact(HashMap<String, ArrayList<String>> map, String name, String phone) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(phone);

    }

}
        //HashMap<String, String> map = new HashMap<>();
        //map.merge( "Nikita", "89121266666", (o, n)) -> o == null ? n: o + " " + n);
        //map.merge( "Nikita", "89121266666", (o, n)) -> o == null ? n: o + " " + n);
        //map.merge( "Nikita", "89121266666", (o, n)) -> o == null ? n: o + " " + n);
        //map.merge( "Nikita", "89121266666", (o, n)) -> o == null ? n: o + " " + n);
        //  ArrayList<String> sorted = new ArrayList<>();
//        for (String s: map.keySet()){
//            sorted.add(s);
//        }
//        Collections.sort(sorted, (o1, o2) -> map.get(o1).split(" ").lenght - map.get(o2).split(" ").lenght);
//        System.out.println(sorted);