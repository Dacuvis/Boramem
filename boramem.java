import java.util.*;

public class boramem {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();

    String[] responseDekat = { "Dekat", "Ya ampun itu dekat", "Cukup Dekat" };
    int acak = (ran.nextInt(responseDekat.length));
    String tunjuk = responseDekat[acak];

    String[] responseMid = { "Hmm... lumayan?", "Mid ass fuck", "Kurang jauh" };
    int acak1 = (ran.nextInt(responseMid.length));
    String tunjuk1 = responseMid[acak1];

    String[] responeseJauh = { "Itu jauh", "wow kamu kuat?", "Superman!!" };
    int acak2 = (ran.nextInt(responeseJauh.length));
    String tunjuk2 = responeseJauh[acak2];
    System.out.print("Jarak ingin di tempuh: ");
    int jarak = scan.nextInt();

    if (jarak <= 2000) {
      System.out.println("Jarak yang di tempuh: " + jarak + "Km");
      System.out.println("Bot: " + tunjuk);
    } else if (jarak <= 5000) {
      System.out.println("Jarak yang di tempuh: " + jarak + "Km");
      System.out.println("Bot: " + tunjuk1);
    } else if (jarak <= 10000) {
      System.out.println("Jarak yang di tempuh: " + jarak + "Km");
      System.out.println("Bot: " + tunjuk2);
    } else {
      System.out.println("Jarak yang di tempuh: " + jarak + "Km");
      System.out.println("Bot: Dewa!!");
    }
  }
}
