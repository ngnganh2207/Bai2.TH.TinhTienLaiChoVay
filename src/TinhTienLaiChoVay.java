import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money= 1.0;
        int month=1;
        double interset_rate=1.0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money=input.nextDouble();
        System.out.println("Enter number of month: ");
        month=input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate= input.nextDouble();
        double total_interset=0;
        //Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        for(int i=0;i<month;i++){
            total_interset+=money*(interset_rate/100/12)*3;
        }
        System.out.println("Total of interset: "+total_interset);
    }
}
