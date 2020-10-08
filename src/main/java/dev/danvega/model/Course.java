package dev.danvega.model;

public class Course {

    private int courseId;
    private String title;
    private String description;
    private String link;

    public Course() { }

    public Course(String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public Course(int courseId, String title, String description, String link) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}