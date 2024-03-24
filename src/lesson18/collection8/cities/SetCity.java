package lesson18.collection8.cities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetCity {
    private Set<City> hash = new HashSet<>();
    private Set<City> tree = new TreeSet<>();

    public int size(){
        return this.hash.size() + this.tree.size();     // получаем кол-во городов в двух set'ах
    }

    private boolean isEven(int code){
        return code % 2 == 0;
    }

    public boolean addCity(String name, int code){
        boolean result = name != null && name.length() > 0 && code > 0;
        if (result) {
            if (isEven(code)) {
                hash.add(new City(name, code));
            } else {
                tree.add(new City(name, code));
            }
        }
        return result;
    }

    public void printReverseSort(){
        TreeSet<City> treeSet = new TreeSet<>(this.tree);
        treeSet.addAll(this.hash);
        Iterator<City> iterator = treeSet.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void removeCityFilter(int minSymbol, int maxSymbol){
        hash.removeIf(x -> x.getName().length() < minSymbol || x.getName().length() > maxSymbol);
        tree.removeIf(x -> x.getName().length() < minSymbol || x.getName().length() > maxSymbol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Список городов с четным кодом (HashSet):\n");
        for (City city : hash) {
            sb.append(city).append("\n");   // Конкатенация через += не пройдет, т.к. у нас изменяемая строка StringBuilder
        }
        sb.append("\n").append("Список городов с нечетным кодом (TreeSet):\n");
        for (City city : tree) {
            sb.append(city).append("\n");
        }
        return sb.toString();
    }
}














