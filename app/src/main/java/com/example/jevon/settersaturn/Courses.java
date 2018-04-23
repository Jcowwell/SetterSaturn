package com.example.jevon.settersaturn;


import static com.example.jevon.settersaturn.BasicHelper.*;


/**
 * Created by Jevon on 4/13/18.
 */


// TODO: - CREATE COURSES HELPER OBJECT & COURSE SCRAPER HELPER

public class Courses {

    private String courseTitle;
    private String courseNumber;
    private String courseRegistrationNumber;
    private String Instructor; // TODO: - CREATE OBJECT
    private String courseTimePeriod;
    private String courseDays;
    private String courseDescription;
    private String corequistes;
    private String prerequisites;
    private String courseRotation;
    private String courseMaterials;
    private String fees;
    private String sectionComments;
    //https://appsrv.pace.edu/ScheduleExplorerlive/section.cfm?crn=72285&term=201870 Example
    private String courseURL;
    private ScheduleType scheduleType;
    private School school;
    private int seatAvailability;
    private boolean isClosed;
    private boolean isFavored;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseRegistrationNumber() {
        return courseRegistrationNumber;
    }

    public void setCourseRegistrationNumber(String courseRegistrationNumber) { this.courseRegistrationNumber = courseRegistrationNumber;}

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }

    public String getCourseTimePeriod() {
        return courseTimePeriod;
    }

    public void setCourseTimePeriod(String courseTimePeriod) { this.courseTimePeriod = courseTimePeriod;}

    public String getCourseDays() {
        return courseDays;
    }

    public void setCourseDays(String courseDays) {
        this.courseDays = courseDays;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) { this.courseDescription = courseDescription; }

    public String getCorequistes() {
        return corequistes;
    }

    public void setCorequistes(String corequistes) {
        this.corequistes = corequistes;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getCourseRotation() {
        return courseRotation;
    }

    public void setCourseRotation(String courseRotation) {
        this.courseRotation = courseRotation;
    }

    public String getCourseMaterials() {
        return courseMaterials;
    }

    public void setCourseMaterials(String courseMaterials) { this.courseMaterials = courseMaterials; }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) { this.fees = fees; }

    public String getSectionComments() { return sectionComments; }

    public void setSectionComments(String sectionComments) { this.sectionComments = sectionComments; }

    public String getScheduleType() { return scheduleType.toString(); }

    public void setScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getSchool() { return school.toString(); }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getSeatAvailability() {
        return seatAvailability;
    }

    public void setSeatAvailability(int seatAvailability) { this.seatAvailability = seatAvailability;}

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isFavored() {
        return isFavored;
    }

    public void setFavored(boolean favored) {
        isFavored = favored;
    }



}
