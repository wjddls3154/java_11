package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

    public static void numbering(int limit) { // 여기서 int limit 의 자리에 들어가는걸 매개변수(parameter) 라고 한다.
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }

    }

    public static void main(String[] args){
    numbering(5); // numbering 의 괄호에 들어가는것을 인자(argument) 라 한다.
                       // 여기선, 인자의 입력값으로 5를 사용함.
        /**
         * numbering 에 5 라고 적으면 위의 numbering 의 limit 에 5가 들어가게 되고,
         * 그럼 while의 반복문에 i<5 가되서 0,1,2,3,4 가 출력이되는것이다.
         */
    }

}
