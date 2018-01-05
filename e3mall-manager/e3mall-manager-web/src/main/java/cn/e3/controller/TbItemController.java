package cn.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.pojo.TbItem;
import cn.e3.service.ItemService;

@Controller
public class TbItemController {

	@Autowired
	private ItemService itemService;
	
	
	/*
	 * 根据Id查询商品
	 */
	@RequestMapping("item/{itemId}")
	@ResponseBody
	public TbItem findTbItembyId(@PathVariable Long itemId){
		TbItem item = itemService.findTbItembyId(itemId);
		return item;
		
	}
	
}
