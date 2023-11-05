package com.example.projkhjthreadfx;

import java.util.ArrayList;
import java.util.List;

public class CJobs {
    // 작업번호
    private static int mJopNum = 0;

    // 해야 할 일 목록
    private static List<String> mArrJobQ = new ArrayList<>();

    public static  String mServerWork() { // 클래스변수는 한군데에서 사용하기 위해 만들어진다.

        String lreturn;
        if (mArrJobQ.size() > 0)
        { // 자료가 있을때만 제거하도록 한다.
            lreturn = mArrJobQ.remove(0);
        }

        else{
            lreturn = "";
        }
        return lreturn;

    }

    synchronized public static String mGetJobNm(String pJobNm) {
        mJopNum++;
        String lJobNm = pJobNm + mJopNum; // + concat 문자열과 숫자를 더함
        mArrJobQ.add(lJobNm);
        //하나만 들어오게 받음
        return lJobNm;
    }

    public static List<String> getmArrJobQ() {
        return mArrJobQ;
    }

    public static void setmArrJobQ(List<String> mArrJobQ) {
        CJobs.mArrJobQ = mArrJobQ;
    }
}
