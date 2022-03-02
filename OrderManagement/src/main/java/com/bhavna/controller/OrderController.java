package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.model.Orders;
import com.bhavna.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	
	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrders() {
		return service.getAllOrders();
	}
	
	@GetMapping("/get/Order/{orderId}")
	public Orders getOrderById(@PathVariable Long orderId) {
		return service.getOrderById(orderId);
	}
	
	@PostMapping("/postOrder")
	public Orders postOrder(@RequestBody Orders order) {
		return service.postOrder(order);
	}
	
	@PutMapping("/updateOrder")
	public Orders updateOrder(@RequestBody Orders order) {
		return service.updateOrder(order);
	}
	
	@PatchMapping("/updateOrder/{orderId}")
	public Orders patchOrder(@PathVariable Long orderId, @RequestParam(name = "ProductId", required=false) Long productId,  @RequestParam(name = "Quantity", required=false) Integer quantity) {
		return service.patchOrder(orderId,productId,quantity);
	}
	
	@DeleteMapping("/deleteOrder/{orderId}")
	public void deleteOrderById(@PathVariable Long orderId) {
		service.deleteOrderById(orderId);
	}
}