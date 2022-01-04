package org.opentutorials.javatutorials.method;

public class MethodDemo1 {

    public static void numbering() {
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;      // i는 0부터9까지 출력
        }
    }
    // numbering 이라는 메소드를 정의


    public static void main(String[] args) {
        // main 도 메소드, 우리가 코드를 실행시키고 싶으면 여기에 위치시켜야함.
        // + main 메소드는 자바-개발자 와의 약속, 실행하고자하는 명령이 있다면 public static void main 의 본문에 하고자하는 작업을 위치시키도록 약속.
        numbering(); // numbering 이라는 메소드를 호출, 호출하면 0부터 9까지의 결과값이 출력됨.
        // 그리고 만약에, numbering(); 을 1번이 아닌, 3번을 호출하게 된다면 0부터 9까지의 결과값이 3번이 출력된다. 단순 호출로 반복이 가능.
    }

}

/**
 * 메소드의 정의와 호출 공부
 */