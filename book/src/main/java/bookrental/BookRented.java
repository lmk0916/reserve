package bookrental;

public class BookRented extends AbstractEvent {

    private Long id;
    private Long askId;
    private String status;

    public BookRented(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getAskId() {
        return askId;
    }

    public void setAskId(Long bookId) {
        this.askId = askId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
