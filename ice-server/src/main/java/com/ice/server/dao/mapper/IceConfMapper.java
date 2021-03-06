package com.ice.server.dao.mapper;

import com.ice.server.dao.model.IceConf;
import com.ice.server.dao.model.IceConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IceConfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    long countByExample(IceConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int deleteByExample(IceConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int insert(IceConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int insertSelective(IceConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int insertSelectiveWithId(IceConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    List<IceConf> selectByExample(IceConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    IceConf selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IceConf record, @Param("example") IceConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IceConf record, @Param("example") IceConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IceConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IceConf record);
}