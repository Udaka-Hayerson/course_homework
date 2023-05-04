package oop_itvdn.third_lesson.documentworker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the document");
        String document = reader.readLine();

        System.out.println("Enter the key(pro or exp) to access the pro version and the expert version, or enter nothing to access the free version.");
        String key = reader.readLine();

        if (key.equals("exp")){
            DocumentWorker expert_document_worker =  new ExpertDocumentWorker();
            document = expert_document_worker.openDocument(document);
            document = expert_document_worker.editDocument(document);
            document = expert_document_worker.saveDocument(document);
        }
        else if (key.equals("pro")){
            DocumentWorker pro_document_worker =  new ProDocumentWorker();
            document = pro_document_worker.openDocument(document);
            document = pro_document_worker.editDocument(document);
            document = pro_document_worker.saveDocument(document);
        }
        else {
            DocumentWorker document_worker =  new DocumentWorker();
            document = document_worker.openDocument(document);
            document = document_worker.editDocument(document);
            document = document_worker.saveDocument(document);
        }

        System.out.println(document);
    }
}
