package com.sy.gwb.entity;


/**
 * Created by Erebus on 2017/3/15.
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
public class User {

    /**
     * id : 2c94bf815aa64700015aa64cf5150007    用户ID
     * phone : 15088358979                      手机号码
     * addTime : 2017-03-07 09:05:45             注册时间
     * loginState : 2                           登录状态标识 1 未登录状态 2 登录状态
     * realName : 胡伟皓                           姓名
     * idCardnum : 330501199211280817               身份证
     * gender : 0                                   性别 0 未设置 1 男 2 女
     * guesterState : 0                             手势密码状态 0、未设置 1、设置并开启 2、设置且关闭（未用）
     * loginTime : 2017-03-15 11:46:35              登陆时间
     * integral : 10                                用户积分
     * creditScore : 600                            信用积分
     * mBorrowBicycle : 0                           用户状态（0：还车 1：借车 2：临时停车 3:换电瓶 4：借车处理中 5:待付款 6 以上锁）
     * accountStatus : 0                            账户状态（0：手机认证状态 1：押金充值状态 2：实名无押金 3：实名有押金 4：待支付状态 5：退款冻结状态 6：无身份证验证审核状况）
     * userLevel : 0
     * mBorrowBicycleDate : 2017-03-08 15:04:10         借车时间
     * deposit : 0.0                                账户押金
     * balance : 0.0                                账户余额
     * balanceFree:0.0                              赠送余额
     * mPhoneSystemVersion : SM-J5008 Android 5.1   手机系统+版本号（IOS或者Android）
     * appVersion : 版本号:1                           app版本
     * cityNo : 252003                              城市编号
     * nickname : 哈哈                                昵称
     * picurl :                                     头像照片路径
     * nationality : 中国                             国籍
     * certificatePositive :                    证件正面照
     * certificateNegative :                        证件反面照
     * openDate : 2017-03-08 15:04:40               会员开通日期
     * validateDate : 2017-03-08 15:04:40           会员有效期
     * changBatteryStatus : 0                       换电瓶状态(0：正常 1：已取车上电池 2:已还电池 3：已取电池 4:已还电池至自行车上)
     * statusChangeTime : 2017-03-08 15:04:36           状态更新时间，用户判断零时停车及换电池预留时间
     * luckMoney:                               红包
     *
     */


    private String id;
    private String phone;
    private String addTime;
    private int loginState;
    private String realName;
    private String idCardnum;
    private int gender;
    private int guesterState;
    private String loginTime;
    private int integral;
    private int creditScore;
    private int mBorrowBicycle;
    private int accountStatus;
    private int userLevel;
    private String mBorrowBicycleDate;
    private double deposit;
    private double balance;
    private String mPhoneSystemVersion;
    private String appVersion;
    private String cityNo;
    private String nickname;
    private String picurl;
    private String nationality;
    private String certificatePositive;
    private String certificateNegative;
    private String openDate;
    private String validateDate;
    private int changBatteryStatus;
    private String statusChangeTime;
    private double luckyMoney;
    private String alipayAccount;
    private double balanceFree;

    // TODO: 2018/3/20 0020
//    @Column(name = "age")
//    private int age;
//    @Column(name = "channel")
//    private String channel;
//    @Column(name = "idfa")
//    private String idfa;
//    @Column(name = "imei")
//    private String imei;
//    @Column(name = "mac")
//    private String mac;
//    @Column(name = "monthCardTime")
//    private String monthCardTime;
//    @Column(name = "registerCity")
//    private String registerCity;
//    @Column(name = "remarks")
//    private String remarks;

    public int getBorrowBicycle() {
        return mBorrowBicycle;
    }

    public void setBorrowBicycle(int borrowBicycle) {
        mBorrowBicycle = borrowBicycle;
    }

    public String getBorrowBicycleDate() {
        return mBorrowBicycleDate;
    }

    public void setBorrowBicycleDate(String borrowBicycleDate) {
        mBorrowBicycleDate = borrowBicycleDate;
    }

    public String getPhoneSystemVersion() {
        return mPhoneSystemVersion;
    }

    public void setPhoneSystemVersion(String phoneSystemVersion) {
        mPhoneSystemVersion = phoneSystemVersion;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getChannel() {
//        return channel;
//    }
//
//    public void setChannel(String channel) {
//        this.channel = channel;
//    }
//
//    public String getIdfa() {
//        return idfa;
//    }
//
//    public void setIdfa(String idfa) {
//        this.idfa = idfa;
//    }
//
//    public String getImei() {
//        return imei;
//    }
//
//    public void setImei(String imei) {
//        this.imei = imei;
//    }
//
//    public String getMac() {
//        return mac;
//    }
//
//    public void setMac(String mac) {
//        this.mac = mac;
//    }
//
//    public String getMonthCardTime() {
//        return monthCardTime;
//    }
//
//    public void setMonthCardTime(String monthCardTime) {
//        this.monthCardTime = monthCardTime;
//    }
//
//    public String getRegisterCity() {
//        return registerCity;
//    }
//
//    public void setRegisterCity(String registerCity) {
//        this.registerCity = registerCity;
//    }
//
//    public String getRemarks() {
//        return remarks;
//    }
//
//    public void setRemarks(String remarks) {
//        this.remarks = remarks;
//    }

    public double getBalanceFree() {
        return balanceFree;
    }

    public void setBalanceFree(double balanceFree) {
        this.balanceFree = balanceFree;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getmBorrowBicycleDate() {
        return mBorrowBicycleDate;
    }

    public void setmBorrowBicycleDate(String mBorrowBicycleDate) {
        this.mBorrowBicycleDate = mBorrowBicycleDate;
    }

    public String getmPhoneSystemVersion() {
        return mPhoneSystemVersion;
    }

    public void setmPhoneSystemVersion(String mPhoneSystemVersion) {
        this.mPhoneSystemVersion = mPhoneSystemVersion;
    }

    public double getLuckyMoney() {
        return luckyMoney;
    }

    public void setLuckyMoney(double luckyMoney) {
        this.luckyMoney = luckyMoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public int getLoginState() {
        return loginState;
    }

    public void setLoginState(int loginState) {
        this.loginState = loginState;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCardnum() {
        return idCardnum;
    }

    public void setIdCardnum(String idCardnum) {
        this.idCardnum = idCardnum;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGuesterState() {
        return guesterState;
    }

    public void setGuesterState(int guesterState) {
        this.guesterState = guesterState;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getMBorrowBicycle() {
        return mBorrowBicycle;
    }

    public void setMBorrowBicycle(int mBorrowBicycle) {
        this.mBorrowBicycle = mBorrowBicycle;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getMBorrowBicycleDate() {
        return mBorrowBicycleDate;
    }

    public void setMBorrowBicycleDate(String mBorrowBicycleDate) {
        this.mBorrowBicycleDate = mBorrowBicycleDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMPhoneSystemVersion() {
        return mPhoneSystemVersion;
    }

    public void setMPhoneSystemVersion(String mPhoneSystemVersion) {
        this.mPhoneSystemVersion = mPhoneSystemVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getCityNo() {
        return cityNo;
    }

    public void setCityNo(String cityNo) {
        this.cityNo = cityNo;
    }

    public String getNickname() {
//        if(phone.equals("15088358979"))
//            return "超级傻屌短短冬";
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCertificatePositive() {
        return certificatePositive;
    }

    public void setCertificatePositive(String certificatePositive) {
        this.certificatePositive = certificatePositive;
    }

    public String getCertificateNegative() {
        return certificateNegative;
    }

    public void setCertificateNegative(String certificateNegative) {
        this.certificateNegative = certificateNegative;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(String validateDate) {
        this.validateDate = validateDate;
    }

    public int getChangBatteryStatus() {
        return changBatteryStatus;
    }

    public void setChangBatteryStatus(int changBatteryStatus) {
        this.changBatteryStatus = changBatteryStatus;
    }

    public String getStatusChangeTime() {
        return statusChangeTime;
    }

    public void setStatusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", addTime='" + addTime + '\'' +
                ", loginState=" + loginState +
                ", realName='" + realName + '\'' +
                ", idCardnum='" + idCardnum + '\'' +
                ", gender=" + gender +
                ", guesterState=" + guesterState +
                ", loginTime='" + loginTime + '\'' +
                ", integral=" + integral +
                ", creditScore=" + creditScore +
                ", mBorrowBicycle=" + mBorrowBicycle +
                ", accountStatus=" + accountStatus +
                ", userLevel=" + userLevel +
                ", mBorrowBicycleDate='" + mBorrowBicycleDate + '\'' +
                ", deposit=" + deposit +
                ", balance=" + balance +
                ", mPhoneSystemVersion='" + mPhoneSystemVersion + '\'' +
                ", appVersion='" + appVersion + '\'' +
                ", cityNo='" + cityNo + '\'' +
                ", nickname='" + nickname + '\'' +
                ", picurl='" + picurl + '\'' +
                ", nationality='" + nationality + '\'' +
                ", certificatePositive='" + certificatePositive + '\'' +
                ", certificateNegative='" + certificateNegative + '\'' +
                ", openDate='" + openDate + '\'' +
                ", validateDate='" + validateDate + '\'' +
                ", changBatteryStatus=" + changBatteryStatus +
                ", statusChangeTime='" + statusChangeTime + '\'' +
                ", luckyMoney=" + luckyMoney +
                ", alipayAccount='" + alipayAccount + '\'' +
                ", balanceFree=" + balanceFree +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (loginState != user.loginState) return false;
        if (gender != user.gender) return false;
        if (guesterState != user.guesterState) return false;
        if (integral != user.integral) return false;
        if (creditScore != user.creditScore) return false;
        if (mBorrowBicycle != user.mBorrowBicycle) return false;
        if (accountStatus != user.accountStatus) return false;
        if (userLevel != user.userLevel) return false;
        if (Double.compare(user.deposit, deposit) != 0) return false;
        if (Double.compare(user.balance, balance) != 0) return false;
        if (changBatteryStatus != user.changBatteryStatus) return false;
        if (Double.compare(user.luckyMoney, luckyMoney) != 0) return false;
        if (Double.compare(user.balanceFree, balanceFree) != 0) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (addTime != null ? !addTime.equals(user.addTime) : user.addTime != null) return false;
        if (realName != null ? !realName.equals(user.realName) : user.realName != null)
            return false;
        if (idCardnum != null ? !idCardnum.equals(user.idCardnum) : user.idCardnum != null)
            return false;
        if (loginTime != null ? !loginTime.equals(user.loginTime) : user.loginTime != null)
            return false;
        if (mBorrowBicycleDate != null ? !mBorrowBicycleDate.equals(user.mBorrowBicycleDate) : user.mBorrowBicycleDate != null)
            return false;
        if (mPhoneSystemVersion != null ? !mPhoneSystemVersion.equals(user.mPhoneSystemVersion) : user.mPhoneSystemVersion != null)
            return false;
        if (appVersion != null ? !appVersion.equals(user.appVersion) : user.appVersion != null)
            return false;
        if (cityNo != null ? !cityNo.equals(user.cityNo) : user.cityNo != null) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null)
            return false;
        if (picurl != null ? !picurl.equals(user.picurl) : user.picurl != null) return false;
        if (nationality != null ? !nationality.equals(user.nationality) : user.nationality != null)
            return false;
        if (certificatePositive != null ? !certificatePositive.equals(user.certificatePositive) : user.certificatePositive != null)
            return false;
        if (certificateNegative != null ? !certificateNegative.equals(user.certificateNegative) : user.certificateNegative != null)
            return false;
        if (openDate != null ? !openDate.equals(user.openDate) : user.openDate != null)
            return false;
        if (validateDate != null ? !validateDate.equals(user.validateDate) : user.validateDate != null)
            return false;
        if (statusChangeTime != null ? !statusChangeTime.equals(user.statusChangeTime) : user.statusChangeTime != null)
            return false;
        return alipayAccount != null ? alipayAccount.equals(user.alipayAccount) : user.alipayAccount == null;

    }
}

