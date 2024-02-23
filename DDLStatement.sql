CREATE TABLE admin (
    officeloc VARCHAR2(30),
    phoneno   VARCHAR2(15),
    adminid   INTEGER NOT NULL
);

ALTER TABLE admin ADD CONSTRAINT admin_pk PRIMARY KEY ( adminid );

CREATE TABLE department (
    deptid INTEGER NOT NULL,
    name   VARCHAR2(30),
    loc    VARCHAR2(30)
);

ALTER TABLE department ADD CONSTRAINT department_pk PRIMARY KEY ( deptid );

CREATE TABLE event (
    eventid INTEGER NOT NULL,
    name    VARCHAR2(30) NOT NULL,
    loc     VARCHAR2(30),
    "Date"  DATE,
    time    VARCHAR2(20)
);

ALTER TABLE event ADD CONSTRAINT event_pk PRIMARY KEY ( eventid );

CREATE TABLE organize (
    profid  INTEGER NOT NULL,
    eventid INTEGER NOT NULL
);

ALTER TABLE organize ADD CONSTRAINT organize_pk PRIMARY KEY ( profid,
                                                              eventid );

CREATE TABLE professor (
    officeloc VARCHAR2(30),
    phoneno   VARCHAR2(15),
    deptid    INTEGER NOT NULL,
    profid    INTEGER NOT NULL
);

ALTER TABLE professor ADD CONSTRAINT professor_pk PRIMARY KEY ( profid );

CREATE TABLE register (
    studid           INTEGER NOT NULL,
    eventid          INTEGER NOT NULL,
    registrationdate DATE
);

ALTER TABLE register ADD CONSTRAINT register_pk PRIMARY KEY ( studid,
                                                              eventid );

CREATE TABLE student (
    major    VARCHAR2(20) NOT NULL,
    standing VARCHAR2(20) NOT NULL,
    studid   INTEGER NOT NULL
);

ALTER TABLE student ADD CONSTRAINT student_pk PRIMARY KEY ( studid );

CREATE TABLE "USER" (
    userid   INTEGER NOT NULL,
    username VARCHAR2(20) NOT NULL,
    fname    VARCHAR2(30),
    lname    VARCHAR2(30),
    password VARCHAR2(25) NOT NULL,
    email    VARCHAR2(20),
    usertype INTEGER NOT NULL
);

ALTER TABLE "USER" ADD CONSTRAINT user_pk PRIMARY KEY ( userid );

ALTER TABLE admin
    ADD CONSTRAINT admin_user_fk FOREIGN KEY ( adminid )
        REFERENCES "USER" ( userid );

ALTER TABLE organize
    ADD CONSTRAINT organize_event_fk FOREIGN KEY ( eventid )
        REFERENCES event ( eventid );

ALTER TABLE organize
    ADD CONSTRAINT organize_professor_fk FOREIGN KEY ( profid )
        REFERENCES professor ( profid );

ALTER TABLE professor
    ADD CONSTRAINT professor_department_fk FOREIGN KEY ( deptid )
        REFERENCES department ( deptid );

ALTER TABLE professor
    ADD CONSTRAINT professor_user_fk FOREIGN KEY ( profid )
        REFERENCES "USER" ( userid );

ALTER TABLE register
    ADD CONSTRAINT register_event_fk FOREIGN KEY ( eventid )
        REFERENCES event ( eventid );

ALTER TABLE register
    ADD CONSTRAINT register_student_fk FOREIGN KEY ( studid )
        REFERENCES student ( studid );

ALTER TABLE student
    ADD CONSTRAINT student_user_fk FOREIGN KEY ( studid )
        REFERENCES "USER" ( userid );

CREATE TABLE log (
    userID INTEGER,
    username VARCHAR2(20),
    action VARCHAR2(100),
    time TIMESTAMP
);
