package com.jim.yygh.entity.vo;

/**
 * 
 * <p>Title: SysuserQueryVo</p>
 * <p>Description:包装类，用于页面向action传递参数，将数据传到mybatis </p>
 * 
 */
public class SysuserQueryVo {
	
	//分页参数
	private PageQuery pageQuery;
	//用户的查询条件
	private SysuserCustom sysuserCustom;
	//可以扩展多个属性
	//....

	public SysuserCustom getSysuserCustom() {
		return sysuserCustom;
	}

	public void setSysuserCustom(SysuserCustom sysuserCustom) {
		this.sysuserCustom = sysuserCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	

}
