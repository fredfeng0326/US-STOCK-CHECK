package com.fred.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StockCounts {

    private String stockCode;       // 股票代码
    private String occurCounts;     // 异动次数

}
