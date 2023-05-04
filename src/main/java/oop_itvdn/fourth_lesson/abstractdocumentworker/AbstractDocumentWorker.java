package oop_itvdn.fourth_lesson.abstractdocumentworker;

abstract class AbstractDocumentWorker {

    abstract String openDocument(String document);

    abstract String editDocument(String document) throws Exception ;

    abstract String saveDocument(String document);
}
