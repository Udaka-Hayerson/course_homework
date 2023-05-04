package oop_itvdn.third_lesson.documentworker;

//Требуется:
//Создайте класс DocumentWorker.
//В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
//В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
//"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
//Создайте производный класс ProDocumentWorker.
//Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
//"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
//доступно в версии Эксперт".
//Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
//Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
//"Документ сохранен в новом формате".
//В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
//Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
//экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
//экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.

public class DocumentWorker {

    public String openDocument(String document){
        System.out.println("Document is open");
        System.out.println(document);
        return document;
    }

    public String editDocument(String document) throws Exception {
        System.out.println("Edit document available in pro version");
        System.out.println(document);
        return document;
    }

    public String saveDocument(String document){
        System.out.println("Saving a document is available in the Pro version");
        document = "";
        return document;
    }
}
