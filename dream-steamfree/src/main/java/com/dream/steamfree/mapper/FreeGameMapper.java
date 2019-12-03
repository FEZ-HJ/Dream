package com.dream.steamfree.mapper;

import com.dream.common.annotation.DataSource;
import com.dream.common.enums.DataSourceType;
import com.dream.steamfree.domain.FreeGame;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author dream
 * @date 2019-12-03
 */
@DataSource(value = DataSourceType.SLAVE)
public interface FreeGameMapper {
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public FreeGame selectFreeGameById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param freeGame 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FreeGame> selectFreeGameList(FreeGame freeGame);

    /**
     * 新增【请填写功能名称】
     * 
     * @param freeGame 【请填写功能名称】
     * @return 结果
     */
    public int insertFreeGame(FreeGame freeGame);

    /**
     * 修改【请填写功能名称】
     * 
     * @param freeGame 【请填写功能名称】
     * @return 结果
     */
    public int updateFreeGame(FreeGame freeGame);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFreeGameById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFreeGameByIds(String[] ids);
}
