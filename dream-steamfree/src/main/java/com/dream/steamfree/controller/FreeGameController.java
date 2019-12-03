package com.dream.steamfree.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dream.common.annotation.Log;
import com.dream.common.enums.BusinessType;
import com.dream.steamfree.domain.FreeGame;
import com.dream.steamfree.service.FreeGameService;
import com.dream.common.core.controller.BaseController;
import com.dream.common.core.domain.AjaxResult;
import com.dream.common.utils.poi.ExcelUtil;
import com.dream.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author dream
 * @date 2019-12-03
 */
@Controller
@RequestMapping("/system/game")
public class FreeGameController extends BaseController
{
    private String prefix = "system/game";

    @Autowired
    private FreeGameService freeGameService;

    @RequiresPermissions("system:game:view")
    @GetMapping()
    public String game()
    {
        return prefix + "/game";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:game:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FreeGame freeGame)
    {
        startPage();
        List<FreeGame> list = freeGameService.selectFreeGameList(freeGame);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:game:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FreeGame freeGame)
    {
        List<FreeGame> list = freeGameService.selectFreeGameList(freeGame);
        ExcelUtil<FreeGame> util = new ExcelUtil<FreeGame>(FreeGame.class);
        return util.exportExcel(list, "game");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:game:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FreeGame freeGame)
    {
        return toAjax(freeGameService.insertFreeGame(freeGame));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FreeGame freeGame = freeGameService.selectFreeGameById(id);
        mmap.put("freeGame", freeGame);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:game:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FreeGame freeGame)
    {
        return toAjax(freeGameService.updateFreeGame(freeGame));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:game:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(freeGameService.deleteFreeGameByIds(ids));
    }
}
