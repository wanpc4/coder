//This code created just to test my knowledge on Java programming that I currently learn so far.
//In islam, 5 times prayer a day is important because it is the order of Allah SWT and all Muslims must perform it whether they like it or not.
//Here's the code, I write this in Bahasa Melayu:

import java.util.Scanner;

class solat{
    public static void main(String[] args)
    {

        System.out.println("Anda sudah laksanakan solat fardu?");
        System.out.println("a)Ya");
        System.out.println("b)Belum");

        Scanner respon = new Scanner(System.in);
        String jwpn = respon.nextLine();

        if (jwpn.equalsIgnoreCase("a") && jwpn.equalsIgnoreCase("A"))
        {
            System.out.println("Alhamdulillah, semoga Allah memberkati hidup anda.");
        }
        else if (jwpn.equalsIgnoreCase("b") && jwpn.equalsIgnoreCase("B"))
        {
            System.out.println("Pergi solat sekarang sebelum terlambat!");
        }
        else
        {
            System.out.println("Jawapan tidak tepat. Sila tekan 'a' atau 'b' untuk pilih jawapan.");
        }
    }
}
