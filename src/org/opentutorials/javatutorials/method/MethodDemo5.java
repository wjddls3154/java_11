package org.opentutorials.javatutorials.method;

public class MethodDemo5 {

    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }

    }

    public static void main(String[] args){
        numbering(3,5); // 인자의 입력값 3과 5
        /**
         * 여기서 3은 init, 5는 limit 의 값에 해당한다.
         * 그래서 while 의 반복문에 i에 3이 들어가고 limit에 5가 들어가서, 3부터 5미만의 결과값 출력이 3,4 가 나오는것이다.
         * 여러개의 입력값을 갖고싶으면 인자를 받을 매개변수를 순서대로 배치하고, 또한 인자와 인자 사이에 콤마를 구분하여 순서대로 사용하면 된다.
         */
    }

}
