package com.invbv.demo.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.invbv.demo.Util.PDFgeneratorService;

@Controller
@RequestMapping(value = "/generate")
public class PDFExportController {
    @Autowired
    PDFgeneratorService pdFgeneratorService;

    @GetMapping(value = "/pdf")
    public void generatePDF(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Inventario" + currentDateTime + ".pdf";

        response.setHeader(headerKey, headerValue);

        pdFgeneratorService.export(response);
    }
}
