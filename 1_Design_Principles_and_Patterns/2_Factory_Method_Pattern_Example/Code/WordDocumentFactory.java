public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
         System.out.println("New Word Doc created.");
        return new WordDocument();
    }
}
