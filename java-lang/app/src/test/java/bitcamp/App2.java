
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("나의 목록 관리 시스템");
        System.out.println("----------------------");
        //배열생성
        final int SIZE = 20; // 배열 길이
        int userid = 1;

         int[] num = new int[SIZE];
         int[] age = new int[SIZE];
         boolean[] working = new boolean[SIZE];
         float[] leftEye = new float[SIZE];
         float[] rightEye = new float[SIZE];


        //  키보드 스캐너 준비
        Scanner scanner = new Scanner(System.in);

        // for문 배열 입력
         for (int i = 0; i < SIZE; i++) {

           System.out.print("이름은?");
           name[i] = scanner.next();

           System.out.print("이메일은?");
           name[i] = scanner.next();

          System.out.print("암호는?");
          name[i] = scanner.next();

           System.out.print("성별은? M | W : ");
           gender[i] = scanner.next();

           no[i] = userId++;
           System.out.println("계속할거냐?");
           str=scanner.next();

         }



        System.out.println("------------------------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d %s %s %s %s %s\n",
                    num[i], name[i], password[i], email[i], gender[i]);
        }

    }
}