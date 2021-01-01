package com.example.demo.Entities;

import lombok.Data;
import java.util.Date;

@Data
public class StockLog {
    private String id;
    private String repositoryId;
    private String productId;
    private String skuCode;
    private Date time;
    private int counts;
    private int logType;
}
