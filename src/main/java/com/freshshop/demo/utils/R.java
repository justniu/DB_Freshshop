package com.freshshop.demo.utils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
	@ApiModelProperty(value = "是否成功")
    private Boolean success;
    @ApiModelProperty(value = "返回码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<>();
    
    private R() {
    	
    }
    
    public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	// success
	public static R ok() {
    	R r = new R();
    	r.setSuccess(true);
    	r.setCode(ResultCode.SUCCESS);
    	r.setMessage("success");
    	return r;
    }
	
	// error
    public static R error() {
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("error");
        return r;
    }
    
    // 下面是链式编程 直接copy
    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }
 
    public R message(String message) {
        this.setMessage(message);
        return this;
    }
 
    public R code(Integer code) {
        this.setCode(code);
        return this;
    }
 
    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
 
    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
