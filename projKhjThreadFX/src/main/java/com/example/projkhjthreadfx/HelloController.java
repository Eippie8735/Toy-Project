package com.example.projkhjthreadfx;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class HelloController {

    @FXML
    private ListView<String> lVJobQ;

    @FXML
    private ListView<String> lvWorker1;

    @FXML
    private ListView<String> lvWorker2;

    @FXML
    private ListView<String> lvWorker3;

    @FXML
    private TextField txtJobNm;

    @FXML
    void mAddJob(ActionEvent event) {
        // 새로운 할 일 추가
        CJobs.mGetJobNm(this.txtJobNm.getText());
        // 해야 할 일 화면에 display
        this.mLstToLv(CJobs.getmArrJobQ() , this.lVJobQ);
    }

    @FXML
    void mWork1(ActionEvent event) {
        CWorker objWorker1 = new CWorker("건우");

        Thread th1 = new Thread(() -> {
            while (objWorker1.mArrWorkerList.size() < objWorker1.MAXJOBCNT){
                // 1. 자기의 해야 할 일을 잡큐에서 가져온다.
                objWorker1.mWork();

                // 2. 자기가 한 일의 내역을 화면에 뿌려준다.
                this.mLstToLv(objWorker1.mArrWorkerList , this.lvWorker1);

                // 3. 전체 jobQ 내역도 화면에 뿌려준다.
                this.mLstToLv(CJobs.getmArrJobQ(), this.lVJobQ);

                // 4. 휴식시간 부여
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th1.setName("쓰레드건우");
        th1.start();

    }

    @FXML
    void mWork2(ActionEvent event) {
        CWorker objWorker2 = new CWorker("건우널");

        Thread th2 = new Thread(() -> {
            while (objWorker2.mArrWorkerList.size() < objWorker2.MAXJOBCNT){
                // 1. 자기의 해야 할 일을 잡큐에서 가져온다.
                objWorker2.mWork();

                // 2. 자기가 한 일의 내역을 화면에 뿌려준다.
                this.mLstToLv(objWorker2.mArrWorkerList , this.lvWorker2);

                // 3. 전체 jobQ 내역도 화면에 뿌려준다.
                this.mLstToLv(CJobs.getmArrJobQ(), this.lVJobQ);

                // 4. 휴식시간 부여
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th2.setName("쓰레드건우널");
        th2.start();
    }

    @FXML
    void mWork3(ActionEvent event) {
        CWorker objWorker3 = new CWorker("건우notfound");

        Thread th3 = new Thread(() -> {
            while (objWorker3.mArrWorkerList.size() < objWorker3.MAXJOBCNT){
                // 1. 자기의 해야 할 일을 잡큐에서 가져온다.
                objWorker3.mWork();

                // 2. 자기가 한 일의 내역을 화면에 뿌려준다.
                this.mLstToLv(objWorker3.mArrWorkerList , this.lvWorker3);

                // 3. 전체 jobQ 내역도 화면에 뿌려준다.
                this.mLstToLv(CJobs.getmArrJobQ(), this.lVJobQ);

                // 4. 휴식시간 부여
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th3.setName("쓰레드건우notfound");
        th3.start();
    }

    void mLstToLv(List<String> pLst, ListView pLv){

        // 윈도우 관리 쓰레드에 반영할 부분 등록.
        Platform.runLater(() -> {

            // 리스트 자료를 ---> 리스트뷰에 넣는
            ObservableList<String> lObslt = pLv.getItems();
            lObslt.setAll(pLst); // 리스트 --> ObservableList
            pLv.setItems(lObslt);
        });


    }

}
