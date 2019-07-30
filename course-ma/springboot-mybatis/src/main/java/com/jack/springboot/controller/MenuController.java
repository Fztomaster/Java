package com.jack.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jack.springboot.model.Menu;
import com.jack.springboot.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/list")
	public List<Menu> findAll() {
		return menuService.findAll();
	}
	
	@RequestMapping("/id")
	public Menu findById(@RequestParam Integer id) {
		return menuService.findById(id);
	}
	
	@RequestMapping("/page")
	public List<Menu> findByPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
		return menuService.findByPage(pageNum, pageSize);
	}
}
