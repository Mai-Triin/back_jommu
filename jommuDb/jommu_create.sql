-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-22 11:43:40.329

-- tables
-- Table: birth_date
CREATE TABLE birth_date (
                            id serial  NOT NULL,
                            birth_day int  NOT NULL,
                            birth_month int  NOT NULL,
                            birth_year int  NOT NULL,
                            CONSTRAINT birth_date_pk PRIMARY KEY (id)
);

-- Table: customer
CREATE TABLE customer (
                          id serial  NOT NULL,
                          user_id int  NOT NULL,
                          birth_date_id int  NOT NULL,
                          first_name varchar(255)  NOT NULL,
                          last_name varchar(255)  NOT NULL,
                          email varchar(50)  NOT NULL,
                          CONSTRAINT customer_pk PRIMARY KEY (id)
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
                        username varchar(50)  NOT NULL,
                        password varchar(50)  NOT NULL,
                        role_id int  NOT NULL,
                        CONSTRAINT user_ak_1 UNIQUE (username) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: customer_birth_date (table: customer)
ALTER TABLE customer ADD CONSTRAINT customer_birth_date
    FOREIGN KEY (birth_date_id)
        REFERENCES birth_date (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: customer_user (table: customer)
ALTER TABLE customer ADD CONSTRAINT customer_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        ON DELETE  CASCADE
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

-- End of file.

