package rest.json;


public class Track {

    String title;
    String group;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {return "Track [ title: " + title + "group: " + group + "]"; }
}
