public class Main {
    public static void main(String[] args) {
        CFruit objApple = new CFruit("사과", 20);
        objApple.mShow(0,"");

        CFruit objMango = new CFruit("망고", 50);
        objMango.mShow(0,"");

        CFruit objkiwi = new CFruit("키위", 30);
        objkiwi.mShow(0,"");

        // 망고 5개 먹었음
        objMango.mEat(5);
        // 사과 5개 먹었음
        objApple.mEat(5);
        // 누나가 망고 10개 구입
        objMango.mBuy(10);
        //누나가 키워 10개 먹음
        objkiwi.mEat(10);


    }
}