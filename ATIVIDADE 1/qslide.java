public class Post {
    private Status status;
    private String text;

   

    public void publish() {
        validate(); 
        setStatus(Status.PUBLISHED);
    }

    private void validate() {
        if (status != Status.DRAFT) {
            throw new RuntimeException("A post must be in draft status to be published");
        }
        if (text.trim().length() == 0) {
            throw new RuntimeException("A post must have at least one character");
        }
    }
}
