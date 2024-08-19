import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        addNums(arrayList);

        infoList(arrayList);

        deleteIndex(arrayList, 3);
        infoList(arrayList);

        setIndex(arrayList,3,3);
        infoList(arrayList);
        System.out.println(contains(arrayList, 3));


    }
    public static void addNums(ArrayList<Integer> arrayList){
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
    }
    public static void infoList(ArrayList<Integer> arrayList){
        System.out.println(arrayList);
    }

    public static void deleteIndex(ArrayList<Integer> arrayList, int index){
        arrayList.remove(index);
    }
    public static boolean contains(ArrayList<Integer> arrayList, int value){
        return arrayList.contains(value);
    }

    public static void setIndex(ArrayList<Integer> arrayList, int index, int value){
        arrayList.set(index, value);
    }

}