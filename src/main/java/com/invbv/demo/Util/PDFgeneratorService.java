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
import com.lowagie.text.alignment.HorizontalAlignment;
import com.lowagie.text.alignment.VerticalAlignment;
import com.lowagie.text.alignment.WithVerticalAlignment;
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

        Paragraph paragraph2 = new Paragraph("DIRECCION: 3a. Avenida 3-16, Barrio La Cruz, Amatitlán" + "\n\n",
                fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_CENTER);

        PdfPTable table = new PdfPTable(10);
        table.setSpacingAfter(10);
        Font fontheaderstable = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontheaderstable.setSize(9);
        // Cell cell2 = new Cell();
        // cell2.add(new Phrase("Id", fontheaderstable));
        // cell2.setBackgroundColor(Color.lightGray);
        // cell2.setHorizontalAlignment(HorizontalAlignment.CENTER);
        PdfPCell cellaux = new PdfPCell(new Phrase("Id", fontheaderstable));
        cellaux.setBackgroundColor(Color.lightGray);
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Categoria", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Cantidad", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Descripcion", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Nombre", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Valor Unitario", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Total", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Activo/Baja", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Donacion", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        cellaux = new PdfPCell(new Phrase("Ubicacion", fontheaderstable));
        cellaux.setPaddingBottom(10);
        cellaux.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cellaux.setBackgroundColor(Color.lightGray);
        table.addCell(cellaux);
        Font fontValues = FontFactory.getFont(FontFactory.HELVETICA);
        fontValues.setSize(9);
        for (SuministroResponse sum : suministros) {
            DecimalFormat df = new DecimalFormat("##.###");
            Cell id = new Cell();
            PdfPCell cells = new PdfPCell(new Phrase(sum.getId_inventario().toString(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase(sum.getCategoria(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase(sum.getCantidad().toString(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase(sum.getDescripcion_producto(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase(sum.getNombre_producto(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase("Q." + df.format(sum.getValor_unitario()), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase("Q." + df.format(sum.getTotal()), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            // Long aux = Math.round(sum.getValor_unitario());
            // Long aux2 = Math.round(sum.getTotal());
            cells = new PdfPCell(new Phrase(sum.getActivo_baja(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase(sum.getDonacion(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
            cells = new PdfPCell(new Phrase(sum.getUbicacion(), fontValues));
            cells.setPaddingBottom(10);
            cells.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cells);
        }
        table.setWidths(new float[] { 1.5f, 3.5f, 2.5f, 5.0f, 3.5f, 2.0f, 2.0f, 3.5f, 2.5f, 2.5f });
        document.add(paragraph);
        document.add(paragraph2);
        document.add(table);

        document.close();
    }
}
