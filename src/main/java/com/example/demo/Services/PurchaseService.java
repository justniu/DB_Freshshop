package com.example.demo.Services;

import com.example.demo.Dao.ProductDao;
import com.example.demo.Dao.PurchaseDetailDao;
import com.example.demo.Dao.SkuStockDao;
import com.example.demo.Dao.StockLogDao;
import com.example.demo.Entities.Product;
import com.example.demo.Entities.PurchaseDetail;
import com.example.demo.Entities.SkuStock;
import com.example.demo.Entities.StockLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    public void newPurchase1(PurchaseDetail purchaseDetail){
        purchaseDetailDao.insert(purchaseDetail);
        SkuStock skuStock = new SkuStock();
        skuStock.setId(purchaseDetail.getStockSkuId());
        skuStock.setStock(purchaseDetail.getCounts());
        StockLog stockLog = new StockLog();
        stockLog.setId(String.format("%s", stockLogDao.queryAll().size()+1));
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

    @Transactional
    public void newPurchase2(PurchaseDetail purchaseDetail){

    }

}
