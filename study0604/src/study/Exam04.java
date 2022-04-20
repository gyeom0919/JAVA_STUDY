package study;

import java.util.Scanner;

public class Exam04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int su = 0;
        int sum = 0;
        int[] scores = new int[100];
        stu : while(true) {
        System.out.println("-------------------------------------------------");
        System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
        System.out.println("-------------------------------------------------");
        System.out.print("선택 >> ");
        int num = scan.nextInt();
        switch(num) {
        case 1:
            System.out.print("학생 수 >>");
            su = scan.nextInt();
            break;
        case 2:
            for(int i = 0;      i < su; i++) {
                System.out.printf("scores[%d] > ", i );
                scores[i] = scan.nextInt();
                }
            break;
        case 3:
            for(int i = 0; i < su; i++) {
                System.out.printf("scores[%d] > %d\n", i , scores[i]);
                }
            break;
        case 4:
            int max;
            double avg;
            max = scores[0];
            for(int i = 0; i < su; i++) {
                if(max < scores[i]) {
                    max = scores[i];
                } 
                sum += scores[i];
            }
            avg = (double)sum / su;
            System.out.println("최고 점수 : " + max);
            System.out.println("평균 점수 : " + avg);
            break;
         default:
             System.out.println("프로그램 종료"); 
             break stu;
        }
    }
    }
}