package org.opentutorials.javatutorials.method;

public class ReturnDemo {

    public static int one() {
        return 1; // 자바는 return 을 만나게되면 return 뒤에 따라오는값을 메소드 바깥으로 반환하면서 그 메소드의 실행을 완전히 종료시킴.
        // return 2;
        // return 3; 이처럼 뒤에 return 2,3이 있어도 앞에서 return 이 먼저 실행되기 때문에 의미가 없으며, 자바는 뒤의 코드들이 실행될수없는 코드임을 알기에 컴파일 조차도 거부.
    }



    public static void main(String[] args) {
        System.out.println(one()); // 제일 위 return 1 의 값 1이 출력된다.
    }

}
