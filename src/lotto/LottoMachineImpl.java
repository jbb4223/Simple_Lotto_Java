package lotto;

import java.util.Arrays;

public class LottoMachineImpl implements LottoMachine {

    private Ball[] balls;

    // 1~45 공 넣기
    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    // 공 섞기
    @Override
    public void mix() {
        for (int i = 0; i < 5000; i++) {
            int x1 = (int)(Math.random() * MAX_BALL_COUNT);
            int x2 = (int)(Math.random() * MAX_BALL_COUNT);
            if(x1 != x2) {
                Ball tmp = balls[x1];   // 값을 치환할때는 같은 type의 임시변수가 필요하다.
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    // 공 꺼내기
    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[RETURN_BALL_COUNT];
        for (int i = 0; i < RETURN_BALL_COUNT; i++) {
            result[i] = balls[i];
        }
        return result;
    }
}
