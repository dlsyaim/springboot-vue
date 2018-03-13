package ks.monitor.entity;
public class KsManager {
    private Object managerID;
    private String qQ;
    private Integer status;
    private java.util.Date loginTime;
    private String managerName;
    private String idcard;
    private String userEmail;
    private java.util.Date addTime;
    private Long roleID;
    private Long webSiteID;
    private String mobilePhone;
    private String addUser;
    private String loginIP;
    private Long loginNum;
    private String realName;
    private String password;
    public KsManager() {
        super();
    }
    public KsManager(Object managerID,String qQ,Integer status,java.util.Date loginTime,String managerName,String idcard,String userEmail,java.util.Date addTime,Long roleID,Long webSiteID,String mobilePhone,String addUser,String loginIP,Long loginNum,String realName,String password) {
        super();
        this.managerID = managerID;
        this.qQ = qQ;
        this.status = status;
        this.loginTime = loginTime;
        this.managerName = managerName;
        this.idcard = idcard;
        this.userEmail = userEmail;
        this.addTime = addTime;
        this.roleID = roleID;
        this.webSiteID = webSiteID;
        this.mobilePhone = mobilePhone;
        this.addUser = addUser;
        this.loginIP = loginIP;
        this.loginNum = loginNum;
        this.realName = realName;
        this.password = password;
    }
    public Object getManagerID() {
        return this.managerID;
    }

    public void setManagerID(Object managerID) {
        this.managerID = managerID;
    }

    public String getQQ() {
        return this.qQ;
    }

    public void setQQ(String qQ) {
        this.qQ = qQ;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public java.util.Date getLoginTime() {
        return this.loginTime;
    }

    public void setLoginTime(java.util.Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getManagerName() {
        return this.managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getIdcard() {
        return this.idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public java.util.Date getAddTime() {
        return this.addTime;
    }

    public void setAddTime(java.util.Date addTime) {
        this.addTime = addTime;
    }

    public Long getRoleID() {
        return this.roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public Long getWebSiteID() {
        return this.webSiteID;
    }

    public void setWebSiteID(Long webSiteID) {
        this.webSiteID = webSiteID;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddUser() {
        return this.addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public String getLoginIP() {
        return this.loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public Long getLoginNum() {
        return this.loginNum;
    }

    public void setLoginNum(Long loginNum) {
        this.loginNum = loginNum;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
