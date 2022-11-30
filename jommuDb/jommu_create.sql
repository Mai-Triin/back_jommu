-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-30 09:46:52.385

-- tables
-- Table: athlete_trainer
CREATE TABLE athlete_trainer (
                                 id serial  NOT NULL,
                                 trainer_user_id int  NOT NULL,
                                 athlete_user_id int  NOT NULL,
                                 CONSTRAINT athlete_trainer_pk PRIMARY KEY (id)
);

-- Table: exercise
CREATE TABLE exercise (
                          id serial  NOT NULL,
                          workout_plan_id int  NOT NULL,
                          exercise_template_id int  NOT NULL,
                          reps int  NOT NULL,
                          sets int  NOT NULL,
                          weight int  NOT NULL,
                          status char(1)  NOT NULL DEFAULT 'A',
                          CONSTRAINT exercise_pk PRIMARY KEY (id)
);

-- Table: exercise_history
CREATE TABLE exercise_history (
                                  id serial  NOT NULL,
                                  workout_plan_id int  NOT NULL,
                                  exercise_id int  NOT NULL,
                                  name varchar(255)  NOT NULL,
                                  reps int  NOT NULL,
                                  sets int  NOT NULL,
                                  weight int  NOT NULL,
                                  date date  NOT NULL,
                                  status char(1)  NOT NULL DEFAULT 'A',
                                  CONSTRAINT exercise_history_pk PRIMARY KEY (id)
);

-- Table: exercise_template
CREATE TABLE exercise_template (
                                   id serial  NOT NULL,
                                   name varchar(255)  NOT NULL,
                                   description text  NOT NULL,
                                   img_data bytea  NOT NULL,
                                   CONSTRAINT exercise_template_pk PRIMARY KEY (id)
);

-- Table: exercise_template_muscle_group
CREATE TABLE exercise_template_muscle_group (
                                                id serial  NOT NULL,
                                                exercise_template_id int  NOT NULL,
                                                muscle_group_id int  NOT NULL,
                                                CONSTRAINT exercise_template_muscle_group_pk PRIMARY KEY (id)
);

-- Table: muscle_group
CREATE TABLE muscle_group (
                              id serial  NOT NULL,
                              name varchar(255)  NOT NULL,
                              CONSTRAINT muscle_group_pk PRIMARY KEY (id)
);

-- Table: profile
CREATE TABLE profile (
                         id serial  NOT NULL,
                         first_name varchar(255)  NOT NULL,
                         last_name varchar(255)  NOT NULL,
                         date_of_birth date  NOT NULL,
                         gender char(1)  NOT NULL,
                         email varchar(255)  NOT NULL,
                         terms_accept boolean  NOT NULL,
                         CONSTRAINT profile_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
                      id serial  NOT NULL,
                      type varchar(50)  NOT NULL,
                      CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        role_id int  NOT NULL,
                        profile_id int  NOT NULL,
                        username varchar(50)  NOT NULL,
                        password varchar(50)  NOT NULL,
                        CONSTRAINT user_ak_1 UNIQUE (username) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- Table: workout_plan
CREATE TABLE workout_plan (
                              id serial  NOT NULL,
                              name varchar(255)  NOT NULL,
                              user_id int  NOT NULL,
                              status char(1)  NOT NULL DEFAULT 'A',
                              CONSTRAINT workout_plan_pk PRIMARY KEY (id)
);

-- Table: workout_plan_history
CREATE TABLE workout_plan_history (
                                      id serial  NOT NULL,
                                      workout_plan_id int  NOT NULL,
                                      date date  NOT NULL,
                                      time_start timestamp  NOT NULL,
                                      time_end timestamp  NOT NULL,
                                      status char(1)  NOT NULL DEFAULT 'A',
                                      CONSTRAINT workout_plan_history_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: athlete_user_id (table: athlete_trainer)
ALTER TABLE athlete_trainer ADD CONSTRAINT athlete_user_id
    FOREIGN KEY (athlete_user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: exercise_exercise_template (table: exercise)
ALTER TABLE exercise ADD CONSTRAINT exercise_exercise_template
    FOREIGN KEY (exercise_template_id)
        REFERENCES exercise_template (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: exercise_history_exercise (table: exercise_history)
ALTER TABLE exercise_history ADD CONSTRAINT exercise_history_exercise
    FOREIGN KEY (exercise_id)
        REFERENCES exercise (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: exercise_history_workout_plan (table: exercise_history)
ALTER TABLE exercise_history ADD CONSTRAINT exercise_history_workout_plan
    FOREIGN KEY (workout_plan_id)
        REFERENCES workout_plan (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: exercise_template_muscle_group_exercise_template (table: exercise_template_muscle_group)
ALTER TABLE exercise_template_muscle_group ADD CONSTRAINT exercise_template_muscle_group_exercise_template
    FOREIGN KEY (exercise_template_id)
        REFERENCES exercise_template (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: exercise_template_muscle_group_muscle_group (table: exercise_template_muscle_group)
ALTER TABLE exercise_template_muscle_group ADD CONSTRAINT exercise_template_muscle_group_muscle_group
    FOREIGN KEY (muscle_group_id)
        REFERENCES muscle_group (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: exercise_workout_plan (table: exercise)
ALTER TABLE exercise ADD CONSTRAINT exercise_workout_plan
    FOREIGN KEY (workout_plan_id)
        REFERENCES workout_plan (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: trainer_user_id (table: athlete_trainer)
ALTER TABLE athlete_trainer ADD CONSTRAINT trainer_user_id
    FOREIGN KEY (trainer_user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_profile (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_profile
    FOREIGN KEY (profile_id)
        REFERENCES profile (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_role
    FOREIGN KEY (role_id)
        REFERENCES role (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: workout_plan_history_workout_plan (table: workout_plan_history)
ALTER TABLE workout_plan_history ADD CONSTRAINT workout_plan_history_workout_plan
    FOREIGN KEY (workout_plan_id)
        REFERENCES workout_plan (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: workout_plan_user (table: workout_plan)
ALTER TABLE workout_plan ADD CONSTRAINT workout_plan_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

