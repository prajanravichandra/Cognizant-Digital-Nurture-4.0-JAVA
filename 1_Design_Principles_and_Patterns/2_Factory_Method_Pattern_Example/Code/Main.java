public class Main {
    public static void main(String[] args) {
        Document wordDocument = new WordDocumentFactory().createDocument();
        wordDocument.readDocument();

        Document excelDocument = new ExcelDocumentFactory().createDocument();
        excelDocument.readDocument();

        Document pdfDocument = new PdfDocumentFactory().createDocument();
        pdfDocument.readDocument();
    }
}
