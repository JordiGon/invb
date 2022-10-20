/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.util;

import com.invbv.demo.model.Cargo;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.IOException;

import java.util.List;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Andres Solorzano
 */
public class CargoPDF {
    private List<Cargo> listCargo;

  

    
    private void writeTableHeader(PdfPTable table){
        PdfPCell cell = new PdfPCell();
        cell.setPhrase(new Phrase("Cargo Id") );
        table.addCell(cell);
        cell.setPhrase(new Phrase ("descripcion"));
        table.addCell(cell);
    }
    
    private void writeTableData(PdfPTable table){}
    
    public void export(HttpServletResponse response) throws IOException{
            Document document = new Document(PageSize.A4);
            
            PdfWriter.getInstance(document, response.getOutputStream());
            
            document.open();
            document.add(new Paragraph("Listar todos los cargos"));
            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(100);
            writeTableHeader(table);
            writeTableData(table);
            
            document.add(table);
            document.close();
            }
    
}
