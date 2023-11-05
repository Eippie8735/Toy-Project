package com.example.projkhjthreadfx;

import java.util.ArrayList;
import java.util.List;

public class CWorker {
    String mWorkerNm; // 일꾼 이름
    public final int MAXJOBCNT = 10;


    // 일꾼의 노동 내역
    List<String> mArrWorkerList = new ArrayList<>(); // 제너릭 타입?


    public CWorker(String mWorkerNm) {

        this.mWorkerNm = mWorkerNm;
    }

    void mWork() {
        // 일꾼 일을 시킴
        // 1. jobQ 에서 일을 받아온다.
        String lWork = CJobs.mServerWork();

        // 2. 받아온 일을 자기 일 내역에 본인 일 내역에 추가한다.
        this.mArrWorkerList.add(lWork);


    }

}
