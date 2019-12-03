package com.dream.steamfree.service.impl;

import com.dream.common.core.text.Convert;
import com.dream.steamfree.domain.FreeGame;
import com.dream.steamfree.mapper.FreeGameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author dream
 * @date 2019-12-03
 */
@Service
public class FreeGameServiceImpl implements IFreeGameService 
{
    @Autowired
    private FreeGameMapper freeGameMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public FreeGame selectFreeGameById(Long id)
    {
        return freeGameMapper.selectFreeGameById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param freeGame 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FreeGame> selectFreeGameList(FreeGame freeGame)
    {
        return freeGameMapper.selectFreeGameList(freeGame);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param freeGame 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFreeGame(FreeGame freeGame)
    {
        return freeGameMapper.insertFreeGame(freeGame);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param freeGame 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFreeGame(FreeGame freeGame)
    {
        return freeGameMapper.updateFreeGame(freeGame);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFreeGameByIds(String ids)
    {
        return freeGameMapper.deleteFreeGameByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFreeGameById(Long id)
    {
        return freeGameMapper.deleteFreeGameById(id);
    }
}
