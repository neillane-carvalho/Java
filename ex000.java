import java.util.Scanner;

public class ex000 {
//    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//            (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

    public static void main(String[] args) {
        leituraCalculo();


    }

    public static void leituraCalculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade em Anos - mês - dias(sucessivamente): ");
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        int dia = scanner.nextInt();

        ano = ano * 365;
        mes = mes *30;

        int diasTotal = ano + mes + dia;
        System.out.println("Você vciveu " + diasTotal + " dias");
    }


}
