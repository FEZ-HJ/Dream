package com.dream.steamfree.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.dream.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 free_game
 * 
 * @author dream
 * @date 2019-12-03
 */
public class FreeGame extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String allAssess;

    private String assess;

    private String chineseName;

    private String content;

    private String englishName;

    private String factory;

    private String images;

    private String language;

    private String newPrice;

    private String price;

    private String rowImage;

    private String saleDate;

    private String tag;

    private String type;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAllAssess(String allAssess) 
    {
        this.allAssess = allAssess;
    }

    public String getAllAssess() 
    {
        return allAssess;
    }
    public void setAssess(String assess) 
    {
        this.assess = assess;
    }

    public String getAssess() 
    {
        return assess;
    }
    public void setChineseName(String chineseName) 
    {
        this.chineseName = chineseName;
    }

    public String getChineseName() 
    {
        return chineseName;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setEnglishName(String englishName) 
    {
        this.englishName = englishName;
    }

    public String getEnglishName() 
    {
        return englishName;
    }
    public void setFactory(String factory) 
    {
        this.factory = factory;
    }

    public String getFactory() 
    {
        return factory;
    }
    public void setImages(String images) 
    {
        this.images = images;
    }

    public String getImages() 
    {
        return images;
    }
    public void setLanguage(String language) 
    {
        this.language = language;
    }

    public String getLanguage() 
    {
        return language;
    }
    public void setNewPrice(String newPrice) 
    {
        this.newPrice = newPrice;
    }

    public String getNewPrice() 
    {
        return newPrice;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setRowImage(String rowImage) 
    {
        this.rowImage = rowImage;
    }

    public String getRowImage() 
    {
        return rowImage;
    }
    public void setSaleDate(String saleDate) 
    {
        this.saleDate = saleDate;
    }

    public String getSaleDate() 
    {
        return saleDate;
    }
    public void setTag(String tag) 
    {
        this.tag = tag;
    }

    public String getTag() 
    {
        return tag;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("allAssess", getAllAssess())
            .append("assess", getAssess())
            .append("chineseName", getChineseName())
            .append("content", getContent())
            .append("englishName", getEnglishName())
            .append("factory", getFactory())
            .append("images", getImages())
            .append("language", getLanguage())
            .append("newPrice", getNewPrice())
            .append("price", getPrice())
            .append("rowImage", getRowImage())
            .append("saleDate", getSaleDate())
            .append("tag", getTag())
            .append("type", getType())
            .toString();
    }
}
