package com.action.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.action.entity.City;
import com.action.entity.Org;
import com.action.entity.Provice;
import com.opensymphony.xwork2.ActionSupport;

public class OrgAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Org org;
	private Map<Integer, List<City>> cityMap;
	 
	private List<Provice> provinceList;
	
	public Map<Integer, List<City>> getCityMap() {
		return cityMap;
	}

	public void setCityMap(Map<Integer, List<City>> cityMap) {
		this.cityMap = cityMap;
	}

	public List<Provice> getProvinceList() {
		return provinceList;
	}

	public void setProvinceList(List<Provice> provinceList) {
		this.provinceList = provinceList;
	}

	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public String execute(){
		
		 provinceList= new ArrayList<Provice>();
	        
	        Provice province;
	        province = new Provice();
	        province.setId(1);
	        province.setName("中国");
	        provinceList.add(province);


	        province = new Provice();
	        province.setId(1);
	        province.setName("外国");
	        provinceList.add(province);

	 

	        cityMap= new HashMap<Integer, List<City>>();

	        List<City> cityList = new ArrayList<City>();
	        City city;
	        city = new City();
	        city .setId(1);
	        city .setName("北京");
	        cityList.add(city);

	        city = new City();
	        city .setId(2);
	        city .setName("南京");
	        cityList.add(city);       

	        cityMap.put(1, cityList);

	 

	        cityList = new ArrayList<City>();

	        city = new City();
	        city .setId(3);
	        city .setName("美国");
	        cityList.add(city);

	        city = new City();
	        city .setId(4);
	        city .setName("日本");
	        cityList.add(city);       

	        cityMap.put(2 ,cityList);
	        
	        addActionError("ae");
	        addActionMessage("am");
	        addFieldError("fe", "fe");
		return SUCCESS;
	}
	public String getOrgw(){
		
		return SUCCESS;
	}
}
