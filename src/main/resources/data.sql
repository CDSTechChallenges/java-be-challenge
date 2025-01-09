-- authors
INSERT INTO authors (id, name, created_at, updated_at) VALUES (1, 'Adrian Swift', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (2, 'Jessie Mosciski', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (3, 'Mandie Huels DDS', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (4, 'George Dietrich', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (5, 'Brant Krajcik', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (6, 'Hilaria Rempel', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (7, 'Emory Hodkiewicz', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (8, 'Madelyn Rempel II', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (9, 'Oren Predovic', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO authors (id, name, created_at, updated_at) VALUES (10, 'Al Walsh', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

-- posts
INSERT INTO posts (id, author_id, title, content, created_at, updated_at) VALUES (1, 2, 'title 1', 'powder only rich main tiny orange apartment spent appearance sad room running shout student article string pony whale actual care fort below job planet', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO posts (id, author_id, title, content, created_at, updated_at) VALUES (2, 1, 'title 2', 'they kitchen anything composition loose closely vertical enough finest speak supply friend whenever produce boy location pipe land feel expect dinner write eaten officer', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO posts (id, author_id, title, content, created_at, updated_at) VALUES (3, 3, 'title 3', 'solar then machine sort right actual garden purple proud if position trail north music talk dropped has clay driver balloon magic deeply shaking view', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO posts (id, author_id, title, content, created_at, updated_at) VALUES (4, 3, 'title 4', 'can certain becoming quite wise himself truck mix plates fireplace radio importance find color which calm look doll tape today flower branch shine bring', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO posts (id, author_id, title, content, created_at, updated_at) VALUES (5, 1, 'title 5', 'quickly difficult middle then whispered general laid gentle breath liquid smell average serve notice stay glad thank local electricity began partly broad forgotten living', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

-- favorites
INSERT INTO favorites (id, author_id, post_id, created_at, updated_at) VALUES (1, 2, 1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO favorites (id, author_id, post_id, created_at, updated_at) VALUES (2, 3, 2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO favorites (id, author_id, post_id, created_at, updated_at) VALUES (3, 4, 2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO favorites (id, author_id, post_id, created_at, updated_at) VALUES (4, 1, 3, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
