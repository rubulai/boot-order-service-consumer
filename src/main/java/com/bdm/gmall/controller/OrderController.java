package com.bdm.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bdm.gmall.bean.UserAddress;
import com.bdm.gmall.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uId") String userId) {
		return orderService.initOrder(userId);
	}
}
