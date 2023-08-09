package com.kh.notice.model.vo;

import java.util.List;

public class PageDate {
	private List<Notice> nList;
	private String pageNavi;
	
	public PageDate() {}

	public PageDate(List<Notice> nList, String pageNavi) {
		super();
		this.nList = nList;
		this.pageNavi = pageNavi;
	}

	public List<Notice> getnList() {
		return nList;
	}

	public void setnList(List<Notice> nList) {
		this.nList = nList;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

	@Override
	public String toString() {
		return "PageDate [nList=" + nList + ", pageNavi=" + pageNavi + "]";
	}

}
