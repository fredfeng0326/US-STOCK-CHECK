package com.fred.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fred.entity.StockCounts;
import com.fred.entity.USStockRss;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface USStockRssMapper extends BaseMapper<USStockRss> {
    public List<StockCounts> queryStockCountsBetweenDate(@Param("paramMap") Map<String, Object> map);

    public List<USStockRss> queryStockByTitleKeywords(@Param("keywords") List<String> titleKeywords);
}
