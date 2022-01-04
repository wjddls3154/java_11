package org.opentutorials.javatutorials.method;

public class MethodDemo3 {

    public static void numbering() {
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;      // i는 0부터9까지 출력
        }
    }
    // numbering 이라는 메소드 정의

    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
        // numbering 이라는 메소드를 5번 호출, 호출하면 0부터 9까지의 결과값이 5번 출력됨.
        // 메소드는 ★ 이미 정의해놓은 로직을 재활용할수있고 ★ , 코드량이 줄어들며, 유지보수에 유리한 장점을 가지고 있다.
    }

}
