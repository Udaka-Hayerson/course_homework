package oop_itvdn.fourth_lesson.abstractdocumentworker;


public class DocumentWorker extends AbstractDocumentWorker{

    @Override
    public String openDocument(String document){
        System.out.println("Document is open");
        System.out.println(document);
        return document;
    }

    @Override
    public String editDocument(String document) throws Exception {
        System.out.println("Edit document available in pro version");
        System.out.println(document);
        return document;
    }

    @Override
    public String saveDocument(String document){
        System.out.println("Saving a document is available in the Pro version");
        document = "";
        return document;
    }
}
