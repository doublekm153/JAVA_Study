package chap_05;

public class exam_8 {
    public static void main(String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        avg = sum / (double)count;

        /*작성위치
        * 주어진 배열의 전체 항목의 합과 평균값을 구해보세요.(중첩 for문 이용)
        * 실행결과
        * sum : 881
        * avg : 88.1
        * */

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
