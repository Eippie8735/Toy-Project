public class CFruit {
    private String mName; // 과일이름
    private int mCnt; // 개수

    // 생성자의 이름은 클래스 명과 같다/ 리턴 타입이 없다.
    public CFruit(String mName, int mCnt) {
        this.mName = mName;
        this.mCnt = mCnt;
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmCnt() {
        return mCnt;
    }

    public void setmCnt(int mCnt) {
        this.mCnt = mCnt;
    }

    //클래스 외부에서 쓸려면 퍼블릭
    // 보이드는 반환값 없음
    public void mShow(int pChange, String pJob){
        System.out.printf("과일 이름 : %s / %d개 %s 과일 개수 : %d\n", this.mName, pChange, pJob, this.mCnt);
        //숫자형은 d, 디짓이라고 읽음. 이거 모르면 디짐


    }



    public void mEat(int pCnt){
        this.mCnt -= pCnt;
        this.mShow(pCnt,"먹음");
    }

    public void mBuy(int pCnt){
        this.mCnt += pCnt;
        this.mShow(pCnt,"구입");
    }
}
