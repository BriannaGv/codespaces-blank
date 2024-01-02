public class Main {
    public static void main(String[] args) {
    int[] ints1 = {2, 4, 6, 8, 10};
    int[] ints2 = ints1;
    ints2[3] = 15;
    System.out.println(ints1[3]);
    System.out.println(ints2[3]);

}
}
