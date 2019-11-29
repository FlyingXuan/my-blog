package com.jicl.entity;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_tag
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Tag implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.tag_id
     *
     * @mbg.generated
     */
    private Integer tagId;

    /**
     * Database Column Remarks:
     *   标签名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.tag_name
     *
     * @mbg.generated
     */
    private String tagName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.tag_id
     *
     * @return the value of t_tag.tag_id
     *
     * @mbg.generated
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.tag_id
     *
     * @param tagId the value for t_tag.tag_id
     *
     * @mbg.generated
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tag.tag_name
     *
     * @return the value of t_tag.tag_name
     *
     * @mbg.generated
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tag.tag_name
     *
     * @param tagName the value for t_tag.tag_name
     *
     * @mbg.generated
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}