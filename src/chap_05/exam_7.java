package chap_05;

public class exam_7 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        for(int i=0; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }

        /*작성 위치
        * 주어진 배열의 항목에서 최대값을 구해보세요(for문 이용)
        * 실행결과
        * max : 8*/

        System.out.println("max : " + max);

    }
}
