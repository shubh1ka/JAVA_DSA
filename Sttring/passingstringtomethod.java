package Sttring;

public class passingstringtomethod {
    public static void change(String x) {
        x="hello";
    }
    public static void main(String[] args) {
        String x ="Raghav";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
