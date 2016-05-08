package com.convertor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.action.entity.Org;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

/**
 * 自定义类型转换器
 * @author Administrator
 *
 */
public class OrgConvertor extends DefaultTypeConverter{
	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		// TODO Auto-generated method stub
		if(toType == String.class){
			Org org = (Org)value;
			return (Object) org.getOrgName() + "," + org.getBz() + "," + org.getZfbz();
		}
		if(toType == Org.class){
			String pm[] = (String[]) value;
			String v = pm[0];
			String tag[] = v.split(",");
			Org org = new Org();
			for(int i=0;i<tag.length;i++){
				if(i==0){
					org.setOrgName(tag[i]);
				}
				if(i==1){
					
					try {
						org.setBz(new SimpleDateFormat("yyyy-MM-dd").parse(tag[i]+""));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(i==2){
					org.setZfbz(Integer.parseInt(tag[i]));
				}
				if(i==3){
					org.setEmail(tag[i]);;
				}
			}
			return org;
		}
		return null;
	}

}
