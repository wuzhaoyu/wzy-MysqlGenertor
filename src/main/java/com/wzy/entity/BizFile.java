package com.wzy.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-07-06
 */
@TableName("biz_file")
public class BizFile extends Model<BizFile> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    private Integer userId;
    @TableField("storage_type")
    private String storageType;
    @TableField("original_file_name")
    private String originalFileName;
    private Long size;
    private String suffix;
    private Integer width;
    private Integer height;
    @TableField("file_path")
    private String filePath;
    @TableField("full_file_path")
    private String fullFilePath;
    @TableField("file_hash")
    private String fileHash;
    @TableField("upload_type")
    private String uploadType;
    @TableField("upload_start_time")
    private Date uploadStartTime;
    @TableField("upload_end_time")
    private Date uploadEndTime;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFullFilePath() {
        return fullFilePath;
    }

    public void setFullFilePath(String fullFilePath) {
        this.fullFilePath = fullFilePath;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    public Date getUploadStartTime() {
        return uploadStartTime;
    }

    public void setUploadStartTime(Date uploadStartTime) {
        this.uploadStartTime = uploadStartTime;
    }

    public Date getUploadEndTime() {
        return uploadEndTime;
    }

    public void setUploadEndTime(Date uploadEndTime) {
        this.uploadEndTime = uploadEndTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BizFile{" +
        "id=" + id +
        ", userId=" + userId +
        ", storageType=" + storageType +
        ", originalFileName=" + originalFileName +
        ", size=" + size +
        ", suffix=" + suffix +
        ", width=" + width +
        ", height=" + height +
        ", filePath=" + filePath +
        ", fullFilePath=" + fullFilePath +
        ", fileHash=" + fileHash +
        ", uploadType=" + uploadType +
        ", uploadStartTime=" + uploadStartTime +
        ", uploadEndTime=" + uploadEndTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
