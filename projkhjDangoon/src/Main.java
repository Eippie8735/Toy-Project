public class Main {
    public static void main(String[] args) {
        // 한웅
        CPeople objHanwong = new CPeople(null,null,"한웅", 500);
        objHanwong.mShow();

        // 웅녀
        CPeople objBear = new CPeople(null,null,"웅녀", 520);
        objBear.mShow();

        // 단군
        CPeople objDanGoon = new CPeople("한웅","웅녀","단군", 1000);
        objDanGoon.mShow();

        // 비서갑
        CPeople objBeSuaGab = new CPeople(null,null,"비서갑", 1050);
        objBeSuaGab.mShow();

        // 부후
        CPeople objBoHu = new CPeople("단군","비서갑","부후", 2000);
        objBoHu.mShow();
    }
}