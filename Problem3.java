public class Problem3 {
    public static void main(String[] args) {
        double digitNum = 505.9246;
        int castedNum = (int)(digitNum * 1000);
        int first = (castedNum / 100) % 10;
        int mid = (castedNum / 10) % 10;
        int last = castedNum % 10;
        System.out.print(first);
        System.out.print(mid);
        System.out.print(last);
    }
}
