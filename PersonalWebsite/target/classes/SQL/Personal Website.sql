/*******************************************************************************
   Create Tables
********************************************************************************/
CREATE TABLE skills (
    skills_id     NUMBER,
    description   VARCHAR2(20),
    lvl           VARCHAR(20),
    skill_type    VARCHAR2(20),
    CONSTRAINT pk_skills PRIMARY KEY ( skills_id )
);

CREATE TABLE projects (
    projects_id       NUMBER,
    description       VARCHAR2(200),
    connection        VARCHAR2(20),
    connection_type   VARCHAR2(20),
    CONSTRAINT pk_projects PRIMARY KEY ( projects_id )
);

CREATE TABLE project_skills (
    project_skills_id   NUMBER,
    projects_id         NUMBER,
    skills_id           NUMBER,
    CONSTRAINT pk_projects_skills PRIMARY KEY ( projects_skills_id )
);

CREATE TABLE work_history (
    work_history_id   NUMBER,
    start_month       VARCHAR2(20),
    end_month         VARCHAR2(20),
    title             VARCHAR2(20),
    CONSTRAINT pk_work_history_skills PRIMARY KEY ( work_history_id )
);

CREATE TABLE education (
    education_id   NUMBER,
    major          VARCHAR2(20),
    start_month    VARCHAR(20),
    end_month      VARCHAR2(20),
    CONSTRAINT pk_education PRIMARY KEY ( education_id )
);

/*******************************************************************************
   Create Foreign Keys
********************************************************************************/

ALTER TABLE project_skills
    ADD CONSTRAINT fk_projects_skills_id FOREIGN KEY ( projects_id )
        REFERENCES projects ( projects_id );

ALTER TABLE project_skills
    ADD CONSTRAINT fk_skills_projects_id FOREIGN KEY ( skills_id )
        REFERENCES skills ( skills_id );

/*******************************************************************************
   Create Sequences
********************************************************************************/

CREATE SEQUENCE skills_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE projects_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE projects_skills_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE work_history_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE education_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE; 
/*******************************************************************************
   Create Triggers
********************************************************************************/

CREATE OR REPLACE TRIGGER skills_id_trigger BEFORE
    INSERT ON skills
    FOR EACH ROW
DECLARE
    new_user_id   NUMBER;
BEGIN
    new_skills_id := user_id_sequence.nextval;
    SELECT
        new_skills_id
    INTO :new.skills_id
    FROM
        dual;

END;
/

CREATE OR REPLACE TRIGGER projects_id_trigger BEFORE
    INSERT ON projects
    FOR EACH ROW
DECLARE
    new_projects_id   NUMBER;
BEGIN
    new_projects_id := projects_id_sequence.nextval;
    SELECT
        new_projects_id
    INTO :new.projects_id
    FROM
        dual;

END;
/

CREATE OR REPLACE TRIGGER projects_skills_id_trigger BEFORE
    INSERT ON projects_skills
    FOR EACH ROW
DECLARE
    new_projects_skills_id   NUMBER;
BEGIN
    new_projects_skills_id := projects_skills_id_sequence.nextval;
    SELECT
        new_projects_skills_id
    INTO :new.projects_id
    FROM
        dual;

END;
/

CREATE OR REPLACE TRIGGER work_history_id_trigger BEFORE
    INSERT ON work_history
    FOR EACH ROW
DECLARE
    new_work_history_id   NUMBER;
BEGIN
    new_work_history_id := work_history_id_sequence.nextval;
    SELECT
        new_work_history_id
    INTO :new.work_history_id
    FROM
        dual;

END;
/

CREATE OR REPLACE TRIGGER education_id_trigger BEFORE
    INSERT ON education
    FOR EACH ROW
DECLARE
    new_education_id   NUMBER;
BEGIN
    new_education_id := education_id_sequence.nextval;
    SELECT
        new_education_id
    INTO :new.education_id
    FROM
        dual;

END;
/

/*******************************************************************************
   Alter Tables
********************************************************************************/

ALTER TABLE work_history ADD (
    start_year   NUMBER,
    end_year     NUMBER
);

ALTER TABLE education ADD (
    start_year   NUMBER,
    end_year     NUMBER
);

ALTER TABLE education ADD (
    SCHOOL   VARCHAR2(30)
);

ALTER TABLE education MODIFY (
    SCHOOL   VARCHAR2(60)
);