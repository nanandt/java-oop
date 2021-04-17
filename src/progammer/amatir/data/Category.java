package progammer.amatir.data;

public class Category {
    private String id;
    private boolean expensive;

    public String getId() { // getter
        return id;
    }

    public void setId(String id) { // setter
        if (id != null) {
            this.id = id;
        }

    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}