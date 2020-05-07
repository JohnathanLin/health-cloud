package com.health.system.service.impl;

import com.health.common.core.text.Convert;
import com.health.system.domain.Districts;
import com.health.system.mapper.DistrictsMapper;
import com.health.system.service.IDistrictsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 地区 服务层实现
 *
 * @author ruoyi
 * @date 2018-12-19
 */
@Service
public class DistrictsServiceImpl implements IDistrictsService {
    @Autowired
    private DistrictsMapper districtsMapper;

    /**
     * 查询地区列表
     *
     * @param districts 地区信息
     * @return 地区集合
     */
    @Override
    public List<Districts> selectDistrictsList(Districts districts) {
        return districtsMapper.selectDistrictsList(districts);
    }

    /**
     * 新增地区
     *
     * @param districts 地区信息
     * @return 结果
     */
    @Override
    public int insertDistricts(Districts districts) {
        return districtsMapper.insertDistricts(districts);
    }

    /**
     * 修改地区
     *
     * @param districts 地区信息
     * @return 结果
     */
    @Override
    public int updateDistricts(Districts districts) {
        return districtsMapper.updateDistricts(districts);
    }

    /**
     * 删除地区对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDistrictsByIds(String ids) {
        return districtsMapper.deleteDistrictsByIds(Convert.toStrArray(ids));
    }

}
