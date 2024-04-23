package Task_1;

abstract class Document {
    String filename;

    // Constructor
    public Document(String filename) {
        this.filename = filename;
    }

    // Abstract method process
    abstract void process();
}

// Concrete subclass for PDF documents
class PDFDocument extends Document {
    // Constructor
    public PDFDocument(String filename) {
        super(filename);
    }

    // Implementation of process method for PDF documents
    @Override
    void process() {
        System.out.println("Processing PDF document: \nExtracting Text: " + filename);
        // Logic to extract text from PDF
    }
}

// Concrete subclass for Word documents
class WordDocument extends Document {
    // Constructor
    public WordDocument(String filename) {
        super(filename);
    }

    // Implementation of process method for Word documents
    @Override
    void process() {
        System.out.println("Processing Word document: \nAnalyzing Content: " + filename);
        // Logic to extract text from Word
    }
}

// Concrete subclass for Spreadsheet documents
class SpreadsheetDocument extends Document {
    // Constructor
    public SpreadsheetDocument(String filename) {
        super(filename);
    }

    // Implementation of process method for Spreadsheet documents
    @Override
    void process() {
        System.out.println("Processing Spreadsheet document: \nCalculating Data: " + filename);
        // Logic to calculate data from Spreadsheet
    }
}

// Main class to demonstrate polymorphism
public class DocumentProcessingSystem {
    public static void main(String[] args) {
        // Create an array of Document objects
        Document[] documents = {
            new PDFDocument("sample.pdf"),
            new WordDocument("sample.docx"),
            new SpreadsheetDocument("sample.xlsx")
        };

        // Loop through the array and call the process method for each document
        for (Document doc : documents) {
            doc.process();
        }
    }
}
