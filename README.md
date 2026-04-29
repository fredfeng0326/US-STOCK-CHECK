# stock-mcp

## 1. Project Introduction

`stock-mcp` is an **MCP stock tracking tool** built with **Spring AI**.  
The project exposes stock data capabilities through MCP (Model Context Protocol), allowing agents or upper-layer applications to call stock query interfaces in a unified way.

## 2. Project Structure

```text
stock-mcp/
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── fred/
                    └── mcp/
                        └── tool/
                            └── StockTool.java
```

Note: the core file most directly related to MCP tool capabilities is `src/main/java/com/fred/mcp/tool/StockTool.java`.

## 3. MCP Features

The following features are defined in `src/main/java/com/fred/mcp/tool/StockTool.java`:

- `queryStockInfoByCode(String stockCode)`: Query stock information by stock code.
- `queryStockInfoByCodeBetweenDate(String stockCode, String startDate, String endDate)`: Query stock information by stock code within a specified date range.
- `queryStockCountsBetweenDate(Integer targetCounts, String startDate, String endDate)`: Query stocks whose occurrence count exceeds a target value within a specified date range.
- `queryStockByTitleKeywords(List<String> titleKeywords)`: Query stock information by a list of title keywords.
