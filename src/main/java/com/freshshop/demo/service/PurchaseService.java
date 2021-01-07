package com.freshshop.demo.service;

import com.freshshop.demo.entity.Product;
import com.freshshop.demo.entity.PurchaseDetail;
import com.freshshop.demo.entity.SkuStock;
import com.freshshop.demo.entity.StockLog;
import com.freshshop.demo.mapper.ProductDao;
import com.freshshop.demo.mapper.PurchaseDetailDao;
import com.freshshop.demo.mapper.SkuStockDao;
import com.freshshop.demo.mapper.StockLogDao;
import com.freshshop.demo.utils.DateId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PurchaseService {

    /**
     * 采购处理流程
     * 1.商品已在商品表，新增一条采购记录，新增库存记录
     */

    @Autowired
    private PurchaseDetailDao purchaseDetailDao;

    @Autowired
    private SkuStockDao skuStockDao;

    @Autowired
    private StockLogDao stockLogDao;

    @Autowired
    private ProductDao productDao;

    @Transactional
    public void newPurchase(PurchaseDetail purchaseDetail){
        purchaseDetailDao.insert(purchaseDetail);
        SkuStock skuStock = new SkuStock();
        skuStock.setId(purchaseDetail.getStockSkuId());
        skuStock.setStock(purchaseDetail.getCounts());
        StockLog stockLog = new StockLog();
        stockLog.setId(new DateId().toString());
        stockLog.setSkuCode(purchaseDetail.getProductSkuCode());
        List<SkuStock> select = skuStockDao.select(skuStock);
        stockLog.setRepositoryId(select.get(0).getRepositoryId());
        stockLog.setLogType(0);
        Date date = new Date();//获取当前时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        stockLog.setTime(calendar.getTime());
        stockLog.setCounts(purchaseDetail.getCounts());
        stockLog.setProductId(purchaseDetail.getProductId());
        Product product = new Product();
        product.setProductId(purchaseDetail.getProductId());
        List<Product> select1 = productDao.select(product);
        Product prod = select1.get(0);
        prod.setStock(select1.get(0).getStock()+purchaseDetail.getCounts());
        productDao.update(prod);
        stockLogDao.insert(stockLog);
        skuStockDao.update(skuStock);
    }
}
