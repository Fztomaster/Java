package com.jack.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jack.springboot.mapper.MenuMapper;
import com.jack.springboot.model.Menu;
import com.jack.springboot.model.MenuExample;

@Service
public class MenuService {

	@Autowired
	private MenuMapper menuMapper;
	
	public List<Menu> findAll() {
		MenuExample example = new MenuExample();		
		List<Menu> menus = menuMapper.selectByExample(example);
		return menus;
	}
	
	public Menu findById(Integer id) {
		return menuMapper.selectByPrimaryKey(id);
	}
	
	public List<Menu> findByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		MenuExample example = new MenuExample();
		return menuMapper.selectByExample(example);
	}
}
