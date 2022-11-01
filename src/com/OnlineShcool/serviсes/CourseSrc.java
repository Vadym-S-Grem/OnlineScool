package com.OnlineShcool.serviсes;

import com.OnlineShcool.models.Course;

public class CourseSrc {
    CourseSrc courseSrc = new CourseSrc();
    public Course courseCreation(String course_Name) {
        return new Course(course_Name);
    }

}
