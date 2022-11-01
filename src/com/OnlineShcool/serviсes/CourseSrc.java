package com.OnlineScool.serviсes;

import com.OnlineScool.models.Course;

public class CourseSrc {
    CourseSrc courseSrc = new CourseSrc();
    public Course courseCreation(String course_Name) {
        return new Course(course_Name);
    }

}
