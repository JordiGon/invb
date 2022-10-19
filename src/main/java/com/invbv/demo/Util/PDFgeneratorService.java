package com.invbv.demo.Util;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.InventoryResponseDao;
import com.invbv.demo.response.SuministroResponse;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.Color;

import antlr.collections.List;

@Service
public class PDFgeneratorService {

    @Autowired
    InventoryResponseDao dao;

    /**
     * @param response
     * @throws IOException
     * @throws DocumentException
     */
    public void export(HttpServletResponse response) throws IOException {
        final Document document = new Document(PageSize.A4.rotate());
        PdfWriter.getInstance(document, response.getOutputStream());
        java.util.List<SuministroResponse> suministros = dao.findInventory();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        document.open();
        document.setMargins(0, 0, 0, 0);
        Font fontTittle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTittle.setSize(12);

        Paragraph paragraph = new Paragraph(
                "INVENTARIO DE LA 29a. COMPAÑÍA DE BOMBEROS VOLUNTARIOS DE AMATITLAN A LA FECHA "
                        + formatter.format(date),
                fontTittle);
        paragraph.setAlignment(paragraph.ALIGN_CENTER);

        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);

        fontParagraph.setSize(12);

        Paragraph paragraph2 = new Paragraph("DIRECCION: 3a. Avenida 3-16, Barrio La Cruz, Amatitlán", fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_CENTER);

        Table table = new Table(10);
        table.setSpacing(0);
        Font fontheaderstable = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontheaderstable.setSize(9);
        Cell cell2 = new Cell();
        cell2.add(new Phrase("id", fontParagraph));
        cell2.setBackgroundColor(Color.lightGray);
        table.addCell(cell2);
        Cell cell3 = new Cell();
        cell3.setBackgroundColor(Color.lightGray);
        table.addCell(cell3);
        Cell cell4 = new Cell();
        cell4.add(new Phrase("Cantidad", fontheaderstable));
        cell4.setBackgroundColor(Color.lightGray);
        table.addCell(cell4);
        Cell cell5 = new Cell();
        cell5.add(new Phrase("Descripcion", fontheaderstable));
        cell5.setBackgroundColor(Color.lightGray);
        table.addCell(cell5);
        Cell cell6 = new Cell();
        cell6.add(new Phrase("Nombre", fontheaderstable));
        cell6.setBackgroundColor(Color.lightGray);
        table.addCell(cell6);
        Cell cell7 = new Cell();
        cell7.add(new Phrase("Valor unitario", fontheaderstable));
        cell7.setBackgroundColor(Color.lightGray);
        table.addCell(cell7);
        Cell cell8 = new Cell();
        cell8.add(new Phrase("Total", fontheaderstable));
        cell8.setBackgroundColor(Color.lightGray);
        table.addCell(cell8);
        Cell cell9 = new Cell();
        cell9.add(new Phrase("Activo/Baja", fontheaderstable));
        cell9.setBackgroundColor(Color.lightGray);
        table.addCell(cell9);
        Cell cell10 = new Cell();
        cell10.add(new Phrase("Donacion", fontheaderstable));
        cell10.setBackgroundColor(Color.lightGray);
        table.addCell(cell10);
        Cell cell11 = new Cell();
        cell11.add(new Phrase("Ubicacion", fontheaderstable));
        cell11.setBackgroundColor(Color.lightGray);
        table.addCell(cell11);

        for (SuministroResponse sum : suministros) {
            DecimalFormat df = new DecimalFormat("##.###");
            table.addCell(new Phrase(sum.getId_inventario().toString()));
            table.addCell(new Phrase(sum.getCategoria()));
            table.addCell(new Phrase(sum.getCantidad().toString()));
            table.addCell(new Phrase(sum.getDescripcion_producto()));
            table.addCell(new Phrase(sum.getNombre_producto()));
            // Long aux = Math.round(sum.getValor_unitario());
            table.addCell(new Phrase("Q." + df.format(sum.getValor_unitario())));
            // Long aux2 = Math.round(sum.getTotal());
            table.addCell(new Phrase("Q." + df.format(sum.getTotal())));
            table.addCell(new Phrase(sum.getActivo_baja()));
            table.addCell(new Phrase(sum.getDonacion()));
            table.addCell(new Phrase(sum.getUbicacion()));
        }
        table.setWidths(new float[] { 1.5f, 3.5f, 2.5f, 5.0f, 3.5f, 2.0f, 2.0f, 3.5f, 2.5f, 2.5f });
        document.add(paragraph);
        document.add(paragraph2);
        document.add(table);

        document.close();
    }
}
