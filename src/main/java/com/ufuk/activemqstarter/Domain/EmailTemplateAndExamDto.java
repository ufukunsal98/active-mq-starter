package com.ufuk.activemqstarter.Domain;



import java.util.List;

/**
 * @author ufukremzi
 */


public class EmailTemplateAndExamDto {

    private String examType;

    private List<String> instructorList;

    private String title;

    private String body;

    private String mailTemplate;

    public String getMailTemplate() {
        return mailTemplate;
    }

    public void setMailTemplate(String mailTemplate) {
        this.mailTemplate = mailTemplate;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public List<String> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<String> instructorList) {
        this.instructorList = instructorList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
