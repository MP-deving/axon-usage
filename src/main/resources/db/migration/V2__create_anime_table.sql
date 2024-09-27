CREATE TABLE IF NOT EXISTS animes
(
    id
    UUID
    PRIMARY
    KEY,
    name
    VARCHAR
(
    100
) NOT NULL,
    genre VARCHAR
(
    100
) NOT NULL,
    episodes INTEGER NOT NULL
    );