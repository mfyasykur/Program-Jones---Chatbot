import java.util.Scanner;

public class ProgramJones {
    public static void main(String[] args) throws InterruptedException {
        Scanner me = new Scanner(System.in);
        Scanner in = new Scanner((System.in));
        String input;
        int pilihan;

        System.out.println("Pilih 'temen' chat");
        System.out.println("1. Cewek");
        System.out.println("2. Cowok");
        System.out.print("Pilih: ");
        pilihan = in.nextInt();
        System.out.println("");

        System.out.println("Chat to Crush.bot");
        System.out.println("");
        String botSay = "Crush.bot : ";

        //Bot Cewek
        while (pilihan == 1){
            System.out.print("Me        : ");
            input = me.nextLine();
            if (input.contains("halo") || input.contains("hai")){
                delay();
                System.out.println(botSay + "hai :)");
            } else if (input.contains("kabar")) {
                delay();
                System.out.println(botSay + "baik :) kamu?");
            } else if (input.contains("aku") && input.contains("baik")) {
                delay();
                System.out.println(botSay + ":)");
            } else if (input.contains("udah") && input.contains("makan")) {
                delay();
                System.out.println(botSay + "udah");
            } else if (input.contains("lagi") && input.contains("apa")) {
                delay();
                System.out.println(botSay + "aku lagi rebahan");
            } else if (input.contains("udah") && input.contains("dulu")) {
                delay();
                System.out.println(botSay + "yah :(");
                System.exit(0);
            } else{
                delay();
                System.out.println(botSay + "maksudnya?");
            }
        }
        //Bot Cowok
        while (pilihan == 2){
            System.out.print("Me        : ");
            input = me.nextLine();
            if (input.contains("halo") || input.contains("hai")){
                delay();
                System.out.println(botSay + "hai cantik :)");
            } else if (input.contains("kabar")) {
                delay();
                System.out.println(botSay + "baik :) kamu apa kabar?");
            } else if (input.contains("aku") && input.contains("baik")) {
                delay();
                System.out.println(botSay + ":)");
            } else if (input.contains("udah") && input.contains("makan")) {
                delay();
                System.out.println(botSay + "udah dong");
                delay();
                System.out.println(botSay + "kamu udah makan?");
            } else if (input.contains("lagi") && input.contains("apa")) {
                delay();
                System.out.println(botSay + "aku lagi rebahan");
            } else if (input.contains("udah")) {
                delay();

            } else if (input.contains("udah") && input.contains("dulu")) {
                delay();
                System.out.println(botSay + "yah :(");
                System.exit(0);
            } else{
                delay();
                System.out.println(botSay + "hah?");
            }
        }
    }

    static void delay() throws InterruptedException {
        System.out.print("Crush.bot sedang mengetik...");
        Thread.sleep(3000);
        System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
    }
}
