package com.freshshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.freshshop.demo.entity.OrderAndDetail;
import com.freshshop.demo.entity.StockLog;
import com.freshshop.demo.entity.UserOrderDetail;
import com.freshshop.demo.mapper.SkuStockDao;
import com.freshshop.demo.mapper.StockLogDao;
import com.freshshop.demo.mapper.UserOrderDetailDao;
import com.freshshop.demo.service.UserOrderService;
import com.freshshop.demo.utils.DateId;
import com.freshshop.demo.utils.R;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userOrder")
public class UserOrderDetailController {

    @Autowired
    private UserOrderDetailDao userOrderDetailDao;
    
    @Autowired
    private UserOrderService userOrderService;
    
    @Autowired
    private SkuStockDao skuStockDao;
    
    @Autowired
    StockLogDao stockLogDao;

    @PostMapping
    public String insert(@RequestBody UserOrderDetail userOrderDetail){
//        UserOrderDetail userOrderDetail = new UserOrderDetail();
//        userOrderDetail.setUserOrderDetailId("1");
//        userOrderDetail.setUserOrderDetailDiscount(0.9f);
//        userOrderDetail.setUserOrderDetailPrice(100);
//        userOrderDetail.setUserOrderDetailProductId("26");
//        userOrderDetail.setStockSkuId("4");
//        userOrderDetail.setProductSkuCode("100005368902");
//        userOrderDetail.setUserOrderDetailSpend(90);
//        userOrderDetail.setUserOrderDetailNumber(1);
//        userOrderDetail.setUserOrderDetailOrderId("5ff03e300e3a508e69ba1bc7");
        userOrderDetailDao.addUserOrderDetail(userOrderDetail);
        return "userOrder";
    }
    @GetMapping("/lists")
    public List<UserOrderDetail> queryAll(){
        List<UserOrderDetail> userOrderDetails = userOrderDetailDao.queryAll();
        return userOrderDetails;
    }

    @GetMapping("/list")
    public List<UserOrderDetail> query(@RequestParam Map<String, Object> param){
        return userOrderDetailDao.query(param);
    }
    /**
     * 查询某个用户购买商品记录
     */
    @GetMapping("/goods")
    public Map<Object, Object> queryByUserId(@RequestParam String userId){
        return userOrderService.queryAllDetail(userId);
    }


    @GetMapping("/insertOrder") // 插入订单和明细
    public R insertOrder(@RequestBody OrderAndDetail params) {
    	try {
    		// 订单主表
    		userOrderService.insert(params.getUserOrder());
    		List<UserOrderDetail> list = params.getUserOrderDetail();
    		for (int i = 0; i < list.size(); i++) {
    			// 订单明细表
    			userOrderDetailDao.insert(list.get(i));
    			// ----------
    			StockLog stockLog = new StockLog();
    			stockLog.setId(new DateId().toString()); // id
    			stockLog.setRepositoryId(skuStockDao.selectRepositoryId(list.get(i).getStockSkuId())); // repositoryId
    			stockLog.setProductId(list.get(i).getUserOrderDetailProductId()); // productId
    			stockLog.setSkuCode(list.get(i).getProductSkuCode()); // ProductSkuCode
    			stockLog.setTime(new Date()); // time
    			stockLog.setCounts(list.get(i).getUserOrderDetailNumber()); // Counts 
    			stockLog.setLogType(1); // logType-1 销售
    			System.out.println("---1---");
    			// 增加出库数据
    			stockLogDao.insert(stockLog);
    			// 修改库存数量
    			skuStockDao.updateSkuStock(list.get(i).getUserOrderDetailNumber(), list.get(i).getStockSkuId());
			}
    		
    		return R.ok().data("insert","success");
		} catch (Exception e) {
			return R.error().data("insert","fail");
		}
    	
    }
}
