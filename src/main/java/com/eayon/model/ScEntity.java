package com.eayon.model;

import javax.persistence.*;

/**
 * Created by Eayon on 16/12/9.
 */
@Entity
@Table(name = "SC", schema = "StudentInfoData", catalog = "")
@IdClass(ScEntityPK.class)
public class ScEntity {
    @Id
    private String studentId;
    @Id
    private String courseId;
    private String score;
    private short scSemester;
    private short schoolYear;
    private CourseEntity courseByCourseId;
    private StuInfoEntity stuInfoByStudentId;

    @Id
    @Column(name = "Student_id", nullable = false, length = 15)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Id
    @Column(name = "Course_id", nullable = false, length = 4)
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "Score", nullable = false, length = 10)
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Basic
    @Column(name = "SC_semester", nullable = false)
    public short getScSemester() {
        return scSemester;
    }

    public void setScSemester(short scSemester) {
        this.scSemester = scSemester;
    }

    @Basic
    @Column(name = "School_year", nullable = false)
    public short getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(short schoolYear) {
        this.schoolYear = schoolYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScEntity scEntity = (ScEntity) o;

        if (scSemester != scEntity.scSemester) return false;
        if (schoolYear != scEntity.schoolYear) return false;
        if (studentId != null ? !studentId.equals(scEntity.studentId) : scEntity.studentId != null) return false;
        if (courseId != null ? !courseId.equals(scEntity.courseId) : scEntity.courseId != null) return false;
        if (score != null ? !score.equals(scEntity.score) : scEntity.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (int) scSemester;
        result = 31 * result + (int) schoolYear;
        return result;
    }

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "Course_id", referencedColumnName = "Course_id")
    public CourseEntity getCourseByCourseId() {
        return courseByCourseId;
    }

    public void setCourseByCourseId(CourseEntity courseByCourseId) {
        this.courseByCourseId = courseByCourseId;
    }

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "Student_id", referencedColumnName = "Student_id")
    public StuInfoEntity getStuInfoByStudentId() {
        return stuInfoByStudentId;
    }

    public void setStuInfoByStudentId(StuInfoEntity stuInfoByStudentId) {
        this.stuInfoByStudentId = stuInfoByStudentId;
    }
}
