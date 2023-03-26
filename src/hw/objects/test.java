package hw.objects;

public class test {
    public static void main(String[] args) {
        AuthorName neilGeiman = new AuthorName("Neil", "Gaiman");
        AuthorName adamNevill = new AuthorName("Adam", "Nevill");
        Book ritual = new Book("The Ritual", adamNevill, 2011);
        Book fangs = new Book("Fangs", neilGeiman, 2014);
        System.out.println(ritual.getName()+" "+ adamNevill.getname() +" "+ adamNevill.getSurname()+" "+ritual.getPublishYear());
        System.out.println(fangs.getName()+ " "+ neilGeiman.getname() +" "+neilGeiman.getSurname()+  " " + fangs.getPublishYear());
        fangs.setPublishYear(2022);
        System.out.println("Изменен год публикации у " + fangs.getName() + ". Новый год" + fangs.getPublishYear());
        }
}

