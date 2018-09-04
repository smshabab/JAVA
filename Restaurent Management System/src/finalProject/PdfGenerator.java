package finalProject;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class PdfGenerator {																										// class PdfGenerator
	
	private String reciptText = Order.text;																						// variable to store 
	
	public PdfGenerator() {																										// constructor
		
		try {																													// try block start
			Document document = new Document(PageSize.A6);																		// document object created
			DbConnection.searchData2();																							// get the order number 
			PdfWriter.getInstance(document, new FileOutputStream("Order-"+Order.orderNumber+".pdf"));							// create instance of document 
			document.open();																									// open document
			Paragraph paragaraph = new Paragraph();																				// create paragaraph object 
			paragaraph.add("ORDER - "+Order.orderNumber+"\n"+reciptText+"TOTAL COST : "+Order.totalCost+"\nPAID CONFIRMED");	// add to paragaraph
			document.add(paragaraph);																							// add paragaraph to documents 
			document.close();																									// close document
		}catch(Exception ex) {																									// catch starts here
			System.out.println(ex);																								// print error
			System.out.println("Error in PdfGenerator class ... !");
		}
		
	}

	
	
}
