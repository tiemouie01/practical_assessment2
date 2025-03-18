package method_problems;

public class AnimalLegCounter {
    public static final int CHICKEN_LEGS = 2;
    public static final int COW_LEGS = 4;
    public static final int PIG_LEGS = 4;

    public static void main(String[] args) {
        System.out.println(animals(2,3,5));
        System.out.println(animals(1,2,3));
        System.out.println(animals(5,2,8));
    }

    public static int animals(int chickens, int cows, int pigs) {
        return (chickens * CHICKEN_LEGS) + (cows * COW_LEGS) + (pigs * PIG_LEGS);
    }
}
