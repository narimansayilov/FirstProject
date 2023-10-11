import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Zero = "Sıfır", One = "Bir", Two = "İki", Three = "Üç", Four = "Dört", Hundred = "Yüz", Thousand = "Min";
        String Five = "Beş", Six = "Altı", Seven = "Yeddi", Eight ="Səkkiz", Nine ="Doqquz";
        String Ten = "On", Twenty = "İyirmi", Thirty = "Otuz", Fourty = "Qırx", Fifty = "Əlli", Sixty = "Altmış", Seventy = "Yetmiş", Eighty ="Səksən", Ninty = "Doxsan";
        int a,b,c;
        if(n>=0 && n<=9)
        {
            switch(n) {
                case 0:
                    System.out.print(Zero);
                case 1:
                    System.out.print(One);
                    break;
                case 2:
                    System.out.print(Two);
                    break;
                case 3:
                    System.out.print(Three);
                    break;
                case 4:
                    System.out.print(Four);
                    break;
                case 5:
                    System.out.print(Five);
                case 6:
                    System.out.print(Six);
                    break;
                case 7:
                    System.out.print(Seven);
                    break;
                case 8:
                    System.out.print(Eight);
                    break;
                case 9:
                    System.out.print(Nine);
                    break;
            }
        }
//        else if(n>=10 && n<=99)
//        {
//            a=n%10;
//            b=n/10;
//            if(a==0)
//            {
//                switch(b) {
//                    case 1:
//                        System.out.print(Ten);
//                        break;
//                    case 2:
//                        System.out.print(Twenty);
//                        break;
//                    case 3:
//                        System.out.print(Thirty);
//                        break;
//                    case 4:
//                        System.out.print(Fourty);
//                        break;
//                    case 5:
//                        System.out.print(Fifty);
//                        break;
//                    case 6:
//                        System.out.print(Sixty);
//                        break;
//                    case 7:
//                        System.out.print(Seventy);
//                        break;
//                    case 8:
//                        System.out.print(Eighty);
//                        break;
//                    case 9:
//                        System.out.print(Ninty);
//                        break;
//                }
//            }
//            else
//            {
//                switch(b) {
//                    case 1:
//                        System.out.print(Ten + " ");
//                        break;
//                    case 2:
//                        System.out.print(Twenty + " ");
//                        break;
//                    case 3:
//                        System.out.print(Thirty + " ");
//                        break;
//                    case 4:
//                        System.out.print(Fourty + " ");
//                        break;
//                    case 5:
//                        System.out.print(Fifty + " ");
//                        break;
//                    case 6:
//                        System.out.print(Sixty + " ");
//                        break;
//                    case 7:
//                        System.out.print(Seventy + " ");
//                        break;
//                    case 8:
//                        System.out.print(Eighty + " ");
//                        break;
//                    case 9:
//                        System.out.print(Ninty + " ");
//                        break;
//                }
//                switch(a) {
//                    case 1:
//                        System.out.print(One);
//                        break;
//                    case 2:
//                        System.out.print(Two);
//                        break;
//                    case 3:
//                        System.out.print(Three);
//                        break;
//                    case 4:
//                        System.out.print(Four);
//                        break;
//                    case 5:
//                        System.out.print(Five);
//                        break;
//                    case 6:
//                        System.out.print(Six);
//                        break;
//                    case 7:
//                        System.out.print(Seven);
//                        break;
//                    case 8:
//                        System.out.print(Eight);
//                        break;
//                    case 9:
//                        System.out.print(Nine);
//                        break;
//                }
//            }
//
//        }
//        else if(n>=100 && n<=999 )
//        {
//            a=n%10;
//            b=n/10%10;
//            c=n/100;
//            if(a==0 && b==0)
//            {
//                switch(c)
//                {
//                    case 1:
//                        System.out.print(Hundred);
//                        break;
//                    case 2:
//                        System.out.print(Two + " " + Hundred);
//                        break;
//                    case 3:
//                        System.out.print(Three + " " + Hundred);
//                        break;
//                    case 4:
//                        System.out.print(Four + " " + Hundred);
//                        break;
//                    case 5:
//                        System.out.print(Five + " " + Hundred);
//                        break;
//                    case 6:
//                        System.out.print(Six + " " + Hundred);
//                        break;
//                    case 7:
//                        System.out.print(Seven + " " + Hundred);
//                        break;
//                    case 8:
//                        System.out.print(Eight + " " + Hundred);
//                        break;
//                    case 9:
//                        System.out.print(Nine + " " + Hundred);
//                        break;
//                }
//
//            }
//            else if(b==0 && a!=0)
//            {
//                switch(c)
//                {
//                    case 1:
//                        System.out.print(Hundred + " ");
//                        break;
//                    case 2:
//                        System.out.print(Two + " " + Hundred + " ");
//                        break;
//                    case 3:
//                        System.out.print(Three + " " + Hundred + " ");
//                        break;
//                    case 4:
//                        System.out.print(Four + " " + Hundred + " ");
//                        break;
//                    case 5:
//                        System.out.print(Five + " " + Hundred + " ");
//                        break;
//                    case 6:
//                        System.out.print(Six + " " + Hundred + " ");
//                        break;
//                    case 7:
//                        System.out.print(Seven + " " + Hundred + " ");
//                        break;
//                    case 8:
//                        System.out.print(Eight + " " + Hundred + " ");
//                        break;
//                    case 9:
//                        System.out.print(Nine + " " + Hundred + " ");
//                        break;
//                }
//                switch(a) {
//                    case 0:
//                        System.out.print(Zero);
//                        break;
//                    case 1:
//                        System.out.print(One);
//                        break;
//                    case 2:
//                        System.out.print(Two);
//                        break;
//                    case 3:
//                        System.out.print(Three);
//                        break;
//                    case 4:
//                        System.out.print(Four);
//                        break;
//                    case 5:
//                        System.out.print(Five);
//                        break;
//                    case 6:
//                        System.out.print(Six);
//                        break;
//                    case 7:
//                        System.out.print(Seven);
//                        break;
//                    case 8:
//                        System.out.print(Eight);
//                        break;
//                    case 9:
//                        System.out.print(Nine);
//                        break;
//                }
//            }
//            else
//            {
//                switch(c)
//                {
//                    case 1:
//                        System.out.print(Hundred + " ");
//                        break;
//                    case 2:
//                        System.out.print(Two + " " + Hundred + " ");
//                        break;
//                    case 3:
//                        System.out.print(Three + " " + Hundred + " ");
//                        break;
//                    case 4:
//                        System.out.print(Four + " " + Hundred + " ");
//                        break;
//                    case 5:
//                        System.out.print(Five + " " + Hundred + " ");
//                        break;
//                    case 6:
//                        System.out.print(Six + " " + Hundred + " ");
//                        break;
//                    case 7:
//                        System.out.print(Seven + " " + Hundred + " ");
//                        break;
//                    case 8:
//                        System.out.print(Eight + " " + Hundred + " ");
//                        break;
//                    case 9:
//                        System.out.print(Nine + " " + Hundred + " ");
//                        break;
//                }
//                switch(b) {
//                    case 1:
//                        System.out.print(Ten + " ");
//                        break;
//                    case 2:
//                        System.out.print(Twenty + " ");
//                        break;
//                    case 3:
//                        System.out.print(Thirty + " ");
//                        break;
//                    case 4:
//                        System.out.print(Fourty + " ");
//                        break;
//                    case 5:
//                        System.out.print(Fifty + " ");
//                        break;
//                    case 6:
//                        System.out.print(Sixty + " ");
//                        break;
//                    case 7:
//                        System.out.print(Seventy + " ");
//                        break;
//                    case 8:
//                        System.out.print(Eighty + " ");
//                        break;
//                    case 9:
//                        System.out.print(Ninty + " ");
//                        break;
//                }
//                switch(a) {
//                    case 1:
//                        System.out.print(One);
//                        break;
//                    case 2:
//                        System.out.print(Two);
//                        break;
//                    case 3:
//                        System.out.print(Three);
//                        break;
//                    case 4:
//                        System.out.print(Four);
//                        break;
//                    case 5:
//                        System.out.print(Five);
//                        break;
//                    case 6:
//                        System.out.print(Six);
//                        break;
//                    case 7:
//                        System.out.print(Seven);
//                        break;
//                    case 8:
//                        System.out.print(Eight);
//                        break;
//                    case 9:
//                        System.out.print(Nine);
//                        break;
//                }
//            }
//        }
    }

}
