package cn.e3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
import cn.e3.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired 
	private TbItemMapper itemMapper;
	
	/*
	 * 根据Id查询商品
	 */
	public TbItem findTbItembyId(Long itemId) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		
		return tbItem;
	}

}
