package day18;

public class Demo02 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("bui:"+stringBuilder);

        StringBuilder zhoujiejiee = stringBuilder.append("zhoujiejiee");
        System.out.println(zhoujiejiee);

        String s = zhoujiejiee.toString();
        System.out.println(s);
    }
}
