package com.glsywow.app.common;

public class CommonParam {
	private static ThreadLocal<CommonParam> threadLocal = new ThreadLocal<CommonParam>();
	
	public static CommonParam getInstance(){
		CommonParam param = threadLocal.get();//每个线程对应一个实例
		if(param ==null){
			param = new CommonParam();
			threadLocal.set(param);
		}
		return param;
	}
	
	public static void remove(){
		threadLocal.remove();
	}
	
	//----------------------------------------------------------
	private int tenantIndex=-1;
	private String tenantId = "";

	public int getTenantIndex() {
		return tenantIndex;
	}

	public void setTenantIndex(int tenantIndex) {
		this.tenantIndex = tenantIndex;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public void setTenantIdAndIndex(String tenantId){
		this.tenantId = tenantId;
		this.setTenantIndex(Integer.parseInt(tenantId) - 1);
	}
}
