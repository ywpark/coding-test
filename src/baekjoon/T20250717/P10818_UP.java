package baekjoon.T20250717;

/**
 * https://www.acmicpc.net/problem/10818
 *
 * 위의 문제를 최적화된 소스로 보임
 *
 */
public class P10818_UP {

    /**
     * 2^23 버퍼사이즈 정의
     * => 문제 정의에서 정수의 개수는 1 <= N <= 1,000,000
     * => 각 정수는 -1,000,000 <= X <= 1,000,000
     * => 각 정수는 공백으로 구분
     * 최대 9 : 1번 ( -1000000 + ' ' 의 크기)
     * 최대 8 : 999,999번 ( -999999 ~ 999999 + ' ' )
     * 최대 7 : 1번 ( 1000000 )
     *
     * 그렇기에 최대 버퍼 사이즈는 대략 8,000,008 이기 때문에 2^23 으로 정의함
     */
    static int BUFFERSIZE = 1<<23;

    // buffer 배열의 현재 인덱스 위치
    static int l = 0;

    // 바이트 배열 초기화
    static byte[] buffer = new byte[BUFFERSIZE];

    public static void main(String[] args) throws Exception {

        // 표준 입력 스트림의 데이터를 buffer 바이트 배열에 한 번에 읽어들인다.
        System.in.read(buffer);
        int N = r();
        int number = r(), maximum = number, minimum = number;
        for(int i = l; i < N; i++) {
            number = r();
            if(number > maximum) {
                maximum = number;
            }
            else if (minimum > number) {
                minimum = number;
            }
        }

        System.out.printf("%d %d", minimum, maximum);
    }

    /**
     *
     * 바이트 배열에서 읽은 문자를 정수로 파싱하여 반환하는 함수
     * 일반적으로 Scanner , BufferedReader보다 훨씬 빠르게 동작함
     *
     * @return
     */
    static int r() {

        // a 에 l 위치의 바이트를 저장하고 l 을 증가시킴
        // a 에는 아스키코드 의 십진수 값이 들어감
        int t, a = buffer[l++];
        // 음수 여부 flag
        boolean c = false;
        // 첫 바이트가 - 문자이면 flag 값 수정하고 a 에 l 위치의 바이트 저장 후 l 을 증가시킴
        if(a == '-') {
            c = true;
            a = buffer[l++];
        }

        /**
         * 아스키 코드 값을 실제 숫자 값으로 변환
         * 아스키 코드 '0'은 48 이고 여기에 &(비트연산) 15을 하면 정수 0 이 나온다.
         * 1100 0000 & 0000 1111 = 0 (정수 )
         */
        a = a & 15;

        /**
         * 32 의 의미 ?
         *  아스키코드 표에서 32 는 Space 이다
         */
        while((t = buffer[l++]) > 32) {

            /**
             * 정수를 빠르게 구하기 위한 코드
             * 아래 내용을 변환하면
             *   a = a * 10 + (t - '0')
             *   a<<3 => a * 8
             *   a<<1 => a * 2
             */
            a = (a<<3) + (a<<1) + (t & 15);
        }

        // flag 에 따라서 음수 혹은 양수로 정수값 리턴
        return c ? -a : a;

    }
}
