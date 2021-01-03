package com.example.demo.Controller;

import com.example.demo.Dao.StockLogDao;
import com.example.demo.Entities.StockLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stockLog")
public class StockLogController {

    @Autowired
    private StockLogDao stockLogDao;

    @PostMapping
    public String insert(@RequestBody StockLog stockLog){
//        StockLog stockLog = new StockLog();
//        stockLog.setLogType(0);
//        stockLog.setCounts(100);
//        stockLog.setId("1");
//        stockLog.setSkuCode("63371141142");
//        stockLog.setTime(new Date());
//        stockLog.setRepositoryId("2");
//        stockLog.setProductId("1");
        stockLogDao.addStockLog(stockLog);
        return "stocklog";
    }
    @GetMapping("/lists")
    public List<StockLog> queryAll(){
        List<StockLog> stockLogs = stockLogDao.queryAll();
        return stockLogs;
    }

    @GetMapping("/list")
    public List<StockLog> query(@RequestParam Map<String, Object> param){
        return stockLogDao.query(param);
    }
}
