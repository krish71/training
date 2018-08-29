package view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import entity.Flight;

public class Example7PdfView extends AbstractPdfView {

	protected void buildPdfDocument(
	        Map model,
	        Document doc,
	        PdfWriter writer,
	        HttpServletRequest req,
	        HttpServletResponse resp)
	        throws Exception {
	        
	        List<Flight> flights = (List<Flight>) model.get("flights");

	       for(Flight flight : flights)
	            doc.add(new Paragraph(flight.toString()));
	    }
}
