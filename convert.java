import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change=3;
        double zloty;
        double grn;
        while(change!=0)
        {
        System.out.println("Це конвертор гривні злоті, будь ласка оберіть операцію\n 1. Конвертувати гривні в злоті\n 2.Конвертувати злоті в гривні\n Для виходу напишіть 0");
        change = sc.nextInt();
        if(change==1)
        {
            double result;
            System.out.println("Введіть сумму в гривнях:");
            grn=sc.nextDouble();
            result = ((double) grn/8.49);
            System.out.println(grn+" гривень це "+result+"у злотих");
        }
        else if(change==2){
            double result;
            System.out.println("Введіть сумму в злотих:");
            zloty=sc.nextDouble();
            result=((double)zloty*8.49);
            System.out.println(zloty+" злотих це "+result+"у гривнях");
        }
        else if(change==0)
        {
            break;
        }
    }
    }
}
