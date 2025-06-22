public class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        System.out.println("New Excel Doc created.");
        return new ExcelDocument();
    }
}
