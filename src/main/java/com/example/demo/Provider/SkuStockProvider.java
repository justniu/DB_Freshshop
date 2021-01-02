package com.example.demo.Provider;

import com.example.demo.Entities.SkuStock;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class SkuStockProvider {
    public String selectWithParams(Map<String, Object> param){
        return new SQL(){
            {
                SELECT("*");
                FROM("sku_stock");
                if(param.get("skuId") != null){
                    WHERE("SKU_ID=#{skuId}");
                }
                if(param.get("stock") != null){
                    WHERE("STOCK=#{stock}");
                }
                if(param.get("lowStock") != null){
                    WHERE("LOW_STOCK=#{lowStock}");
                }
                if(param.get("repositoryId") != null){
                    WHERE("REPOSITORY_ID=#{repositoryId}");
                }
                if(param.get("id") != null){
                    WHERE("ID=#{id}");
                }
            }
        }.toString();
    }

    public String dynamicInsert(SkuStock skustock){
        return new SQL(){
            {
                INSERT_INTO("sku_stock");
                if(skustock.getSkuId() != null){
                    VALUES("SKU_ID", "#{skuId}");
                }
                if(skustock.getStock() != null){
                    VALUES("STOCK", "#{stock}");
                }
//                if(skustock.getLowStock() != null){
//                    VALUES("LOW_STOCK", "#{lowStock}");
//                }
                if(skustock.getRepositoryId() != null){
                    VALUES("REPOSITORY_ID", "#{repositoryId}");
                }
                if(skustock.getId() != null){
                    VALUES("ID", "#{id}");
                }
            }
        }.toString();
    }
}
