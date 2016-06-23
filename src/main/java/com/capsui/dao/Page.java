package com.capsui.dao;

import java.util.Collections;
import java.util.List;

/**
 * Created by tancw on 2016/6/23.
 */
public class Page<T> {
	private int total;
	private int pageNo;
	private int pageSize;
	private List<T> items = Collections.emptyList();

	public static <T> Page<T> create(List<T> items, int total) {
		Page page = new Page();
		page.setItems(items);
		page.setTotal(total);
		return page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
}
