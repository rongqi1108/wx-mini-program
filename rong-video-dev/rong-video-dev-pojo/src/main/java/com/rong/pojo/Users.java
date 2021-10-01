package com.rong.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(value="用户对象", description="这是用户对象")
public class Users {
    
	@ApiModelProperty(hidden=true)
    private String id;

    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名", name="username", example="imoocuser", required=true)
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value="密码", name="password", example="123456", required=true)
    private String password;

    /**
     * 我的头像，如果没有默认给一张
     */
    @ApiModelProperty(hidden=true)
    private String faceImage;

    /**
     * 昵称
     */
    @ApiModelProperty(hidden=true)
    private String nickname;

    /**
     * 我的粉丝数量
     */
    @ApiModelProperty(hidden=true)
    private Integer fansCounts;

    /**
     * 我关注的人总数
     */
    @ApiModelProperty(hidden=true)
    private Integer followCounts;

    /**
     * 我接受到的赞美/收藏 的数量
     */
    @ApiModelProperty(hidden=true)
    private Integer receiveLikeCounts;

    public Users() {
		super();
	}
    
    public Users(String id, String username, String password, String faceImage, String nickname, Integer fansCounts,
			Integer followCounts, Integer receiveLikeCounts) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.faceImage = faceImage;
		this.nickname = nickname;
		this.fansCounts = fansCounts;
		this.followCounts = followCounts;
		this.receiveLikeCounts = receiveLikeCounts;
	}




    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFaceImage() {
        return faceImage;
    }
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Integer getFansCounts() {
        return fansCounts;
    }
    public void setFansCounts(Integer fansCounts) {
        this.fansCounts = fansCounts;
    }
    public Integer getFollowCounts() {
        return followCounts;
    }
    public void setFollowCounts(Integer followCounts) {
        this.followCounts = followCounts;
    }
    public Integer getReceiveLikeCounts() {
        return receiveLikeCounts;
    }
    public void setReceiveLikeCounts(Integer receiveLikeCounts) {
        this.receiveLikeCounts = receiveLikeCounts;
    }

}