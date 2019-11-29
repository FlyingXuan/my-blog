package com.jicl.mapper;

import com.jicl.entity.Blog;
import com.jicl.entity.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    long countByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int deleteByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer blogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int insertSelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    List<Blog> selectByExampleWithBLOBs(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    List<Blog> selectByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    Blog selectByPrimaryKey(Integer blogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Blog record);
}