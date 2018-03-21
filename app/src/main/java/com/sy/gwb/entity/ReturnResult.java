package com.sy.gwb.entity;

/**
 * Created by Erebus on 2017/6/5.
 * **********************************************************
 * ***********************  _ooOoo_  ************************
 * **********************  o8888888o  ***********************
 * **********************  88" . "88  ***********************
 * **********************  (| -_- |)  ***********************
 * **********************  O\  =  /O  ***********************
 * *******************  ____/`---'\____  ********************
 * *****************  .'  \\|     |//  `.  ******************
 * ****************  /  \\|||  :  |||//  \  *****************
 * ***************  /  _||||| -:- |||||-  \  ****************
 * ***************  |   | \\\  -  /// |   |  ****************
 * ***************  | \_|  ''\---/''  |   |  ****************
 * ***************  \  .-\__  `-`  ___/-. /  ****************
 * *************  ___`. .'  /--.--\  `. . __  ***************
 * **********  ."" '<  `.___\_<|>_/___.'  >'"".  ************
 * *********  | | :  `- \`.;`\ _ /`;.`/ - ` : | |  **********
 * *********  \  \ `-.   \_ __\ /__ _/   .-` /  /  **********
 * ****  ======`-.____`-.___\_____/___.-`____.-'======  *****
 * ***********************  `=---='  ************************
 * ****  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  *****
 * ****************** 佛祖保佑*******永无BUG ******************
 * **********************************************************
 */
public class ReturnResult {


    /**
     * message : 还车成功
     * content : {"transInfo":{"duration":"00:05","distance":0,"borrowTime":1506589807000,"bikeNo":520000106,"calorie":0,"returnTime":1506589812000},"actionInfo":{"description":"","actionType":"","activityId":"","sharePlatform":"","shareTitle":"","sharePic":"","shareContent":"","isAction":"","prizePic":"","displayPic":"","displayWords":"","actionUrl":"","shareUrl":"","inmobiId":"","returnActionType":0},"rank":"2","user":{"id":"2c9094435e5529cb015e55b250410012","realName":"钱凯夏","channel":"","mBorrowBicycle":0,"statusChangeTime":1506589812000,"changBatteryStatus":0,"certificatePositive":"","certificateNegative":"","accountStatus":3,"creditScore":479,"loginState":2,"phone":"13584820859","deposit":99,"addTime":1504676303000,"idCardnum":"320586199307285438","guesterState":0,"loginTime":1506585530000,"integral":0,"appVersion":"Android V1.1.4","cityNo":"","nickname":"99宝贝","picurl":"","nationality":"中国","userLevel":0,"openDate":"","validateDate":"","balance":0,"gender":1,"luckyMoney":983.7500000000001,"age":24,"alipayAccount":"","registerCity":"上海市","imei":"5451b345f80f1d94cf7ecc8a807b639c","mac":"6e41c664af6c73c4ac3c612fa5708a45","idfa":"A2532CE2-6F94-46C0-9E81-DB9A8FF73FFB","mBorrowBicycleDate":1506589807000,"mPhoneSystemVersion":"Redmi 4X Android-6.0.1"}}
     * code : 1
     */

    private String message;
    private Content content;
    private int code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class Content {
        /**
         * transInfo : {"duration":"00:05","distance":0,"borrowTime":1506589807000,"bikeNo":520000106,"calorie":0,"returnTime":1506589812000}
         * actionInfo : {"description":"","actionType":"","activityId":"","sharePlatform":"","shareTitle":"","sharePic":"","shareContent":"","isAction":"","prizePic":"","displayPic":"","displayWords":"","actionUrl":"","shareUrl":"","inmobiId":"","returnActionType":0}
         * rank : 2
         * user : {"id":"2c9094435e5529cb015e55b250410012","realName":"钱凯夏","channel":"","mBorrowBicycle":0,"statusChangeTime":1506589812000,"changBatteryStatus":0,"certificatePositive":"","certificateNegative":"","accountStatus":3,"creditScore":479,"loginState":2,"phone":"13584820859","deposit":99,"addTime":1504676303000,"idCardnum":"320586199307285438","guesterState":0,"loginTime":1506585530000,"integral":0,"appVersion":"Android V1.1.4","cityNo":"","nickname":"99宝贝","picurl":"","nationality":"中国","userLevel":0,"openDate":"","validateDate":"","balance":0,"gender":1,"luckyMoney":983.7500000000001,"age":24,"alipayAccount":"","registerCity":"上海市","imei":"5451b345f80f1d94cf7ecc8a807b639c","mac":"6e41c664af6c73c4ac3c612fa5708a45","idfa":"A2532CE2-6F94-46C0-9E81-DB9A8FF73FFB","mBorrowBicycleDate":1506589807000,"mPhoneSystemVersion":"Redmi 4X Android-6.0.1"}
         */

        private TransRecordListInfo transRecordInfo;
        private ActionInfo actionInfo;
        private String rank;
        private User user;

        public TransRecordListInfo getTransRecordInfo() {
            return transRecordInfo;
        }

        public void setTransRecordInfo(TransRecordListInfo transRecordInfo) {
            this.transRecordInfo = transRecordInfo;
        }

        public ActionInfo getActionInfo() {
            return actionInfo;
        }

        public void setActionInfo(ActionInfo actionInfo) {
            this.actionInfo = actionInfo;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }
}
