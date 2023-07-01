package _05_Inheritance.randomArrayList;
public class Main {
    public static void main(String[] args) {


        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add(1);
        randomArrayList.add(4);
        randomArrayList.add(6);
        randomArrayList.add(8);
        randomArrayList.add(12);
        randomArrayList.add(15);
        randomArrayList.add(123);
        randomArrayList.add(132);
        System.out.println(randomArrayList.getRandomElement());
    }
}
