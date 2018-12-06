package com.bdm.gmall.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bdm.gmall.bean.UserAddress;
import com.bdm.gmall.service.OrderService;
import com.bdm.gmall.service.UserService;

@Service//是spring的@Service注解而非dubbo的
public class OrderServiceImpl implements OrderService {

	//@Autowired
	@Reference(check=false)
	UserService userService;

	/**
	 * 初始化订单
	 */
	public List<UserAddress> initOrder(String userId) {
		// 查询用户的收货地址,需要调用用户服务
		return userService.getUserAddressList(userId);
	}

}
