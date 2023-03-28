package hw.objects;

public class test {
    public static void main(String[] args) {
        AuthorName neilGeiman = new AuthorName("Neil", "Gaiman");
        AuthorName adamNevill = new AuthorName("Adam", "Nevill");
        Book ritual = new Book("The Ritual", adamNevill, 2011);
        Book fangs = new Book("Fangs", neilGeiman, 2014);
        System.out.println(ritual.getName()+" "+ adamNevill +" "+ " " + ritual.getPublishYear());
        System.out.println(fangs.getName()+ " "+ neilGeiman +" "+ " " + fangs.getPublishYear());
        if (neilGeiman.equals(adamNevill)) {
            System.out.println("Разные авторы");
        }else {
            System.out.println("Один автор");
        }
        fangs.setPublishYear(2022);
        System.out.println("Изменен год публикации у " + fangs.getName() + ". Новый год " + fangs.getPublishYear());

                }
}

