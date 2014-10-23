package com.admega.datamodel;

public class Categories {

	int id = 0; 
	String catename = null;
	int cateroot = 0;
	String cateicon = null;
	int active = 0;
	int count_item = 0;
	
	public void Categories(int i,String catename, int cateroot, String cateicon, int active, int count_item){
		this.id = id;
		this.catename= catename;
		this.cateroot = cateroot;
		this.cateicon = cateicon;
		this.active = active;
		this.count_item = count_item;
	}
	
	public int get_ID(){
		return id;
	}
	
	public void set_ID(int id){
		this.id = id;
	}
	
	public String get_Catename(){
		return catename;
	}
	
	public void set_Catename(String catename){
		this.catename = catename;
	}
	
	public String get_Cateicon(){
		return cateicon;
	}
	
	public void set_Cateicon(String cateicon){
		this.cateicon = cateicon;
	}
	
	public int get_Cateroot(){
		return cateroot;
	}
	
	public void set_Cateroot(int cateroot){
		this.cateroot = cateroot;
	}
	
	public int get_active(){
		return active;
	}
	
	public void set_active(int active){
		this.active = active;
	}
	
	public int get_CountItem(){
		return id;
	}
	
	public void set_CountItem(int id){
		this.id = id;
	}
	
	
	
	
	
}
