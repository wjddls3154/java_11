package org.opentutorials.javatutorials.method;

public class MethodDemo6 {

    // 아래 numbering 은 메소드 이름, 그리고 String 은 우리가 numbering 이라는 메소드가 return 할때 넘겨받는 값이, 반드시 문자열이라는것을 의미하는것. * 상황에 따라 int 나 다른 데이터 타입으로도 받을수있을것.
    public static String numbering(int init, int limit) { // 아래 main 에서 init 과 limit 에 입력값 1과 5를 주었다.

        int i = init; // i = init = 1

        String output = ""; // output 이라는 빈 문자열을 만듬
        // 조건에 해당하는 숫자들을 output 이라는 변수에 담기 위해서 변수에 "" 라는 빈값을 주었다.

        while (i < limit) { // i = 1 , limit = 5 로 시작

            output += i; // output += i 의 의미는 output = output + i
                         // 숫자를 화면에 출력안하고 변수 output 에 담았다.
            i++;
        }

    return output;
        /**
         * 메소드의 입력값으로(입력값 없을수도있음) 동작된 결과를 메소드 밖으로 돌려준다 (return)
         * 자바는 return 에서 무조건 종료시킴 뒤에 뭐가있건. 그리고 return 뒤에 있는 값(output)에 담겨있는 문자열을 메소드 외부로 반환해줌. 1 2 3 4
         * 즉, 이런경우처럼 값을 메소드 외부로 반환할 경우 return 을 사용한다.
         */



    }

    // * 꿀팁 : 메소드를 이해하고싶다면 복잡한 정의보다, 메소드를 어떻게 사용하고, 메소드의 입력값은 무엇이고 출력값은 무엇인지 알수있는 main 을 본다.
    // void 가 메소드 이름 앞에 붙게되면, 이 메소드의 리턴값은 존재하지 않는다 라는 의미.(return 사용안함.)
    public static void main(String[] args){
          String result = numbering(1,5);
        /**
         * 제일 처음 인자의 입력값 1과 5, 위 numbering 에 넣게 되면 위 numbering 메소드의 i와 limit 에 각각 1과 5가 들어가서 1부터 5미만의 값이 됨.
         * 그리고, 메소드 numbering 이 동작을 다 끝내고 리턴한 값인 1 2 3 4 가, 마지막으로 String(문자열) 변수 result 에 담긴다.
         * numbering 이라는 메소드가 반드시 문자열 String 으로 받도록 되어있기 때문에, numbering 의 리턴한 값을 담는 result 또한 반드시 문자열 형식이 되어야만 한다.
         */

            System.out.println(result);
            // 변수 result 의 값을 화면에 출력한다.

    }

}

/**
 *  마지막으로, return 을 공부하면서 굳이 이렇게 데이터를 리턴하는 이유는 뭘까 ? 결론적으론, 부품으로서의 가치를 높이기 위해서이다.
 *  public static void numbering(int init, int limit) {
 *         int i = init;
 *         while (i < limit) {
 *             System.out.println(i);
 *             i++;
 *         }
 *     }
 * 만약, 이처럼 메소드 안에서 화면에 출력하는 출력문을 넣어버리면, 다르게 그 내용을 이메일로 보내라던지, 파일에 기록하라던지 , 또는 3개를 다 하라던지 라고 조건을 바꿔버린다면,
 * 이미, numbering 이라는 메소드 안에  이미 그것을 출력하는 방법이 내장되어있기 때문에, 이 메소드 하나를 가지고 그 모든걸 처리할수없어서, 별도의 메소드를 여러개를 또 만들어야 한다.
 * 이런경우 numbering 이라는 메소드가 반드시 출력만 한다면 문제가 안되지만, 여기저기 사용해야 할 때 사용을 할수 없으면 부품으로서의 가치가 떨어진다는 소리다.
 * 바로, 그런이유 때문에 출력문을 main 으로 꺼내고, numbering 의 저장된값을 return 으로 돌려줌으로써 다른 방법으로도 쓸수있게 한다.
 * ex) String result = numbering(1,5);
 * 예를들어 println(result) , mail(result) , file(result) 라던가 ~
 */