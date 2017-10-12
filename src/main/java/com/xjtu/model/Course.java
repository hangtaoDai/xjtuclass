package com.xjtu.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Course implements Serializable {
    private Integer courseid;

    private String coursename;

    private String courselink1;

    private String courselink2;

    private String courselink3;

    private static final long serialVersionUID = 1L;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourselink1() {
        return courselink1;
    }

    public void setCourselink1(String courselink1) {
        this.courselink1 = courselink1;
    }

    public String getCourselink2() {
        return courselink2;
    }

    public void setCourselink2(String courselink2) {
        this.courselink2 = courselink2;
    }

    public String getCourselink3() {
        return courselink3;
    }

    public void setCourselink3(String courselink3) {
        this.courselink3 = courselink3;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Course other = (Course) that;
        return (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getCoursename() == null ? other.getCoursename() == null : this.getCoursename().equals(other.getCoursename()))
            && (this.getCourselink1() == null ? other.getCourselink1() == null : this.getCourselink1().equals(other.getCourselink1()))
            && (this.getCourselink2() == null ? other.getCourselink2() == null : this.getCourselink2().equals(other.getCourselink2()))
            && (this.getCourselink3() == null ? other.getCourselink3() == null : this.getCourselink3().equals(other.getCourselink3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getCoursename() == null) ? 0 : getCoursename().hashCode());
        result = prime * result + ((getCourselink1() == null) ? 0 : getCourselink1().hashCode());
        result = prime * result + ((getCourselink2() == null) ? 0 : getCourselink2().hashCode());
        result = prime * result + ((getCourselink3() == null) ? 0 : getCourselink3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseid=").append(courseid);
        sb.append(", coursename=").append(coursename);
        sb.append(", courselink1=").append(courselink1);
        sb.append(", courselink2=").append(courselink2);
        sb.append(", courselink3=").append(courselink3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}