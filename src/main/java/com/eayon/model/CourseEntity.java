package com.eayon.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eayon on 16/12/9.
 */
@Entity
@Table(name = "Course", schema = "StudentInfoData", catalog = "")
public class CourseEntity {
    private String courseId;
    private String courseName;
    private Short credit;
    private Collection<ScEntity> scsByCourseId;

    @Id
    @Column(name = "Course_id", nullable = false, length = 4)
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "Course_name", nullable = false, length = 20)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "Credit", nullable = true)
    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (courseId != null ? !courseId.equals(that.courseId) : that.courseId != null) return false;
        if (courseName != null ? !courseName.equals(that.courseName) : that.courseName != null) return false;
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId != null ? courseId.hashCode() : 0;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<ScEntity> getScsByCourseId() {
        return scsByCourseId;
    }

    public void setScsByCourseId(Collection<ScEntity> scsByCourseId) {
        this.scsByCourseId = scsByCourseId;
    }
}
