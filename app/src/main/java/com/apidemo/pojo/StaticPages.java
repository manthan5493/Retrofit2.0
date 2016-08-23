package com.apidemo.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sotsys071 on 23/8/16.
 */
public class StaticPages {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("status_msg")
    @Expose
    private String statusMsg;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("page_title")
    @Expose
    private String pageTitle;
    @SerializedName("page_slug")
    @Expose
    private String pageSlug;
    @SerializedName("page_description")
    @Expose
    private String pageDescription;
    @SerializedName("added_date")
    @Expose
    private String addedDate;

    /**
     *
     * @return
     * The code
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     * The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     * The statusMsg
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     *
     * @param statusMsg
     * The status_msg
     */
    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    /**
     *
     * @return
     * The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     * The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     *
     * @return
     * The pageTitle
     */
    public String getPageTitle() {
        return pageTitle;
    }

    /**
     *
     * @param pageTitle
     * The page_title
     */
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    /**
     *
     * @return
     * The pageSlug
     */
    public String getPageSlug() {
        return pageSlug;
    }

    /**
     *
     * @param pageSlug
     * The page_slug
     */
    public void setPageSlug(String pageSlug) {
        this.pageSlug = pageSlug;
    }

    /**
     *
     * @return
     * The pageDescription
     */
    public String getPageDescription() {
        return pageDescription;
    }

    /**
     *
     * @param pageDescription
     * The page_description
     */
    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

    /**
     *
     * @return
     * The addedDate
     */
    public String getAddedDate() {
        return addedDate;
    }

    /**
     *
     * @param addedDate
     * The added_date
     */
    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

}
