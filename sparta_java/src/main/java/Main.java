import java.util.Arrays;

public class Main {
    public static void numbering() {
        int i = 0;
        while ( i < 10 ) {
            System.out.println(i);    // 정의 메소드
            i++;
        }
    }

    public static void main (String [] args) {
        numbering();// 호출 메소드
    }
}