package com.rong.pojo;

public class UsersLikeVideos {

    private String id;

    /**
     * 用户
     */

    private String userId;

    /**
     * 视频
     */
    private String videoId;




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
    public String getVideoId() {
        return videoId;
    }
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}