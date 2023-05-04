package oop_itvdn.fourth_lesson.abstractdocumentworker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProDocumentWorker extends AbstractDocumentWorker {
    @Override
    public String openDocument(String document){
        System.out.println("Document is open in Pro version");
        System.out.println(document);
        return document;
    }

    @Override
    public String editDocument(String document) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(document);
        String edit_document = reader.readLine();
        System.out.println(edit_document);
        System.out.println(saveDocument(document));
        return document;
    }

    @Override
    public String saveDocument(String document){
        System.out.println("The document is saved in the old format, saving in other formats\n " +
                "available in Expert version.");
        return document;
    }
}
