public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        System.out.println("New PDF Doc created.");
        return new PdfDocument();
    }
}
