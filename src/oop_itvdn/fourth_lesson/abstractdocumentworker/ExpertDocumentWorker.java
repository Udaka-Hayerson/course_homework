package oop_itvdn.fourth_lesson.abstractdocumentworker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExpertDocumentWorker extends AbstractDocumentWorker {

    @Override
    public String openDocument(String document){
        System.out.println("Document is open in Expert version");
        System.out.println(document);
        return document;
    }

    @Override
    public String editDocument(String document) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(document);
        String edit_document = reader.readLine();
        System.out.println(edit_document);
        document = saveDocument(edit_document);
        return document;
    }

    @Override
    public String saveDocument(String document){
        System.out.println("Document saved in new format using the expert version.");
        return document;
    }
}
