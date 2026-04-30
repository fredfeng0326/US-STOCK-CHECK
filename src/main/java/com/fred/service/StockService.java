package com.fred.service;

import com.fred.entity.StockCounts;
import com.fred.entity.USStockRss;

import java.util.List;

public interface StockService {

    public List<USStockRss> queryStock(String stockCode);

    /**
     * @Description: 查询时间段内的股票数据
     * @param stockCode
     * @param startDate
     * @param endDate
     * @return List<USStockRss>
     */
    public List<USStockRss> queryStockBetweenDate(String stockCode, String startDate, String endDate);

    /**
     * @Description: 查询指定日期段内异动次数超过指定次数
     * @param targetCounts
     * @param startDate
     * @param endDate
     * @return List<StockCounts>
     */
    public List<StockCounts> queryStockCountsBetweenDate(Integer targetCounts, String startDate, String endDate);

    /**
     * @Description: 根据标题关键字查询股票数据
     * @param titleKeywords
     * @return List<USStockRss>
     */
    public List<USStockRss> queryStockByTitleKeywords(List<String> titleKeywords);
}
