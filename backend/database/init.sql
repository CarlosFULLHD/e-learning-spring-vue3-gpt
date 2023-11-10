
CREATE TABLE Users (
    id_user serial NOT NULL,
    username varchar(150) UNIQUE NOT NULL,
    email varchar(150) UNIQUE NOT NULL,
    role varchar(50) NOT NULL, -- Could be 'student', 'instructor', or 'admin'
    CONSTRAINT Users_pk PRIMARY KEY (id_user)
);

-- Subjects Table
CREATE TABLE Subjects (
    id_subject serial NOT NULL,
    img_link varchar(250),
    title_subject varchar(250),
    description_subject varchar(250),
    welcome_text varchar(250),
    importance varchar(250),
    intended_for varchar(250),
    learnings_fromthis_subject varchar(250),
    roadmap_img varchar(250),
    CONSTRAINT Subjects_pk PRIMARY KEY (id_subject)
);

-- Modules Table
CREATE TABLE Modules (
    id_module serial NOT NULL,
    id_subject int,
    module_name varchar(250),
    CONSTRAINT Modules_pk PRIMARY KEY (id_module),
    CONSTRAINT Modules_Subjects_fk FOREIGN KEY (id_subject) REFERENCES Subjects (id_subject)
);

-- Lessons Table
CREATE TABLE Lessons (
    id_lesson serial NOT NULL,
    id_module int,
    lesson_name varchar(250),
    link_ytvideo varchar(250),
    description_lesson varchar(250),
    CONSTRAINT Lessons_pk PRIMARY KEY (id_lesson),
    CONSTRAINT Lessons_Modules_fk FOREIGN KEY (id_module) REFERENCES Modules (id_module)
);

-- Resources Table
CREATE TABLE Resources (
    id_resource serial NOT NULL,
    id_subject int NOT NULL,
    resource_type varchar(250),
    resource_name varchar(250),
    resource_link varchar(250),
    resource_img varchar(250),
    CONSTRAINT Resources_pk PRIMARY KEY (id_resource),
    CONSTRAINT Resources_Subjects_fk FOREIGN KEY (id_subject) REFERENCES Subjects (id_subject)
);

-- Enrollments Table
CREATE TABLE Enrollments (
    id_enrollment serial NOT NULL,
    id_user int NOT NULL,
    id_subject int NOT NULL,
    enrollment_date date NOT NULL,
    CONSTRAINT Enrollments_pk PRIMARY KEY (id_enrollment),
    CONSTRAINT Enrollments_Users_fk FOREIGN KEY (id_user) REFERENCES Users (id_user),
    CONSTRAINT Enrollments_Subjects_fk FOREIGN KEY (id_subject) REFERENCES Subjects (id_subject)
);

-- ChatInteractions Table
CREATE TABLE ChatInteractions (
    id_chat_interaction serial NOT NULL,
    id_user int NOT NULL,
    interaction_time timestamp NOT NULL,
    user_question text NOT NULL,
    gpt_response text NOT NULL,
    CONSTRAINT ChatInteractions_pk PRIMARY KEY (id_chat_interaction),
    CONSTRAINT ChatInteractions_Users_fk FOREIGN KEY (id_user) REFERENCES Users (id_user)
);

-- Assessments Table
CREATE TABLE Assessments (
    id_assessment serial NOT NULL,
    id_lesson int NOT NULL,
    assessment_description text NOT NULL,
    CONSTRAINT Assessments_pk PRIMARY KEY (id_assessment),
    CONSTRAINT Assessments_Lessons_fk FOREIGN KEY (id_lesson) REFERENCES Lessons (id_lesson)
);

-- AssessmentResults Table
CREATE TABLE AssessmentResults (
    id_assessment_result serial NOT NULL,
    id_assessment int NOT NULL,
    id_user int NOT NULL,
    score numeric NOT NULL,
    assessment_date timestamp NOT NULL,
    CONSTRAINT AssessmentResults_pk PRIMARY KEY (id_assessment_result),
    CONSTRAINT AssessmentResults_Assessments_fk FOREIGN KEY (id_assessment) REFERENCES Assessments (id_assessment),
    CONSTRAINT AssessmentResults_Users_fk FOREIGN KEY (id_user) REFERENCES Users (id_user)
);

-- Feedback Table
CREATE TABLE Feedback (
    id_feedback serial NOT NULL,
    id_lesson int NOT NULL,
    id_user int NOT NULL,
    feedback_text text NOT NULL,
    feedback_date timestamp NOT NULL,
    CONSTRAINT Feedback_pk PRIMARY KEY (id_feedback),
    CONSTRAINT Feedback_Lessons_fk FOREIGN KEY (id_lesson) REFERENCES Lessons (id_lesson),
    CONSTRAINT Feedback_Users_fk FOREIGN KEY (id_user) REFERENCES Users (id_user)
);
