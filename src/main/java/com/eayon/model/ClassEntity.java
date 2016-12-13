package com.eayon.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eayon on 16/12/9.
 */
@Entity
@Table(name = "Class", schema = "StudentInfoData", catalog = "")
public class ClassEntity {
    private String classId;
    private String grade;
    private String className;
    private Integer sumStu;
    private Collection<StuInfoEntity> stuInfosByClassId;

    @Id
    @Column(name = "Class_id", nullable = false, length = 4)
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "Grade", nullable = true, length = 10)
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "Class_name", nullable = false, length = 40)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "Sum_stu", nullable = true)
    public Integer getSumStu() {
        return sumStu;
    }

    public void setSumStu(Integer sumStu) {
        this.sumStu = sumStu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassEntity that = (ClassEntity) o;

        if (classId != null ? !classId.equals(that.classId) : that.classId != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (sumStu != null ? !sumStu.equals(that.sumStu) : that.sumStu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classId != null ? classId.hashCode() : 0;
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (sumStu != null ? sumStu.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "classByClassId")
    public Collection<StuInfoEntity> getStuInfosByClassId() {
        return stuInfosByClassId;
    }

    public void setStuInfosByClassId(Collection<StuInfoEntity> stuInfosByClassId) {
        this.stuInfosByClassId = stuInfosByClassId;
    }
}
