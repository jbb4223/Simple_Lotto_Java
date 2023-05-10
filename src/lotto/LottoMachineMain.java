package lotto;

public class LottoMachineMain {
    public static void main(String[] args) {

//        Ball b1 = new Ball(1);
//        Ball b2 = new Ball(2);
        // 변수가 45개 필요하다.
        Ball[] balls = new Ball[45];
        for (int i=0; i<LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i+1);
        }


        // LottoMachine인스턴스가 생성된다.
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for (int j=0; j<result.length; j++) {
            System.out.println(result[j].getNumber());
        }
    }
}
