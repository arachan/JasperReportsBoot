package com.jasper;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import org.springframework.stereotype.Component;

/*
 * Deadline Class
 * 
 * 締日の売上データを絞り込むための前月締日と本月締日を生成する。
 * 
 * 
 * 
 */
@Component
public class Deadline {
	// Start Date
	LocalDate startdate;
	// End Date
	LocalDate enddate;
	
	public Deadline(){
		// Start Date
		startdate=LocalDate.now();
		startdate=LocalDate.of(startdate.getYear(), (startdate.minusMonths(1)).getMonth(),26);
		// End Date
		enddate=LocalDate.now();
		enddate=LocalDate.of(enddate.getYear(), enddate.getMonth(), 25);
	}
	
	public String startdate(){
		return startdate.toString();
	}
	
	public String enddate(){
		return enddate.toString();
	}
	
	/*
	 * Jasperreportsは java.timeには対応していないために java.sql.time に変換して渡す
	 */
	public HashMap<String, Object> getParameter(){
		HashMap<String,Object> parameters =new HashMap<>();
		Date sdate=Date.valueOf(startdate);
		Date edate=Date.valueOf(enddate);
		
        parameters.put("startdate",sdate);
        parameters.put("enddate",edate);
               
        return parameters;
	}

}
