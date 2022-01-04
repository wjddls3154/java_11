package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {

    // 하나의 메소드가 복수로 출력 하는 방법.
    public static String[] getMembers() {
        String[] members = {"최진혁", "최유빈", "한이람"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers(); // members 라는 배열 변수에 getMembers 의 배열 메소드를 넣음, 메소드에서 배열로 선언을 해서, 그걸 받는 그릇도 배열이 된다.
        System.out.println(members);
        // System.out.println(members[0]); 만약 이름을 나오게 하고싶다면 이런식으로 .
    }

}
