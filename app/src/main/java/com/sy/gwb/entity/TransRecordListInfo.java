package com.sy.gwb.entity;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Erebus on 2017/11/15.
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
public class TransRecordListInfo implements Serializable {

    /*
    订单id，主键	string	id
    订单号	long	orderNum
    车号	    int	borrowBicycleNum
    借车时间	datetime	borrowDateTime
    用户id	string	userId
    还车时间	datetime	recessionDateTime
    交易标志（0：订单结束 1：订单开始 2：预订单）	int	transFlag
    订单交易金额	decimal	transMoney
    订单完成类型(0:未支付   1：已支付)	int	state
    用户积分	int	orderIntegral
    骑行距离(单位：米)	decimal	kilometers
    车辆类型（0:自行车 1:助力车）	int	bicycleType
    是否是蓝牙订单(0:gprs 1:蓝牙)	int	useBlueTooth
    卡路里	int	calorie
    时间（00:00）	string	duration
    用户类型	int	userType
    城市编号	int	cityNo
    优惠金额	decimal	discountMoney

     */
    /**
     * id : ed1c517a062c4f1a974bf536917b95e0
     * userId : 402881f65b98b25e015b98bac63a0002
     * orderNum : 151391464644877
     * borrowBatteryNum : 0
     * borrowDateTime : 1513914653000
     * recessionBatteryNum : 0
     * recessionDateTime : 1513914666000
     * transFlag : 1
     * transMoney : 0
     * state : 1
     * borrowBicycleNum : 520000465
     * recessionBicycleNum : 0
     * orderIntegral : 0
     * kilometers : 0
     * startPosition : 31.187189,121.380470
     * endPosition :
     * simNo : 686030010081
     * bicycleType : 0
     * useBlueTooth : 0
     * calorie : 0
     * duration : 00:13
     * userType : 0
     * cityNo : 13
     * fenceStatus : 0
     * discountMoney : 0
     * remarks :
     */
    private String id;
    private String userId;
    private long orderNum;
    private int borrowBatteryNum;
    private long borrowDateTime;
    private int recessionBatteryNum;
    private long recessionDateTime;
    private int transFlag;
    private double transMoney;
    private int state;
    private int borrowBicycleNum;
    private int recessionBicycleNum;
    private int orderIntegral;
    private double kilometers;
    private String startPosition;
    private String endPosition;
    private String simNo;
    private int bicycleType;
    private int useBlueTooth;
    private int calorie;
    private String duration;
    private int userType;
    private int cityNo;
    private int fenceStatus;
    private double discountMoney;
    private String remarks;
    private int isLocal = 0;

    // TODO: 2018/3/20 0020
//    @Column(name = "areaName")
//    private String areaName;
//    @Column(name = "phone")
//    private String phone;
//    @Column(name = "realName")
//    private String realName;
//    @Column(name = "uploadDate")
//    private String uploadDate;

    public void setTransMoney(double transMoney) {
        this.transMoney = transMoney;
    }

    public int getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(int isLocal) {
        this.isLocal = isLocal;
    }

//    public String getAreaName() {
//        return areaName;
//    }
//
//    public void setAreaName(String areaName) {
//        this.areaName = areaName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getRealName() {
//        return realName;
//    }
//
//    public void setRealName(String realName) {
//        this.realName = realName;
//    }
//
//    public String getUploadDate() {
//        return uploadDate;
//    }
//
//    public void setUploadDate(String uploadDate) {
//        this.uploadDate = uploadDate;
//    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

    public int isLocal() {
        return isLocal;
    }

    public void setLocal(int local) {
        isLocal = local;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(long orderNum) {
        this.orderNum = orderNum;
    }

    public int getBorrowBatteryNum() {
        return borrowBatteryNum;
    }

    public void setBorrowBatteryNum(int borrowBatteryNum) {
        this.borrowBatteryNum = borrowBatteryNum;
    }

    public long getBorrowDateTime() {
        return borrowDateTime;
    }

    public void setBorrowDateTime(long borrowDateTime) {
        this.borrowDateTime = borrowDateTime;
    }

    public int getRecessionBatteryNum() {
        return recessionBatteryNum;
    }

    public void setRecessionBatteryNum(int recessionBatteryNum) {
        this.recessionBatteryNum = recessionBatteryNum;
    }

    public long getRecessionDateTime() {
        return recessionDateTime;
    }

    public void setRecessionDateTime(long recessionDateTime) {
        this.recessionDateTime = recessionDateTime;
    }

    public int getTransFlag() {
        return transFlag;
    }

    public void setTransFlag(int transFlag) {
        this.transFlag = transFlag;
    }

    public double getTransMoney() {
        return transMoney;
    }

    public void setTransMoney(int transMoney) {
        this.transMoney = transMoney;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getBorrowBicycleNum() {
        return borrowBicycleNum;
    }

    public void setBorrowBicycleNum(int borrowBicycleNum) {
        this.borrowBicycleNum = borrowBicycleNum;
    }

    public int getRecessionBicycleNum() {
        return recessionBicycleNum;
    }

    public void setRecessionBicycleNum(int recessionBicycleNum) {
        this.recessionBicycleNum = recessionBicycleNum;
    }

    public int getOrderIntegral() {
        return orderIntegral;
    }

    public void setOrderIntegral(int orderIntegral) {
        this.orderIntegral = orderIntegral;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }

    public String getSimNo() {
        return simNo;
    }

    public void setSimNo(String simNo) {
        this.simNo = simNo;
    }

    public int getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(int bicycleType) {
        this.bicycleType = bicycleType;
    }

    public int getUseBlueTooth() {
        return useBlueTooth;
    }

    public void setUseBlueTooth(int useBlueTooth) {
        this.useBlueTooth = useBlueTooth;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getCityNo() {
        return cityNo;
    }

    public void setCityNo(int cityNo) {
        this.cityNo = cityNo;
    }

    public int getFenceStatus() {
        return fenceStatus;
    }

    public void setFenceStatus(int fenceStatus) {
        this.fenceStatus = fenceStatus;
    }

    public double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "TransRecordInfo{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", orderNum=" + orderNum +
                ", borrowBatteryNum=" + borrowBatteryNum +
                ", borrowDateTime=" + borrowDateTime +
                ", recessionBatteryNum=" + recessionBatteryNum +
                ", recessionDateTime=" + recessionDateTime +
                ", transFlag=" + transFlag +
                ", transMoney=" + transMoney +
                ", state=" + state +
                ", borrowBicycleNum=" + borrowBicycleNum +
                ", recessionBicycleNum=" + recessionBicycleNum +
                ", orderIntegral=" + orderIntegral +
                ", kilometers=" + kilometers +
                ", startPosition='" + startPosition + '\'' +
                ", endPosition='" + endPosition + '\'' +
                ", simNo='" + simNo + '\'' +
                ", bicycleType=" + bicycleType +
                ", useBlueTooth=" + useBlueTooth +
                ", calorie=" + calorie +
                ", duration='" + duration + '\'' +
                ", userType=" + userType +
                ", cityNo=" + cityNo +
                ", fenceStatus=" + fenceStatus +
                ", discountMoney=" + discountMoney +
                ", remarks='" + remarks + '\'' +
                ", isLocal=" + isLocal +
                '}';
    }
}

