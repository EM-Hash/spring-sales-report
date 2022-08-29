package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SalesReportApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext();
        spring.register(AppConfig.class);
        spring.refresh();

        SalesReportTool tool = (SalesReportTool)spring.getBean("salesReportTool");
        tool.readSales();
        tool.applyShipping();
        tool.generateReport();
    }
}
