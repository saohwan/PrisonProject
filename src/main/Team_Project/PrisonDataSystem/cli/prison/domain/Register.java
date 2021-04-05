package PrisonDataSystem.cli.prison.domain;

import java.time.LocalDate;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("신규 수감자를 등록하세요: ");
        String name = sc.nextLine();

        System.out.println("수감자의 나이를 등록하세요: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("수감자의 지역 기입하세요: ");
        String area = sc.nextLine();

        System.out.println("수감자의 죄목을 등록하세요: ");
        String aCharge = sc.nextLine();

        System.out.println("수감자의 형량을 등록하세요: ");
        int jailTime = sc.nextInt();
        System.out.println();

        Prison bi = new Prison(name, age, area, aCharge, jailTime);


        System.out.println(bi.toInfo());
    }
}

