--liquibase formatted sql
--changeset lucas:202508291735
--comment: boards table create

CREATE TABLE BOARDS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
) ENGINE=InnoDB

--rollback DROP TABLE BOARDS