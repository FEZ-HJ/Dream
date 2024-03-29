package com.dream.steamfree.service;

import com.dream.steamfree.domain.FreeGame;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author dream
 * @date 2019-12-03
 */
public interface FreeGameService {
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFreeGameByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFreeGameById(Long id);
}
