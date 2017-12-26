package com.jasper;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@RestController
public class pdfController {
	private JasperReport report;
	
    @Autowired
    ApplicationContext context;

	/*private pdfController(@Value("classpath:jasperreports/test_old.jrxml") Resource jrxml) throws Exception {
	        try (InputStream inputStream = jrxml.getInputStream()) {
	            this.report = JasperCompileManager.compileReport(inputStream);
	        }
	}*/
	
	@GetMapping(path = "pdf/{jrxml}")
    public void getPdf(@PathVariable String jrxml,@RequestParam(name = "name", defaultValue = "山田") String name, HttpServletResponse response) throws Exception {
		Resource resource = context.getResource("classpath:jasperreports/"+jrxml+".jrxml");
        System.out.println(resource.toString());
        InputStream inputStream = resource.getInputStream();
		this.report=JasperCompileManager.compileReport(inputStream);
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        JRDataSource dataSource = new JREmptyDataSource();
        JasperPrint jasperPrint = JasperFillManager.fillReport(report, params, dataSource);
        response.setContentType(MediaType.APPLICATION_PDF_VALUE);
        JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
    }
}
