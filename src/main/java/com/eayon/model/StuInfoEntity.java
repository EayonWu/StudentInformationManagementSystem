package com.eayon.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Eayon on 16/12/9.
 */
@Entity
@Table(name = "Stu_Info", schema = "StudentInfoData", catalog = "")
public class StuInfoEntity {
    private String studentId;
    private String studentName;
    private String sex;
    private String birthdate;
    private String nation;
    private Date entranceDate;
    private String homeAddress;
    private String politic;
    private ClassEntity classByClassId;
    private Collection<ScEntity> scsByStudentId;

    public void setEntranceDate(java.sql.Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    @ManyToOne
    @JoinColumn(name = "Class_id", referencedColumnName = "Class_id", nullable = false)
    public ClassEntity getClassByClassId() {
        return classByClassId;
    }

    public void setClassByClassId(ClassEntity classByClassId) {
        this.classByClassId = classByClassId;
    }

    @Id
    @Column(name = "Student_id", nullable = false, length = 15)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "Student_name", nullable = false, length = 10)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "Sex", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "Birthdate", nullable = true, length = 8)
    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "Nation", nullable = true, length = 10)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "Entrance_date", nullable = true)
    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    @Basic
    @Column(name = "Home_address", nullable = true, length = 40)
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Basic
    @Column(name = "Politic", nullable = true, length = 10)
    public String getPolitic() {
        return politic;
    }

    public void setPolitic(String politic) {
        this.politic = politic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StuInfoEntity that = (StuInfoEntity) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (entranceDate != null ? !entranceDate.equals(that.entranceDate) : that.entranceDate != null) return false;
        if (homeAddress != null ? !homeAddress.equals(that.homeAddress) : that.homeAddress != null) return false;
        if (politic != null ? !politic.equals(that.politic) : that.politic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (entranceDate != null ? entranceDate.hashCode() : 0);
        result = 31 * result + (homeAddress != null ? homeAddress.hashCode() : 0);
        result = 31 * result + (politic != null ? politic.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "stuInfoByStudentId")
    public Collection<ScEntity> getScsByStudentId() {
        return scsByStudentId;
    }

    public void setScsByStudentId(Collection<ScEntity> scsByStudentId) {
        this.scsByStudentId = scsByStudentId;
    }
}
