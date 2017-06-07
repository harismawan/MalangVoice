package net.gumcode.malangvoice.model;

/**
 * Created by A. Fauzi Harismawan on 1/6/2016.
 */
public class Page {

    private final int id;
    private final String title;
    private final String content;

    public Page(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
