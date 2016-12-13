package com.eayon.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Eayon on 16/12/9.
 */

public class ScEntityPK implements Serializable {
    private String studentId;
    private String courseId;

    @Column(name = "Student_id", nullable = false, length = 15)
    @Id
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Column(name = "Course_id", nullable = false, length = 4)
    @Id
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScEntityPK that = (ScEntityPK) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (courseId != null ? !courseId.equals(that.courseId) : that.courseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        return result;
    }
}
