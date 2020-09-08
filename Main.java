import java.util.Scanner;

import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,###,###");

        Customer HHJ = new Customer();
        Customer MHJ = new Customer();

        String strput;
        int input;

        System.out.println("하효정님의 계좌 금액을 입력해주세요");
        input = scan.nextInt();
        HHJ.setHHJbal(input);

        System.out.println("문현종님의 계좌 금액을 입력해주세요");
        input = scan.nextInt();
        MHJ.setMHJbal(input);

        System.out.println("\n**********비밀번호를 입력하시오.************");
        input = scan.nextInt();

        if(input == 15247){
            System.out.println("\n<반갑습니다 하효정님 로그인 되었습니다.>\n");


            while(true) {
                System.out.print("\n-옵션을 선택해주세요-\n\n1번 : 계좌조회.\n2번 : 계좌이체.\n");
                input = scan.nextInt();


                switch(input) {

                    case 1: 	System.out.print("이름 :"+HHJ.HHJName()+"\n계좌번호 : "+HHJ.HHJbankAcc()+"\n계좌잔액 :"+df.format(HHJ.getHHJbal())+"원\n\n");
                        break;

                    case 2:	{System.out.println("상대방 계좌번호를 입력하십시오.\n");
                        input=scan.nextInt();
                        if(input==15248){

                            System.out.println("얼마를 송금하시겠습니까?\n");
                            input = scan.nextInt();
                            HHJ.setHHJbal(HHJ.getHHJbal()-input);
                            MHJ.setMHJbal(MHJ.getMHJbal()+input);
                            System.out.println("\n하효정님 계좌잔액 :"+df.format(HHJ.getHHJbal())+"원"+"\n문현종님 계좌잔액 :"+df.format(MHJ.getMHJbal())+"원");
                        }else{
                            break;
                        }
                    }
                    break;

                    default : System.out.println("없는 계좌번호입니다.\n\n");
                }

                System.out.println("계속 진행 하시려면 3번.\n종료하시려면 4번을 선택해주십시오.");
                input = scan.nextInt();
                if(input!=3){
                    break;
                }

            }
        }

        if(input == 15248){
            System.out.println("\n<반갑습니다 문현종님 로그인 되었습니다.>\n");


            while(true) {
                System.out.print("\n-옵션을 선택해주세요-\n\n1번 : 계좌조회.\n2번 : 계좌이체.\n");
                input = scan.nextInt();


                switch(input) {

                    case 1: 	System.out.print("이름 :"+MHJ.MHJName()+"\n계좌번호 : "+MHJ.MHJbankAcc()+"\n계좌잔액 :"+df.format(MHJ.getMHJbal())+"원\n\n");
                        break;

                    case 2:	{System.out.println("상대방 계좌번호를 입력하십시오.\n");
                        input=scan.nextInt();
                        if(input==15247){

                            System.out.println("얼마를 송금하시겠습니까?\n");
                            input = scan.nextInt();
                            HHJ.setHHJbal(HHJ.getHHJbal()+input);
                            MHJ.setMHJbal(MHJ.getMHJbal()-input);
                            System.out.println("\n문현종님 계좌잔액 :"+df.format(MHJ.getMHJbal())+"원"+"\n하효정님 계좌잔액 :"+df.format(HHJ.getHHJbal())+"원");
                        }else{
                            break;
                        }
                    }
                    break;

                    default : System.out.println("없는 계좌번호입니다.\n\n");
                }

                System.out.println("계속 진행 하시려면 3번.\n종료하시려면 4번을 선택해주십시오.");
                input = scan.nextInt();
                if(input!=3){
                    break;
                }

            }
        }
    }
}
