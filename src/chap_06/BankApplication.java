package chap_06;

import java.util.Scanner;

public class BankApplication {
    private static Account_2[] accountArray = new Account_2[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택> ");

            int selectNo = sc.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //    계좌 생성하기
    private static void createAccount() {
        System.out.println("------------");
        System.out.println("계좌 생성");
        System.out.println("------------");

        System.out.print("계좌 번호: ");
        String ano = sc.next();
        System.out.print("계좌주: ");
        String owner = sc.next();
        System.out.print("초기 입금액: ");
        int balance = sc.nextInt();

        Account_2 newAccount = new Account_2(ano, owner, balance);
        for(int i=0; i<accountArray.length; i++){
            if(accountArray[i] == null){
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    //    계좌 목록보기
    private static void accountList() {
        System.out.println("------------");
        System.out.println("계좌 목록");
        System.out.println("------------");
    }

    //    예금하기
    private static void deposit() {
//        작성 위치
    }

    //    출금하기
    private static void withdraw() {
//        작성 위치
    }

//    Account 배열에서 ano와 동일한 Account 객체 찾기
}
