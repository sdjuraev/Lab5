public class Search {
    public static String search(String value){
        for (Book book: Library.getCatalog()){
            if (book.getAuthor().contains(value) || book.getTitle().contains(value)){
                book.displayBook();
            }
        }
        return "";
    }
}
