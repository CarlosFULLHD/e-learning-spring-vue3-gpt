-- Data base for e learning app
-- tables
-- Table: Lessons
CREATE TABLE Lessons (
    id_lesson serial  NOT NULL,
    id_module int  NULL,
    lesson_name varchar(250)  NULL,
    link_ytvideo varchar(250)  NULL,
    description_lesson varchar(250)  NULL,
    CONSTRAINT Lessons_pk PRIMARY KEY (id_lesson)
);

-- Table: Modules
CREATE TABLE Modules (
    id_module serial  NOT NULL,
    id_subject int  NULL,
    module_name varchar(250)  NULL,
    CONSTRAINT Modules_pk PRIMARY KEY (id_module)
);

-- Table: Resources
CREATE TABLE Resources (
    id_resource serial  NOT NULL,
    id_subject int  NOT NULL,
    resource_type varchar(250)  NULL,
    resource_name varchar(250)  NULL,
    resource_link varchar(250)  NULL,
    resource_img varchar(250)  NULL,
    CONSTRAINT Resources_pk PRIMARY KEY (id_resource)
);

-- Table: Subjects
CREATE TABLE Subjects (
    id_subject serial  NOT NULL,
    img_link varchar(250)  NULL,
    title_subject varchar(250)  NULL,
    description_subject varchar(250)  NULL,
    welcome_text varchar(250)  NULL,
    importance varchar(250)  NULL,
    intended_for varchar(250)  NULL,
    learnings_fromthis_subject varchar(250)  NULL,
    roadmap_img varchar(250)  NULL,
    CONSTRAINT Subjects_pk PRIMARY KEY (id_subject)
);

-- foreign keys
-- Reference: FK_0 (table: Modules)
ALTER TABLE Modules ADD CONSTRAINT FK_0
    FOREIGN KEY (id_subject)
    REFERENCES Subjects (id_subject)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: FK_1 (table: Lessons)
ALTER TABLE Lessons ADD CONSTRAINT FK_1
    FOREIGN KEY (id_module)
    REFERENCES Modules (id_module)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Resources_Subjects (table: Resources)
ALTER TABLE Resources ADD CONSTRAINT Resources_Subjects
    FOREIGN KEY (id_subject)
    REFERENCES Subjects (id_subject)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;


