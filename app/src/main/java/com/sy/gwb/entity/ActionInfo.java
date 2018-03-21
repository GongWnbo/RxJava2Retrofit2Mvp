package com.sy.gwb.entity;


import java.io.Serializable;

/**
 * Created by Erebus on 2017/9/28.
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
public class ActionInfo implements Serializable {


    /**
     * displayType	    int	    显示类型，1：app内容；2：sdk广告
     * rank	            int	    显示序列号，当做下次请求参数
     * displayPic	        string	显示图片链接
     * displayWords	    string	显示话术
     * actionType	        int	    0：不跳转；1：赳赳乐享；2：H5
     * actionUrl	        string	显示内容的跳转链接
     * activityId	        string	活动id
     * shareUrl	        string	分享链接
     * sharePlatform	    string	分享平台
     * shareTitle	        string	分享标题
     * sharePic	        string	分享图片
     * shareContent	    string	分享内容
     * inmobiId	        string	inmobiId
     * isSelf	            string  h5链接类型（0:三方；1：自己的）
     * <p>
     * displayId	        string	    展示id(用于点击统计回传接口)
     * showType	        string	    展示类型(1.静态图 2.gif 3.视频)
     * gifCountdown	    string	    gif展示倒计时
     * isDownload	        string	    是否是下载页面（0：否 1：是）
     * downloadType	    string	    1.落地页下载 2.直接下载
     * isAd	            string	    是否是广告 0.不是 1.是
     */
    private int     id;
    private String  description;
    private String  actionType;
    private String  activityId;
    private String  sharePlatform;
    private String  shareTitle;
    private String  sharePic;
    private String  shareContent;
    private String  isAction;
    private String  prizePic;
    private String  displayPic;
    private String  displayWords;
    private String  actionUrl;
    private String  shareUrl;
    private String  inmobiId;
    private String  returnActionType;
    private String  isSelf;
    private Integer displayId;
    private Integer gifCountdown;
    private Integer isAd;
    private Integer showType;
    private String  channelId;
    private Integer isDownload;
    private Integer downloadType;
    private Integer type;
    private Long    updateTime;
    private Long    inmobiUpdateTime;
    private Integer sort;
    private Integer displayType;

//    // TODO: 2018/3/20 0020
//    @Column(name = "adChannelId")
//    private String  adChannelId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public String getAdChannelId() {
//        return adChannelId;
//    }
//
//    public void setAdChannelId(String adChannelId) {
//        this.adChannelId = adChannelId;
//    }

    public Integer getDisplayType() {
        return displayType;
    }

    public void setDisplayType(Integer displayType) {
        this.displayType = displayType;
    }

    public Long getInmobiUpdateTime() {
        return inmobiUpdateTime;
    }

    public void setInmobiUpdateTime(Long inmobiUpdateTime) {
        this.inmobiUpdateTime = inmobiUpdateTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getSharePlatform() {
        return sharePlatform;
    }

    public void setSharePlatform(String sharePlatform) {
        this.sharePlatform = sharePlatform;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getShareContent() {
        return shareContent;
    }

    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }

    public String getIsAction() {
        return isAction;
    }

    public void setIsAction(String isAction) {
        this.isAction = isAction;
    }

    public String getPrizePic() {
        return prizePic;
    }

    public void setPrizePic(String prizePic) {
        this.prizePic = prizePic;
    }

    public String getDisplayPic() {
        return displayPic;
    }

    public void setDisplayPic(String displayPic) {
        this.displayPic = displayPic;
    }

    public String getDisplayWords() {
        return displayWords;
    }

    public void setDisplayWords(String displayWords) {
        this.displayWords = displayWords;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getInmobiId() {
        return inmobiId;
    }

    public void setInmobiId(String inmobiId) {
        this.inmobiId = inmobiId;
    }

    public String getReturnActionType() {
        return returnActionType;
    }

    public void setReturnActionType(String returnActionType) {
        this.returnActionType = returnActionType;
    }

    public String getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(String isSelf) {
        this.isSelf = isSelf;
    }

    public Integer getDisplayId() {
        return displayId;
    }

    public void setDisplayId(Integer displayId) {
        this.displayId = displayId;
    }

    public Integer getGifCountdown() {
        return gifCountdown;
    }

    public void setGifCountdown(Integer gifCountdown) {
        this.gifCountdown = gifCountdown;
    }

    public Integer getIsAd() {
        return isAd;
    }

    public void setIsAd(Integer isAd) {
        this.isAd = isAd;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getIsDownload() {
        return isDownload;
    }

    public void setIsDownload(Integer isDownload) {
        this.isDownload = isDownload;
    }

    public Integer getDownloadType() {
        return downloadType;
    }

    public void setDownloadType(Integer downloadType) {
        this.downloadType = downloadType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ActionInfo{" +
                "description='" + description + '\'' +
                ", actionType='" + actionType + '\'' +
                ", activityId='" + activityId + '\'' +
                ", sharePlatform='" + sharePlatform + '\'' +
                ", shareTitle='" + shareTitle + '\'' +
                ", sharePic='" + sharePic + '\'' +
                ", shareContent='" + shareContent + '\'' +
                ", isAction='" + isAction + '\'' +
                ", prizePic='" + prizePic + '\'' +
                ", displayPic='" + displayPic + '\'' +
                ", displayWords='" + displayWords + '\'' +
                ", actionUrl='" + actionUrl + '\'' +
                ", shareUrl='" + shareUrl + '\'' +
                ", inmobiId='" + inmobiId + '\'' +
                ", returnActionType='" + returnActionType + '\'' +
                ", isSelf='" + isSelf + '\'' +
                ", displayId=" + displayId +
                ", gifCountdown=" + gifCountdown +
                ", isAd=" + isAd +
                ", showType=" + showType +
                ", channelId='" + channelId + '\'' +
                ", isDownload=" + isDownload +
                ", downloadType=" + downloadType +
                ", type=" + type +
                '}';
    }
}
