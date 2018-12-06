/*******************************************************************************
   Create Tables
********************************************************************************/

CREATE TABLE DEV_BLOG_ENTRY(
    DEV_BLOG_ENTRY_ID NUMBER,
    DEV_ENTRY VARCHAR2(1000),
    ENTRY_DATE DATE,
    PUBLISHED VARCHAR2(1),
    CONSTRAINT pk_dev_blog_entry PRIMARY KEY ( DEV_BLOG_ENTRY_ID )
);
CREATE TABLE DEV_BLOG_LINK(
    DEV_BLOG_LINK_ID NUMBER,
    DEV_BLOG_LINK VARCHAR2(100),
    CONSTRAINT pk_dev_blog_link PRIMARY KEY ( DEV_BLOG_LINK_ID )
);

CREATE TABLE PER_BLOG_ENTRY(
    PER_BLOG_ENTRY_ID NUMBER,
    PER_BLOG_ENTRY VARCHAR2(1000),
    ENTRY_DATE DATE,
    PUBLISHED VARCHAR2(1),
    CONSTRAINT pk_per_blog_entry PRIMARY KEY ( PER_BLOG_ENTRY_ID )
);

CREATE TABLE PER_BLOG_PIC(
    PER_BLOG_PIC_ID NUMBER,
    PER_BLOG_ENTRY_ID NUMBER,
    PER_BLOG_PIC VARCHAR2(100),
    CONSTRAINT pk_per_blog_pic PRIMARY KEY ( PER_BLOG_PIC_ID )
);
/*******************************************************************************
   Create Foreign Keys
********************************************************************************/

ALTER TABLE DEV_BLOG_LINK
    ADD CONSTRAINT fk_dev_blog_link_id FOREIGN KEY ( DEV_BLOG_ENTRY_ID )
        REFERENCES DEV_BLOG_ENTRY( DEV_BLOG_ENTRY_ID );

ALTER TABLE PER_BLOG_PIC
    ADD CONSTRAINT fk_blog_pic_id FOREIGN KEY ( PER_BLOG_ENTRY_ID )
        REFERENCES PER_BLOG_ENTRY ( PER_BLOG_ENTRY_ID );
/*******************************************************************************
   Create Sequences
********************************************************************************/

CREATE SEQUENCE dev_blog_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE dev_blog_link_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE per_blog_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE SEQUENCE per_blog_pic_seq START WITH 1000 INCREMENT BY 1 NOCACHE NOCYCLE;
/*******************************************************************************
   Create Triggers
********************************************************************************/

CREATE OR REPLACE TRIGGER dev_blog_id_trigger BEFORE
    INSERT ON DEV_BLOG_ENTRY
    FOR EACH ROW
DECLARE
    new_dev_blog_id   NUMBER;
BEGIN
    new_dev_blog_id := dev_blog_seq.nextval;
    SELECT
        new_dev_blog_id
    INTO :new.DEV_BLOG_ENTRY_ID
    FROM
        dual;

END;
/

CREATE OR REPLACE TRIGGER dev_blog_entry_id_trigger BEFORE
    INSERT ON DEV_BLOG_LINK
    FOR EACH ROW
DECLARE
    new_dev_blog_link_id   NUMBER;
BEGIN
    new_dev_blog_link_id := dev_blog_link_seq.nextval;
    SELECT
        new_dev_blog_link_id
    INTO :new.DEV_BLOG_LINK_ID
    FROM
        dual;

END;
/

CREATE OR REPLACE TRIGGER per_blog_id_trigger BEFORE
    INSERT ON PER_BLOG_ENTRY
    FOR EACH ROW
DECLARE
    new_per_blog_entry_id   NUMBER;
BEGIN
    new_per_blog_entry_id := per_blog_seq.nextval;
    SELECT
        new_per_blog_entry_id
    INTO :new.PER_BLOG_ENTRY_ID
    FROM
        dual;

END;
/

CREATE OR REPLACE TRIGGER per_blog_pic_id_trigger BEFORE
    INSERT ON PER_BLOG_PIC
    FOR EACH ROW
DECLARE
    new_per_blog_pic_id   NUMBER;
BEGIN
    new_per_blog_pic_id := per_blog_pic_seq.nextval;
    SELECT
        new_per_blog_pic_id 
    INTO :new.PER_BLOG_PIC_ID
    FROM
        dual;

END;
/
/*******************************************************************************
   Alter Tables
********************************************************************************/
ALTER TABLE DEV_BLOG_LINK ADD (
    DEV_BLOG_ENTRY_ID NUMBER
);

ALTER TABLE per_blog_pic MODIFY (
    PER_BLOG_PIC   VARCHAR2(200)
);

ALTER TABLE dev_blog_link MODIFY (
    DEV_BLOG_LINK   VARCHAR2(200)
);