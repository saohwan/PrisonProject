package PrisonDataSystem.cli.prison.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prison {



    //기본 필드
    private int prisonerNumber; // 죄수고유번호!
    private String name;    //이름
    private int age;        //나이
    private String area;    //지역
    private String aCharge; //죄목
    private int jailTime;   //수감시간
    private LocalDateTime endJailTime; //끝나는 수감시간
    private LocalDateTime startJailTime;
    private boolean jailed; //수감상태

    private static int uniqueNumber;

    // 생성자 (초기화까지~)
    public Prison(String name, int age, String area, String aCharge, int jailTime) {
        this.prisonerNumber = ++uniqueNumber;
        this.name = name;
        this.age = age;
        this.area = area;
        this.aCharge = aCharge;
        this.jailTime = jailTime;
        this.startJailTime = LocalDateTime.now();
        this.endJailTime = startJailTime.plusHours(jailTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getaCharge() {
        return aCharge;
    }

    public void setaCharge(String aCharge) {
        this.aCharge = aCharge;
    }

    public int getJailTime() {
        return jailTime;
    }

    public void setJailTime(int jailTime) {
        this.jailTime = jailTime;
    }

    public LocalDateTime getEndJailTime() {
        return endJailTime;
    }

    public void setEndJailTime(LocalDateTime endJailTime) {
        this.endJailTime = endJailTime;
    }



    //인스턴스 메소드 (주체 객체가 필요함 . bi.toInfo!!)
    public String toInfo() {
        return String.format("**** 수감자 정보 **** \n 이름 : %s \n 나이 : %d " +
                "\n 지역 : %s \n 죄목 : %s \n 수감시간 : %d, 수감 시작 날짜: %s, \n, " +
                "출소 예정일: %s \n, 수감상태: %s \n ******************** ", name, age, area, aCharge, jailTime, startJailTime,endJailTime, jailed);
    }


}
